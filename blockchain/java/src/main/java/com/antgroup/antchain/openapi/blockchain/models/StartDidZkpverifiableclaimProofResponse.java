// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidZkpverifiableclaimProofResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 替换为zkp证明的VC
    @NameInMap("zkp_vc")
    public String zkpVc;

    public static StartDidZkpverifiableclaimProofResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDidZkpverifiableclaimProofResponse self = new StartDidZkpverifiableclaimProofResponse();
        return TeaModel.build(map, self);
    }

    public StartDidZkpverifiableclaimProofResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartDidZkpverifiableclaimProofResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartDidZkpverifiableclaimProofResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartDidZkpverifiableclaimProofResponse setZkpVc(String zkpVc) {
        this.zkpVc = zkpVc;
        return this;
    }
    public String getZkpVc() {
        return this.zkpVc;
    }

}
