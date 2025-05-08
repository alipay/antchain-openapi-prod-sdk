// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class CreateShortmsgTemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 普短模板创建响应体
    @NameInMap("data")
    public ShortMsgTempCreateData data;

    public static CreateShortmsgTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateShortmsgTemplateResponse self = new CreateShortmsgTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateShortmsgTemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateShortmsgTemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateShortmsgTemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateShortmsgTemplateResponse setData(ShortMsgTempCreateData data) {
        this.data = data;
        return this;
    }
    public ShortMsgTempCreateData getData() {
        return this.data;
    }

}
