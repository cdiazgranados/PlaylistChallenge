package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class MusicTest {

    @Test
    public void selectionTest1(){


        String[] playlist = {"wheniseeyouagain","borntorun","nothingelsematters","cecelia"};
        Music music = new Music(playlist);
        Integer startingIndex = 1;
        String selection = "cecelia";
        Integer expected = 2;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void selectionTest2(){


        String[] playlist = {"dancinginthedark","rio","liveoak","liveoak"};
        Music music = new Music(playlist);
        Integer startingIndex = 0;
        String selection = "liveoak";
        Integer expected = 1;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void selectionTest3(){


        String[] playlist = {"dancinginthedark","rio","liveoak","liveoak"};
        Music music = new Music(playlist);
        Integer startingIndex = 3;
        String selection = "dancinginthedark";
        Integer expected = 1;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void selectionTest4(){


        String[] playlist = {"dancinginthedark","rio","liveoak","liveoak"};
        Music music = new Music(playlist);
        Integer startingIndex = 1;
        String selection = "liveoak";
        Integer expected = 1;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void selectionTest5(){


        String[] playlist = {"dancinginthedark","rio","liveoak","liveoak","wheniseeyouagain","borntorun","nothingelsematters","cecelia"};
        Music music = new Music(playlist);
        Integer startingIndex = 7;
        String selection = "rio";
        Integer expected = 2;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void selectionTest6(){


        String[] playlist = {"dancinginthedark","rio","liveoak","liveoak","wheniseeyouagain","borntorun","nothingelsematters","cecelia"};
        Music music = new Music(playlist);
        Integer startingIndex = 1;
        String selection = "rio";
        Integer expected = 0;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void selectionTest7(){


        String[] playlist = {"dancinginthedark","rio","liveoak","liveoak","wheniseeyouagain","borntorun","nothingelsematters","cecelia"};
        Music music = new Music(playlist);
        Integer startingIndex = 1;
        String selection = "cecelia";
        Integer expected = 2;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }



}
