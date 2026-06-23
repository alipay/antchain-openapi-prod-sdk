// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas_security.models;

import com.aliyun.tea.*;

public class CheckInfosecHoloxcontentcheckserviceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 大安全风控接口返回结果
    @NameInMap("data")
    public HoloxCheckResult data;

    public static CheckInfosecHoloxcontentcheckserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckInfosecHoloxcontentcheckserviceResponse self = new CheckInfosecHoloxcontentcheckserviceResponse();
        return TeaModel.build(map, self);
    }

    public CheckInfosecHoloxcontentcheckserviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckInfosecHoloxcontentcheckserviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckInfosecHoloxcontentcheckserviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckInfosecHoloxcontentcheckserviceResponse setData(HoloxCheckResult data) {
        this.data = data;
        return this;
    }
    public HoloxCheckResult getData() {
        return this.data;
    }

}
