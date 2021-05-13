// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class GetSolutionFilenotarystatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 存证是否接受
    // 
    @NameInMap("accepted")
    public Boolean accepted;

    // 存证拒绝原因
    // 
    @NameInMap("denied_reason")
    public String deniedReason;

    // 文件存证id
    // 
    @NameInMap("file_notary_id")
    public String fileNotaryId;

    // 存证是否完成
    @NameInMap("finished")
    public Boolean finished;

    // 存证哈希，存证未完成时为空
    // 
    @NameInMap("tx_hash")
    public String txHash;

    public static GetSolutionFilenotarystatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSolutionFilenotarystatusResponse self = new GetSolutionFilenotarystatusResponse();
        return TeaModel.build(map, self);
    }

    public GetSolutionFilenotarystatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetSolutionFilenotarystatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetSolutionFilenotarystatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetSolutionFilenotarystatusResponse setAccepted(Boolean accepted) {
        this.accepted = accepted;
        return this;
    }
    public Boolean getAccepted() {
        return this.accepted;
    }

    public GetSolutionFilenotarystatusResponse setDeniedReason(String deniedReason) {
        this.deniedReason = deniedReason;
        return this;
    }
    public String getDeniedReason() {
        return this.deniedReason;
    }

    public GetSolutionFilenotarystatusResponse setFileNotaryId(String fileNotaryId) {
        this.fileNotaryId = fileNotaryId;
        return this;
    }
    public String getFileNotaryId() {
        return this.fileNotaryId;
    }

    public GetSolutionFilenotarystatusResponse setFinished(Boolean finished) {
        this.finished = finished;
        return this;
    }
    public Boolean getFinished() {
        return this.finished;
    }

    public GetSolutionFilenotarystatusResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
