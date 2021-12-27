// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SendDubbridgeSmsBatchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 短信模板code
    @NameInMap("template_code")
    @Validation(required = true)
    public String templateCode;

    // 接收短信的手机号码，JSON数组格式
    @NameInMap("phone_number_json")
    @Validation(required = true)
    public String phoneNumberJson;

    // 短信签名名称，JSON数组格式
    @NameInMap("sign_name_json")
    @Validation(required = true)
    public String signNameJson;

    // 短信模板变量对应的实际值，JSON数组格式
    @NameInMap("template_param_json")
    @Validation(required = true)
    public String templateParamJson;

    // 上行短信扩展码，JSON数组格式。无特殊需要此字段的用户请忽略此字段
    @NameInMap("sms_up_extend_code_json")
    @Validation(required = true)
    public String smsUpExtendCodeJson;

    public static SendDubbridgeSmsBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        SendDubbridgeSmsBatchRequest self = new SendDubbridgeSmsBatchRequest();
        return TeaModel.build(map, self);
    }

    public SendDubbridgeSmsBatchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendDubbridgeSmsBatchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendDubbridgeSmsBatchRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendDubbridgeSmsBatchRequest setPhoneNumberJson(String phoneNumberJson) {
        this.phoneNumberJson = phoneNumberJson;
        return this;
    }
    public String getPhoneNumberJson() {
        return this.phoneNumberJson;
    }

    public SendDubbridgeSmsBatchRequest setSignNameJson(String signNameJson) {
        this.signNameJson = signNameJson;
        return this;
    }
    public String getSignNameJson() {
        return this.signNameJson;
    }

    public SendDubbridgeSmsBatchRequest setTemplateParamJson(String templateParamJson) {
        this.templateParamJson = templateParamJson;
        return this;
    }
    public String getTemplateParamJson() {
        return this.templateParamJson;
    }

    public SendDubbridgeSmsBatchRequest setSmsUpExtendCodeJson(String smsUpExtendCodeJson) {
        this.smsUpExtendCodeJson = smsUpExtendCodeJson;
        return this;
    }
    public String getSmsUpExtendCodeJson() {
        return this.smsUpExtendCodeJson;
    }

}
