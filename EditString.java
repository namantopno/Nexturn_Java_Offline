public class EditString {
    public static void main(String[] args) {
//        String name = "Naman";
//        name = "Welcome "+name;
//        System.out.println(name);
        StringBuilder name = new StringBuilder("naman");
        name.append(" welcome");
        System.out.println(name);
        StringBuffer name1 = new StringBuffer("Hello welcome ");
        name1.append("xavier");
        System.out.println(name1);

//        Method,Description
//        append(str),Adds str at the end
//        insert(index, str),Inserts str at index
        name.insert(5,"Topno");
        System.out.println(name);

//        replace(start, end, str),Replaces characters from start to end with str
        name.replace(0,5,"topno");
        System.out.println(name);
//        delete(start, end),Deletes characters from start to end
        name.delete(0,5);
        System.out.println(name);
//        reverse(),Reverses the string
        name.reverse();
        System.out.println(name);
//        length(),Returns the length of the string
        int l = name.length();
        System.out.println(name+" length : "+l);
//        charAt(index),Returns character at index
        System.out.println(name.charAt(0));
//        setCharAt(index, ch),Sets character at index
        name.setCharAt(0,'x');
    }
}
