class StringMethod{
    public static void main(String[] args) {
        String a = "Jay Kumawat";
        System.out.println("Name : " + a);
        System.out.println("Length : " + a.length());
        System.out.println("Lowercase : " + a.toLowerCase());
        System.out.println("Uppercase : " + a.toUpperCase());
        String nontrimed = "       Jay  Kumawat                        ";
        System.out.println("Trim : " + nontrimed.trim());
        System.out.println("Substring : " + a.substring(1,3));
        System.out.println("Replace : " + a.replace('a', 'o'));
        System.out.println("Replace : " + a.replace("a", "ooo"));
        System.out.println("Checks Starts With?? : " + a.startsWith("j"));
        System.out.println("Checks Ends With?? : " + a.endsWith("Kumawat"));
        System.out.println("Char At : " + a.charAt(2));
        System.out.println("Index of Substring : " + a.indexOf("Kuma"));
        System.out.println("Index of Substring After A Particular Index : " + a.indexOf("Kuma",2));
        System.out.println("Last Index Of : " + a.lastIndexOf('a'));
        System.out.println("Last Index From Index(search from 0 to that index): " + a.lastIndexOf('a',7));
        System.out.println("Equal : " + a.equals("Jay"));
        System.out.println("Equal without case sensitivity : " + a.equalsIgnoreCase("Jay kumawat"));
    }
}