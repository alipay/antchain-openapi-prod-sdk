// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class SendSmsMessageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 短信模版Id
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 手机号
    @NameInMap("phone")
    @Validation(required = true)
    public String phone;

    // 参数键值对
    @NameInMap("template_args")
    @Validation(required = true)
    public String templateArgs;

    public static SendSmsMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendSmsMessageRequest self = new SendSmsMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendSmsMessageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendSmsMessageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendSmsMessageRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SendSmsMessageRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public SendSmsMessageRequest setTemplateArgs(String templateArgs) {
        this.templateArgs = templateArgs;
        return this;
    }
    public String getTemplateArgs() {
        return this.templateArgs;
    }

}
