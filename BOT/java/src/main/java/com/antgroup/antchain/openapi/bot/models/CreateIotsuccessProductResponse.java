// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateIotsuccessProductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("product_key")
    @Validation(required = true)
    public String productKey;

    // 产品业务云实例，非网关product_instance_id；设备导入无需传入
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 产品绑定的Agent接入凭证，非网关SK或IoTBasic原生Secret；仅首次，禁止日志记录
    @NameInMap("product_secret")
    @Validation(required = true)
    public String productSecret;

    @NameInMap("default_template_id")
    @Validation(required = true)
    public String defaultTemplateId;

    public static CreateIotsuccessProductResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIotsuccessProductResponse self = new CreateIotsuccessProductResponse();
        return TeaModel.build(map, self);
    }

    public CreateIotsuccessProductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateIotsuccessProductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateIotsuccessProductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateIotsuccessProductResponse setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateIotsuccessProductResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateIotsuccessProductResponse setProductSecret(String productSecret) {
        this.productSecret = productSecret;
        return this;
    }
    public String getProductSecret() {
        return this.productSecret;
    }

    public CreateIotsuccessProductResponse setDefaultTemplateId(String defaultTemplateId) {
        this.defaultTemplateId = defaultTemplateId;
        return this;
    }
    public String getDefaultTemplateId() {
        return this.defaultTemplateId;
    }

}
