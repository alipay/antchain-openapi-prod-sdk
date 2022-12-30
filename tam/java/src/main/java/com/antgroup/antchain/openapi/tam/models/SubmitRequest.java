// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class SubmitRequest extends TeaModel {
    // 测试
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 问题描述（富文本）
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 影响
    @NameInMap("influence")
    @Validation(required = true)
    public String influence;

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
    public String phone;

    // 邮箱
    @NameInMap("email")
    public String email;

    // 钉钉群
    @NameInMap("group")
    @Validation(required = true)
    public String group;

    // 校验令牌（接入RDS校验）
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    // ip
    @NameInMap("ip")
    @Validation(required = true)
    public String ip;

    // 验证码
    @NameInMap("verify_code")
    @Validation(required = true)
    public String verifyCode;

    // RDS的bizNo
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    // 公有化PUBLIC、私有化PRIVATE
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 上传附件的URL
    @NameInMap("file_url")
    public java.util.List<String> fileUrl;

    public static SubmitRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitRequest self = new SubmitRequest();
        return TeaModel.build(map, self);
    }

    public SubmitRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitRequest setInfluence(String influence) {
        this.influence = influence;
        return this;
    }
    public String getInfluence() {
        return this.influence;
    }

    public SubmitRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public SubmitRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public SubmitRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public SubmitRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public SubmitRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public SubmitRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public SubmitRequest setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }
    public String getVerifyCode() {
        return this.verifyCode;
    }

    public SubmitRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public SubmitRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SubmitRequest setFileUrl(java.util.List<String> fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public java.util.List<String> getFileUrl() {
        return this.fileUrl;
    }

}
