// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class SyncSolutionFilenotaryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 是否被接收
    // 
    @NameInMap("accepted")
    public Boolean accepted;

    // 拒绝原因
    // 
    @NameInMap("denied_reason")
    public String deniedReason;

    // 文件存证id
    // 
    @NameInMap("file_notary_id")
    public String fileNotaryId;

    public static SyncSolutionFilenotaryResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncSolutionFilenotaryResponse self = new SyncSolutionFilenotaryResponse();
        return TeaModel.build(map, self);
    }

    public SyncSolutionFilenotaryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SyncSolutionFilenotaryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SyncSolutionFilenotaryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SyncSolutionFilenotaryResponse setAccepted(Boolean accepted) {
        this.accepted = accepted;
        return this;
    }
    public Boolean getAccepted() {
        return this.accepted;
    }

    public SyncSolutionFilenotaryResponse setDeniedReason(String deniedReason) {
        this.deniedReason = deniedReason;
        return this;
    }
    public String getDeniedReason() {
        return this.deniedReason;
    }

    public SyncSolutionFilenotaryResponse setFileNotaryId(String fileNotaryId) {
        this.fileNotaryId = fileNotaryId;
        return this;
    }
    public String getFileNotaryId() {
        return this.fileNotaryId;
    }

}
