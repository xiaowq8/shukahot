package com.shimh.common.result;

/**
 * Controller参数校验 错误返回封装
 *
 * @author xwq
 * <p>
 * 2021年4月23日
 */
public class ParameterInvalidItem {

    private String fieldName;

    private String message;

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
