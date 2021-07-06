// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class InitEnterpriseidFaceauthinternalResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 本次认证的业务唯一性标示
    // 
    @NameInMap("biz_no")
    public String bizNo;

    public static InitEnterpriseidFaceauthinternalResponse build(java.util.Map<String, ?> map) throws Exception {
        InitEnterpriseidFaceauthinternalResponse self = new InitEnterpriseidFaceauthinternalResponse();
        return TeaModel.build(map, self);
    }

    public InitEnterpriseidFaceauthinternalResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitEnterpriseidFaceauthinternalResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitEnterpriseidFaceauthinternalResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitEnterpriseidFaceauthinternalResponse setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

}
