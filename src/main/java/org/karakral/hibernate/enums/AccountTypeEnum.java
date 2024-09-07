package org.karakral.hibernate.enums;

public enum AccountTypeEnum {

    SHORT_TIME(0,"short_time"),
    CURRENT(1,"current");


    private final int code;
    private final String description;

    AccountTypeEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static AccountTypeEnum fromCode(int code) {
        for (AccountTypeEnum status : AccountTypeEnum.values()) {
            if (status.code == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid code: " + code);
    }

}
