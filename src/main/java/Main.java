import panels.*;

import java.awt.*;

/*
The Main class is used to create a JFrame which has the main container
for holding the panels.ButtonIDContainer and panels.VideoFramesContainer
*/

public class Main {
    static GraphicsConfiguration gc;

    public static void main(String[] args) {
        PageHandler pageHandler = new PageHandler();
        pageHandler.add(new UserPage());
        pageHandler.revalidate();
        pageHandler.repaint();

        while(pageHandler.isActive() || !pageHandler.isAlwaysOnTop()){
            boolean flag1 = UserPage.getUserFlag();
            boolean flag2 = LandingPage.getLandingFlag();
            boolean flag3 = ButtonPanel.getBackFlag();
            boolean flag4 = VideoPanel.getDrawFlag();

            if(flag4){
                pageHandler.repaint();
                VideoPanel.setDrawFlag(false);
            }

            if(flag1){
                pageHandler.getContentPane().removeAll();
                pageHandler.add(new LandingPage());
                pageHandler.revalidate();
                pageHandler.repaint();
                UserPage.setUserFlag(false);
            }
            else if(flag2){
                pageHandler.getContentPane().removeAll();
                pageHandler.add(new TrackingPage());
                pageHandler.revalidate();
                pageHandler.repaint();
                LandingPage.setLandingFlag(false);
            }
            else if(flag3){
                pageHandler.getContentPane().removeAll();
                pageHandler.add(new LandingPage());
                pageHandler.revalidate();
                pageHandler.repaint();
                IDPanel idPanel;
                idPanel = new IDPanel();
                ButtonPanel.setIDPanel(idPanel);
                ButtonPanel.setBackFlag(false);
            }
        }
    }
}
