// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class Emergency extends TeaModel {
    // 标题
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 账号
    @NameInMap("account")
    @Validation(required = true)
    public String account;

    // 姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 手机号
    @NameInMap("phone")
    @Validation(required = true)
    public String phone;

    // 邮箱
    @NameInMap("email")
    @Validation(required = true)
    public String email;

    // 钉钉群
    @NameInMap("group")
    @Validation(required = true)
    public String group;

    // 当前记录状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static Emergency build(java.util.Map<String, ?> map) throws Exception {
        Emergency self = new Emergency();
        return TeaModel.build(map, self);
    }

    public Emergency setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public Emergency setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public Emergency setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Emergency setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public Emergency setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public Emergency setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public Emergency setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
