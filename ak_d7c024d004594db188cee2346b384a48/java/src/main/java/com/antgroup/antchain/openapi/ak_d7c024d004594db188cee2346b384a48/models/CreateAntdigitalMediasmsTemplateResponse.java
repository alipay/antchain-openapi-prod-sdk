// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d7c024d004594db188cee2346b384a48.models;

import com.aliyun.tea.*;

public class CreateAntdigitalMediasmsTemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 模版创建响应体
    @NameInMap("data")
    public SmsTempCreateData data;

    public static CreateAntdigitalMediasmsTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAntdigitalMediasmsTemplateResponse self = new CreateAntdigitalMediasmsTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateAntdigitalMediasmsTemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateAntdigitalMediasmsTemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAntdigitalMediasmsTemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateAntdigitalMediasmsTemplateResponse setData(SmsTempCreateData data) {
        this.data = data;
        return this;
    }
    public SmsTempCreateData getData() {
        return this.data;
    }

}
