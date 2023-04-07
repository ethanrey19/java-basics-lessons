package main.Misc.AccessModifers;

public class AccessModifers {

        String defaultMessage = "This is the default";
        // default Modifier is visible to every class within the same package.
        public String publicMessage = "This is public";
        // public Modifier is visible to every class within the project folder
        protected String protectedMessage = "This is protected";
        // protected Modifier is visible any class as long as it is a subclass
        private String privateMessage = "This is private";
        // private Modifier is only visible to the class it is created in
}
