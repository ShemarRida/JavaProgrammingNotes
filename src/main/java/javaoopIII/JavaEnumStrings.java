package javaoopIII;

public class JavaEnumStrings {
    enum Size {
        SMALL {

            public String toString() {
                return "The size is small.";
            }
        },

        MEDIUM {

            public String toString() {
                return "The size is medium.";
            }
        };
    }


    public static void main(String[] args) {
        System.out.println(Size.MEDIUM.toString());
    }
}

