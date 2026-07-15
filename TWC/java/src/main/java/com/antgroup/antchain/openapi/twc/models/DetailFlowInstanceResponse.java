// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class DetailFlowInstanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 本次存证的存证主体信息
    @NameInMap("notary_user")
    public NotaryUser notaryUser;

    // 本次全流程的阶段存证详情列表
    @NameInMap("phase_detail_list")
    public java.util.List<PhaseDetail> phaseDetailList;

    public static DetailFlowInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailFlowInstanceResponse self = new DetailFlowInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DetailFlowInstanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailFlowInstanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailFlowInstanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailFlowInstanceResponse setNotaryUser(NotaryUser notaryUser) {
        this.notaryUser = notaryUser;
        return this;
    }
    public NotaryUser getNotaryUser() {
        return this.notaryUser;
    }

    public DetailFlowInstanceResponse setPhaseDetailList(java.util.List<PhaseDetail> phaseDetailList) {
        this.phaseDetailList = phaseDetailList;
        return this;
    }
    public java.util.List<PhaseDetail> getPhaseDetailList() {
        return this.phaseDetailList;
    }

}
