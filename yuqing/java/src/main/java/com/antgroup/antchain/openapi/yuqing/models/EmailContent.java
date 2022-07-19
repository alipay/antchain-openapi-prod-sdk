// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class EmailContent extends TeaModel {
    // code
    @NameInMap("service_code")
    public String serviceCode;

    // 开发者Id
    @NameInMap("developer_id")
    public String developerId;

    // 邮箱
    @NameInMap("email")
    @Validation(required = true)
    public String email;

    // 参数
    @NameInMap("arguments")
    public java.util.List<Pair> arguments;

    public static EmailContent build(java.util.Map<String, ?> map) throws Exception {
        EmailContent self = new EmailContent();
        return TeaModel.build(map, self);
    }

    public EmailContent setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public EmailContent setDeveloperId(String developerId) {
        this.developerId = developerId;
        return this;
    }
    public String getDeveloperId() {
        return this.developerId;
    }

    public EmailContent setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public EmailContent setArguments(java.util.List<Pair> arguments) {
        this.arguments = arguments;
        return this;
    }
    public java.util.List<Pair> getArguments() {
        return this.arguments;
    }

}
