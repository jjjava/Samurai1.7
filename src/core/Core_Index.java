/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import interfaces.Main;

/**
 *
 * @author Hudson
 */
public class Core_Index implements Runnable
{
    private Thread runner;
    private boolean running;
    private Main main;
    
    public Core_Index(Main main)
    {
        running = true;
        this.main = main;
    }
    public void start()
    {
        runner = new Thread(this);
        runner.setPriority(Thread.MAX_PRIORITY);
        runner.start();
//        main.lb_status.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Ball (Green).png")));
//        main.lb_status.setText("Indexando...");
    }
    public void stop()
    {
        running = false;
        runner  = null;
//        main.lb_status.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Ball (Red).png")));
//        main.lb_status.setText("Parado");
        main.relaodStatus();
    }
    @Override
    public void run() 
    {
        hslEngine_File_Crawler crawler = new hslEngine_File_Crawler();
        while(running)
        {
            try
            {
                running = (!crawler.Crawler());
                if(!running)
                {
                    System.gc();
                    stop();  
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
