package Documents;

public class Local implements Document{
    @Override
    public String getPermission() {
        return "Can drive only in current country.";
    }
}
