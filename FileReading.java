import java.io.*;
import java.util.*;

class JPL
{
    String team;
    int p;
    int w;
    int l;
    int t;
    public JPL(String team, int p, int w, int l, int t)
    {
        this.team=team;
        this.p=p;
        this.w=w;
        this.l=l;
        this.t=t;
    }
    public String getTeam() { return team; }
    public int getGames() { return p; }
    public int getWins() { return w; }
    public int getLosses() { return l; }
    public int getTies() { return t; }
    public void setTeam(String team) { this.team = team; }
    public void setGames(int p) { this.p = p; }
    public void setWins(int w) { this.w = w; }
    public void setLosses(int l) { this.l = l; }
    public void setTies(int t) { this.t = t; }
    public String toString()
    {
        return  "team= " + team + "\tp=" + p + "\tw=" + w + "\tl=" + l + "\tt=" + t;
    }
}

class FileReading extends Thread
{
    static List<JPL> JPLstats=new ArrayList<>();
    static List<JPL> stats=new ArrayList<JPL>();
    static int teamCount=0;
    String threadName;
    Thread t;
    FileReading(String name)
    {
        threadName=name;
        t=new Thread(this, threadName);
        t.start();
    }
    static synchronized void display(String name)
    {
        if (name=="Thread1")
        {
            System.out.println("\n\nThread1 running...");
            try
            {
                int min=100;
                String minTeam;
                for(int i=0; i<teamCount/2; i++)
                {
                    if (min>stats.get(i).getWins())
                    {
                        min=stats.get(i).getWins();
                        minTeam=stats.get(i).getTeam();
                        System.out.println(minTeam);
                    }
                }
                System.out.println("Minimum Wins: "+min);
                System.out.print("Team with minimum wins: ");
                for (int i=0; i<teamCount/2; i++)
                {
                    if (stats.get(i).getWins()==min)
                    {
                        System.out.print(stats.get(i).getTeam()+" ");
                    }
                }
            }
            catch (Exception e)
            {
                System.out.println(e);
            }  
        }
        else
        {
            System.out.println("\n\nThread2 running...");
            Boolean flag=false;
            System.out.print("Teams with exactly 44 points: ");
            for (int i=0; i<teamCount/2; i++)
            {
                if (stats.get(i).getWins()==22)
                {
                    flag=true;
                    System.out.print(stats.get(i).getTeam()+" ");
                }
            }
            if (flag==false)
            {
                System.out.print("None\n");
            }
        }
    }
    public void run()
    {
        display(Thread.currentThread().getName());
    }
    public static void main(String[] args) throws InterruptedException
    {
        String data="";
        try(FileInputStream fis=new FileInputStream("JPL.txt"))
        {
            DataInputStream dis=new DataInputStream(fis);
            int c;
            while((c=dis.read())!=-1)
            {
                data+=(char)c;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        for(int i=0; i<data.length(); i++)
        {
            String team="";
            char s1=data.charAt(i);
            char s2=data.charAt(i+1);
            char s3=data.charAt(i+2);
            if (s3=='0')
            {
                team+=s1;
                team+=s2;
            }
            else
            {
                team+=s1;
                team+=s2; 
                team+=s3;
            }
            i+=3;
            int p1=data.charAt(i)-'0'; 
            int p2=data.charAt(i+1)-'0';
            int p=p1*10+p2;
            i+=2;
            int w1=data.charAt(i)-'0';
            int w2=data.charAt(i+1)-'0';
            int w=w1*10+w2;
            i+=2;
            int l1=data.charAt(i)-'0';
            int l2=data.charAt(i+1)-'0';
            int l=l1*10+l2;
            i+=2;
            int t1=data.charAt(i)-'0';
            int t2=data.charAt(i+1)-'0';
            int t=t1*10+t2;
            i+=1;
            JPL teamStats=new JPL(team, p, w, l, t);
            stats.add(teamStats);
            teamCount++;
        }

        for (int i=0;  i<teamCount/2; i++)
        {
            stats.get(i).setGames(stats.get(i).getGames()+stats.get(i+8).getGames());
            stats.get(i).setWins(stats.get(i).getWins()+stats.get(i+8).getWins());
            stats.get(i).setLosses(stats.get(i).getLosses()+stats.get(i+8).getLosses());
        }
        try
        {
            for (int i=0; i<teamCount/2; i++)
            {
                stats.remove(8);
            }
            System.out.println("Team-wise Data: ");
            for (int i=0; i<teamCount/2; i++)
            {
                System.out.println(stats.get(i).toString());
                JPLstats.add(stats.get(i));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try
        {
            new FileReading("Thread1");
            new FileReading("Thread2");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }    
}