package com.think1.java07.logging;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.*;

/**
 * @Classname LoggingImageViewer
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/18 15:31
 * @Created by deer-li
 */

public class LoggingImageViewer {
    public static void main(String[] args) {
        if (System.getProperty("java.util.logging.config.class")==null&&
                System.getProperty("java.util.logging.config.file")==null){
            try {
                Logger.getLogger("com.think1.java07").setLevel(Level.ALL);
                final int LOG_ROTATION_COUNT=10;
                FileHandler handler = new FileHandler("%h/LoggingImageViewer.log", 0, LOG_ROTATION_COUNT);
                Logger.getLogger("com.think1.java07").addHandler(handler);
            } catch (IOException e) {
                Logger.getLogger("com.think1.java07").log(Level.SEVERE,"Can't create log file handler",e);
            }
        }
        EventQueue.invokeLater(()->
        {
            WindowHandler windowHandler = new WindowHandler();
            windowHandler.setLevel(Level.ALL);
            Logger.getLogger("com.think1.java07").addHandler(windowHandler);
            ImageViewerFrame f = new ImageViewerFrame();
            f.setTitle("LoggingImageViewer");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Logger.getLogger("com.think1.java07").fine("Showing frame");
            f.setVisible(true);
        });
    }
}
class ImageViewerFrame extends JFrame{
    private static final int DEFAULT_WIDTH=300;
    private static final int DEFAULT_HEIGHT=300;
    private JLabel label;
    private static Logger logger= Logger.getLogger("com.think1.java07");
    public ImageViewerFrame(){
        logger.entering("ImageViewerFrame","<init>");
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu menu = new JMenu("File");
        menuBar.add(menu);
        JMenuItem openItem = new JMenuItem();
        menu.add(openItem);
        openItem.addActionListener(new FileOpenListener());
        JMenuItem exitItem = new JMenuItem("exit");
        menu.add(exitItem);
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logger.fine("Exiting.");
                System.exit(0);
            }
        });
        label=new JLabel();
        add(label);
        logger.exiting("ImageViewerFrame","<init>");
    }
    private class FileOpenListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            logger.entering("ImageViewFrame.FileOpenListener","actionPerformed",e);
            JFileChooser c = new JFileChooser();
            c.setCurrentDirectory(new File("."));
            c.setFileFilter(new javax.swing.filechooser.FileFilter(){
                @Override
                public boolean accept(File f) {
                    return f.getName().toLowerCase().endsWith(".gif")||f.isDirectory();
                }
                public String getDescription(){
                    return "GIF Images";
                }
            });
            int r = c.showOpenDialog(ImageViewerFrame.this);
            if (r==JFileChooser.APPROVE_OPTION){
                String name = c.getSelectedFile().getPath();
                logger.log(Level.FINE,"Reading file{0}",name);
                label.setIcon(new ImageIcon(name));
            }else logger.fine("File open dialog canceled");
            logger.exiting("ImageViewFrame.FileOpenListener","actionPerformed");
        }
    }
}

class WindowHandler extends StreamHandler{
    private JFrame frame;
    public WindowHandler(){
        frame=new JFrame();
        JTextArea output = new JTextArea();
        output.setEditable(false);
        frame.setSize(300,300);
        frame.add(new JScrollPane(output));
        frame.setFocusableWindowState(false);
        frame.setVisible(true);
        setOutputStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException {
            }
            @Override
            public void write(byte[] b, int off, int len) throws IOException {
                output.append(new String(b,off,len));
            }
        });
    }
    public void publish(LogRecord record){
        if (!frame.isVisible()) return;
        super.publish(record);
        flush();
    }
}
