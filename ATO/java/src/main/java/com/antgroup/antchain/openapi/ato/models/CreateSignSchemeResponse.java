// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateSignSchemeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 签约单号与动作集快照，RentalSignSchemeCreateResp 对象的 JSON 字符串
    @NameInMap("response_data")
    public RentalSignSchemeCreateResp responseData;

    public static CreateSignSchemeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSignSchemeResponse self = new CreateSignSchemeResponse();
        return TeaModel.build(map, self);
    }

    public CreateSignSchemeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateSignSchemeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateSignSchemeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateSignSchemeResponse setResponseData(RentalSignSchemeCreateResp responseData) {
        this.responseData = responseData;
        return this;
    }
    public RentalSignSchemeCreateResp getResponseData() {
        return this.responseData;
    }

}
