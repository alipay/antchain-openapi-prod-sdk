// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class GetDasIndividualvcResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // VC
    @NameInMap("vc")
    public String vc;

    public static GetDasIndividualvcResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDasIndividualvcResponse self = new GetDasIndividualvcResponse();
        return TeaModel.build(map, self);
    }

    public GetDasIndividualvcResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetDasIndividualvcResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDasIndividualvcResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetDasIndividualvcResponse setVc(String vc) {
        this.vc = vc;
        return this;
    }
    public String getVc() {
        return this.vc;
    }

}
