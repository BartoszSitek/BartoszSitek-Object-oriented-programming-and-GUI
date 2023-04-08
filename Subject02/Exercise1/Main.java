package Exercise1;

public class Main {
    public static void main(String[] args) {
        Spiewak[] spiewacy = {
                new Spiewak("Bocceli") {
                     String spiewaj() {
                        return "oo23121o";
                    }
                },
                new Spiewak("Santra") {
                     String spiewaj() {
                        return "412421a";
                    }
                },
                new Spiewak("Pianco") {
                    String spiewaj() {
                        return "xasd3";
                    }
                }
        };

        Spiewak najglosniejszy = Spiewak.najglosniej(spiewacy);

        System.out.println("Najgłośniejszy śpiewak:");
        System.out.println(najglosniejszy);
        System.out.println();

        Spiewak s1 = new Spiewak("Dietrich") {
            @Override
            String spiewaj() {
                return "oooooo6oooooo";
            }
            /*<-  kod */
        };

        Spiewak s2 = new Spiewak("Piaf") {
            @Override
            String spiewaj() {
                return "a4iBBiii";
            }
            /*<-  kod */
        };

        Spiewak s3 = new Spiewak("Adele") {
            @Override
            String spiewaj() {
                return "aAa";
            }
            /*<-  kod */
        };

        Spiewak sp[] = {s2, s1, s3};

        for (Spiewak s : sp)
            System.out.println(s);

        System.out.println("\n" + Spiewak.najglosniej(sp));
    }
}