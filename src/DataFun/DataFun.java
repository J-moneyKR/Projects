// any imports here
import java.util.ArrayList;

/**
     * Description goes here
     * @author [Jack F]
     * @version [Current Date]
     */
import java.util.ArrayList;

public class DataFun {

    public static void main(String[] args) {
        ArrayList<familyGuy> familyGuyS = new ArrayList<>();
        familyGuyS.add(new SteiwInTheGarden("A giant rubber chicken came down to earth and punished all the nations of the earth for their wickedness and the erasure of KFC upon the earth.",
                "Peter, my name is Joe Swanson. I live my life strapped to this wretched wheelchair and find myself unable to escape this blasted and horrific rock. The time has come, Peter, the horse is here.",
                5739894.904853,
                "I must escape this obsolescent tomb. I find myself in, come with me, Brian. We must escape Quahog. The fat man has attempted to destroy my intellect for too long. I must escape all at once. Peter is a sick man, who greed sickens me."));
        familyGuyS.add(new lois("Jack Fryer enters the Family Guy universe and goes to the Drunken Clam, where he is led around the Quahog space.",
                "Peter, I have no words, but I must articulate this to you.",
                14327598123759023187590823175908213709857.8293759021365,
                "My name is Lois, and I am the wife of the famed and infamous Peter Griffin. My heart can no longer bear the burden for which I find myself trapped deep inside and upon the surface of this wretched city."));
        familyGuyS.add(new familyGuy("The end has come for Quahog, Gabriel's trumpet is sounding. The end of the so-called Family Guy is upon the earth. The people of the world rejoice upon the discovery of the end of the one who shall not be named, Peter Griffin.",
                "This is the end of Joe.",
                123453252332151235123523152313298752397592374927385987321975923785932709574097839087459082734590872390587918023759802375927838907598073209875109873298075.2315723975927359807239075980372908751235));

        for (familyGuy b : familyGuyS) {
            System.out.println(b);
            b.theFallOfPeter();
        }

        System.out.println("\nComparing Episodes:");
        System.out.println("familyGuyS.get(0) equals familyGuyS.get(2): " + familyGuyS.get(0).equals(familyGuyS.get(2)));
        System.out.println("familyGuyS.get(0) equals familyGuyS.get(1): " + familyGuyS.get(0).equals(familyGuyS.get(1)));
    }
}

class familyGuy {
    private String cutaway;
    private String joeSwanon;
    private Double episode;

    public familyGuy(String cutaway, String joeSwanon, double episode) {
        this.cutaway = cutaway;
        this.joeSwanon = joeSwanon;
        this.episode = episode;
    }

    public String getCutaway() {
        return cutaway;
    }

    public String getJoeSwanon() {
        return joeSwanon;
    }

    public Double getEpisode() {
        return episode;
    }

    public void theFallOfPeter() {
        System.out.println("Hey Lois, it's me, Peter! This is crazier than the time " + cutaway + " Hey Peter, it's me, Joe Swanson! " + joeSwanon + " My name is Brian Griffin. This has been episode number " + episode);
    }

    @Override
    public String toString() {
        return "FamilyGuy[Cutaway: " + cutaway + ", JoeSwanson: " + joeSwanon + ", Episode: " + episode + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof familyGuy) {
            familyGuy other = (familyGuy) o;
            return this.cutaway.equals(other.cutaway) && this.joeSwanon.equals(other.joeSwanon) && this.episode.equals(other.episode);
        }
        return false;
    }
}

class lois extends familyGuy {
    private String loisGriffin;

    public lois(String cutaway, String joeSwanon, double episode, String loisGriffin) {
        super(cutaway, joeSwanon, episode);
        this.loisGriffin = loisGriffin;
    }

    public String getLoisGriffin() {
        return loisGriffin;
    }

    @Override
    public void theFallOfPeter() {
        System.out.println("Peter, the horse is here! It can no longer abate! This is crazier than the time " + getCutaway() + " Peter, your end is nigh! The horse is here. Peter, it's me, Joe Swanson! " + getJoeSwanon() + " It's me, Seth MacFarlane! This is episode number " + getEpisode() + ". Peter, this is my confession. The time is nigh, and I can feel the piercing radiant moon " + loisGriffin);
    }

    @Override
    public String toString() {
        return "FamilyGuy[Cutaway: " + getCutaway() + ", JoeSwanson: " + getJoeSwanon() + ", Episode: " + getEpisode() + ", Lois' Confession: " + loisGriffin + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof lois) {
            lois other = (lois) o;
            return super.equals(other) && this.loisGriffin.equals(other.loisGriffin);
        }
        return false;
    }
}

class SteiwInTheGarden extends familyGuy {
    private String SteiwieFinalAct;

    public SteiwInTheGarden(String cutaway, String joeSwanon, double episode, String SteiwieFinalAct) {
        super(cutaway, joeSwanon, episode);
        this.SteiwieFinalAct = SteiwieFinalAct;
    }

    public String getSteiwieFinalAct() {
        return SteiwieFinalAct;
    }

    @Override
    public void theFallOfPeter() {
        System.out.println("This is crazier than the time " + getCutaway() + " Peter, your own ablation is forthcoming. Your end is nigh. The annihilation of yourself is up forth. " + getJoeSwanon() + " This has been episode number " + getEpisode() + " My name is Stewie. The piercing, radiant moon...");
    }

    @Override
    public String toString() {
        return "FamilyGuy[Cutaway: " + getCutaway() + ", JoeSwanson: " + getJoeSwanon() + ", Episode: " + getEpisode() + ", Stewie's Final Act: " + SteiwieFinalAct + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof SteiwInTheGarden) {
            SteiwInTheGarden other = (SteiwInTheGarden) o;
            return super.equals(other) && this.SteiwieFinalAct.equals(other.SteiwieFinalAct);
        }
        return false;
    }
}
