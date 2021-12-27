// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SendDubbridgeSmsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 接收短信的手机号码。支持对多个手机号码发送短信，手机号码之间以英文逗号（,）分隔。上限为1000个手机号码。批量调用相对于单条调用及时性稍有延迟。
    @NameInMap("phone_numbers")
    @Validation(required = true)
    public String phoneNumbers;

    // 短信签名
    @NameInMap("sign_name")
    @Validation(required = true)
    public String signName;

    // 短信模板CODE
    @NameInMap("template_code")
    @Validation(required = true)
    public String templateCode;

    // 短信模板变量对应的值，JSON格式
    @NameInMap("template_param")
    public String templateParam;

    // 上行短信扩展码
    @NameInMap("sms_up_extend_code")
    public String smsUpExtendCode;

    // 外部流水扩展
    @NameInMap("out_id")
    @Validation(required = true)
    public String outId;

    public static SendDubbridgeSmsRequest build(java.util.Map<String, ?> map) throws Exception {
        SendDubbridgeSmsRequest self = new SendDubbridgeSmsRequest();
        return TeaModel.build(map, self);
    }

    public SendDubbridgeSmsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendDubbridgeSmsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendDubbridgeSmsRequest setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public SendDubbridgeSmsRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public SendDubbridgeSmsRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendDubbridgeSmsRequest setTemplateParam(String templateParam) {
        this.templateParam = templateParam;
        return this;
    }
    public String getTemplateParam() {
        return this.templateParam;
    }

    public SendDubbridgeSmsRequest setSmsUpExtendCode(String smsUpExtendCode) {
        this.smsUpExtendCode = smsUpExtendCode;
        return this;
    }
    public String getSmsUpExtendCode() {
        return this.smsUpExtendCode;
    }

    public SendDubbridgeSmsRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

}
