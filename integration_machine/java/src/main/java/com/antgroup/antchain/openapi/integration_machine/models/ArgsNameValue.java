// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class ArgsNameValue extends TeaModel {
    // 设备参数名称
    @NameInMap("args_name")
    public String argsName;

    // 设备参数key
    @NameInMap("args_key")
    @Validation(required = true)
    public String argsKey;

    // 设备参数value
    @NameInMap("args_value")
    @Validation(required = true)
    public String argsValue;

    // 设备参数标识(ip,mac,bizid)
    @NameInMap("args_mark")
    public String argsMark;

    public static ArgsNameValue build(java.util.Map<String, ?> map) throws Exception {
        ArgsNameValue self = new ArgsNameValue();
        return TeaModel.build(map, self);
    }

    public ArgsNameValue setArgsName(String argsName) {
        this.argsName = argsName;
        return this;
    }
    public String getArgsName() {
        return this.argsName;
    }

    public ArgsNameValue setArgsKey(String argsKey) {
        this.argsKey = argsKey;
        return this;
    }
    public String getArgsKey() {
        return this.argsKey;
    }

    public ArgsNameValue setArgsValue(String argsValue) {
        this.argsValue = argsValue;
        return this;
    }
    public String getArgsValue() {
        return this.argsValue;
    }

    public ArgsNameValue setArgsMark(String argsMark) {
        this.argsMark = argsMark;
        return this;
    }
    public String getArgsMark() {
        return this.argsMark;
    }

}
