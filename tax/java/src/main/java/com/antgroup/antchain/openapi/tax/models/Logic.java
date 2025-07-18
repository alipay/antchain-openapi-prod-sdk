// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class Logic extends TeaModel {
    // 操作符
    //  equal = _equal_, // 相等比较
    //   notEqual = _notEqual_, // 不相等比较
    //   AND = _AND_, // 与逻辑
    //   OR = _OR_, // 或逻辑
    /**
     * <strong>example:</strong>
     * <p>equal</p>
     */
    @NameInMap("op")
    @Validation(required = true)
    public String op;

    //  只有 op 是 AND 或者 OR 才是可选，其他情况为必选
    /**
     * <strong>example:</strong>
     * <p>sss</p>
     */
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 只有 op 是 AND 或者 OR 才是可选，其他情况为必选
    /**
     * <strong>example:</strong>
     * <p>d d d</p>
     */
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // 只有 op 是 AND 或者 OR 才需要这个字段
    // [{op: _AND_, // 与逻辑
    //         children: [
    //           {
    //             op: _equal_, // 相等比较
    //             key: _validationMethod_, // 表示：验证方式
    //             value: _smsCode_  // 表示：短信验证码
    //           },
    //           { // 判断登录信息的值不为 null
    //             op: _notEqual_, // 不相等比较
    //             key: _username_,  // 表示：登录信息
    //             value: null
    //           }]}]
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("children")
    @Validation(required = true)
    public String children;

    public static Logic build(java.util.Map<String, ?> map) throws Exception {
        Logic self = new Logic();
        return TeaModel.build(map, self);
    }

    public Logic setOp(String op) {
        this.op = op;
        return this;
    }
    public String getOp() {
        return this.op;
    }

    public Logic setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public Logic setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public Logic setChildren(String children) {
        this.children = children;
        return this;
    }
    public String getChildren() {
        return this.children;
    }

}
