package com.shimh.entity;

/**
 * 用户状态
 *
 * @author xwq
 * <p>
 * 2021年4月23日
 */
public enum UserStatus {

    normal("正常状态"), blocked("封禁状态");

    private final String info;

    private UserStatus(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
