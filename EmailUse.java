public class EmailUse {
    public static void  sendmail(String name, String company)    {
        String emaildraft = "Dear "+name+" welcome to "+company+" thankyou";
        System.out.println(emaildraft);
    }
    public static void main(String[] args) {
        sendmail("Khalid", "Nexturn");
    }
}
