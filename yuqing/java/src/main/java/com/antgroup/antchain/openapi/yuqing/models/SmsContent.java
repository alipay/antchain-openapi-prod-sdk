// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class SmsContent extends TeaModel {
    // 模板
    @NameInMap("service_code")
    public String serviceCode;

    // 手机号
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 开发者ID
    @NameInMap("developer_id")
    public String developerId;

    // 填充内容
    @NameInMap("arguments")
    public java.util.List<Pair> arguments;

    public static SmsContent build(java.util.Map<String, ?> map) throws Exception {
        SmsContent self = new SmsContent();
        return TeaModel.build(map, self);
    }

    public SmsContent setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public SmsContent setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public SmsContent setDeveloperId(String developerId) {
        this.developerId = developerId;
        return this;
    }
    public String getDeveloperId() {
        return this.developerId;
    }

    public SmsContent setArguments(java.util.List<Pair> arguments) {
        this.arguments = arguments;
        return this;
    }
    public java.util.List<Pair> getArguments() {
        return this.arguments;
    }

}
