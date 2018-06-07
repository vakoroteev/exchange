package my.pack.CommandMenu;

public enum Permission {
    UNAUTHORISED("Неавторизованный клиент или неверная роль"),
    CLIENT("Клиент"),
    ADMIN("Админ");

    private String value;

    Permission(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Permission getPermission(String permission) {
        switch (permission) {
            case "client":
                return Permission.CLIENT;
            case "admin":
                return Permission.ADMIN;
            default:
                return Permission.UNAUTHORISED;
        }
    }

}
