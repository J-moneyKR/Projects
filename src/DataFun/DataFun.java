// any imports here
import java.util.ArrayList;

/**
     * Description goes here
     * @author [Jack F]
     * @version [Current Date]
     */
public class DataFun {
    public static void main(String[] args) {
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
                System.out.println("Hey lois it's me peter this is crazier than the time " + cutaway + " hey pter its me joe swansons " + joeSwanon + " My name brai giffin this has been epsiode number " + episode);
            }

            @Override
            public String toString() {
                return "FamliyGuy[Cutaway: " + cutaway + ", joeswanonson: " + joeSwanon + ", Episode: " + episode + "]";
            }

            @Override
            public boolean equals(Object o) {
                if (o instanceof familyGuy) {
                    familyGuy other = (familyGuy) o;
                    return this.cutaway.equals(other.cutaway) && this.joeSwanon.equals(other.joeSwanon) && this.episode == other.episode;
                }
                return false;
            }

            public class lois extends familyGuy {
                private String loisGrififn;

                public lois(String cutaway, String joeSwanon, double episode, String loisGrifin) {
                    super(cutaway, joeSwanon, episode);
                    this.loisGrififn = loisGrifin;

                }

                public String getLoisGrififn() {
                    return loisGrififn;
                }

                @Override
                public void theFallOfPeter() {
                    System.out.println(" Peter the horse is here is can no longer abetare this is crazier than the time " + getCutaway() + " peter your end is nigh the horse is here pter hey pereer it me joe swanon " + getJoeSwanon() + " ITs me seth mcfarlen this is psidoe number " + getEpisode() + " Peter this si my comffestion the time is nigh an I can geel the peracing radtiant moon " + loisGrififns);
                }

                @Override
                public String toString() {
                    System.out.println("FamliyGuy[Cutaway: " + getCutaway() + ", joeswanonson: " + getJoeSwanon() + ", Episode: " + getEpisode() + +", Loisis Confesion: " + lois + "]");
                }

                @Override
                public boolean equals(Object o) {
                    if (o instanceof lois) {
                        lois other = (lois) o;
                        return super.equals(other) && this.loisGrififn.equals(other.loisGrififn);
                    }
                    return false;
                }

                public class SteiwInTheGarden extends familyGuy {
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
                        System.out.println(" This is carzier than the time " + getCutaway() + " Peter your own abulation is forthcoming your end is nigh the annlihation of yourself is upforth " + getJoeSwanon() + " This has been espidoe number " + getEpisode() + " My name is steiwe The piercing, radiant moon\n" +
                                "The storming of poor June\n" +
                                "All the life running through her hair\n" +
                                "Approaching guiding light\n" +
                                "Our shallow years in fright\n" +
                                "Dreams are made, winding through my head\n" +
                                "Through my head\n" +
                                "Before you know, awake\n" +
                                "Your lives are open wide\n" +
                                "The V-chip gives them sight\n" +
                                "Of all the life running through her hair\n" +
                                "The spiders all in tune\n" +
                                "The evening of the moon\n" +
                                "Dreams are made, winding through my head\n" +
                                "Through my head\n" +
                                "Before you know, awake\n" +
                                "Through my head\n" +
                                "Through my head\n" +
                                "Before you know\n" +
                                "Before you know, I will be waiting, all awake\n" +
                                "Dreams are made, winding through her hair\n" +
                                "Dreams are made, winding through her hair" + SteiwieFinalAct);

                    }

                    @Override
                    public String toString() {
                        System.out.println("FamliyGuy[Cutaway: " + getCutaway() + ", joeswanonson: " + getJoeSwanon() + ", Episode: " + getEpisode() + +", Stewies Testimoney: " + SteiwieFinalAct + "]");
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

                public class FamliyGuysFolloy {
                    public static void main(String[] args) {
                        ArrayList<familyGuy> familyGuyS = new ArrayList<>();
                        familyGuyS.add(new SteiwInTheGarden(" A gaint rubber chiken came down to earth and punished all the nations of the earth for thier wickdness and erscuation and the erasure of KFC upon the earth ", " Peter my name is joe swaon I live my life straped to this wertched wheelchair and find myself un able to escape this blsated and horrifc rock this time has come peta the horse is here ", 5739894.904853, " I must escaped this ozborizain tomb I find myself in come with me with brian we must escape quahog the fatman has attempted to destroy my intellect for too long I must escape all at once peter is a sick man who greed sickes me "));
                        familyGuyS.add(new lois(" Jack Fryer enters the famliy guy unvierse and goes to the drunken clam where he is a lead around the quahog space ", "Peter I have no words but I must artuicalte this to you ", 14327598123759023187590823175908213709857.8293759021365, " my name is lois and I am the wife of the fameded and infamous peter griffin my heart can no longer bear the burdern for whitch i find myself trapped deep inside in and upon the surface of tis wrteched city "));
                        familyGuyS.add(new familyGuy(" The end has come for quahog gabriel trumpet is sounding the end of the so called famliy guy is upon the earth the people of the world rejoice upon the discovery of the end of the one whos shall not be named peter griffin ", +" This is the end of joe ", 123453252332151235123523152313298752397592374927385987321975923785932709574097839087459082734590872390587918023759802375927838907598073209875109873298075.2315723975927359807239075980372908751235));

                        for (familyGuy b : familyGuyS) {
                            System.out.println(b);
                            b.theFallOfPeter();
                        }
                        System.out.println("\nComparing Episodes:");
                        System.out.println("familyGuyS.get(0) equals familyGuyS.get(2) " + familyGuyS.get(0).equals(familyGuyS.get(2)));
                        System.out.println("familyGuyS.get(0) equals familyGuyS.get(1) " + familyGuyS.get(0).equals(familyGuyS.get(1)));

                    }
                }
            }
        }
    }
}