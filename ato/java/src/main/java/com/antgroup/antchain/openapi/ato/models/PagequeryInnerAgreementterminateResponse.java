// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerAgreementterminateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总条数
    @NameInMap("total_count")
    public Long totalCount;

    // (异步)解约申请列表
    @NameInMap("terminate_apply_list")
    public java.util.List<AgreementTerminateApplyInfo> terminateApplyList;

    public static PagequeryInnerAgreementterminateResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerAgreementterminateResponse self = new PagequeryInnerAgreementterminateResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerAgreementterminateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryInnerAgreementterminateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryInnerAgreementterminateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryInnerAgreementterminateResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public PagequeryInnerAgreementterminateResponse setTerminateApplyList(java.util.List<AgreementTerminateApplyInfo> terminateApplyList) {
        this.terminateApplyList = terminateApplyList;
        return this;
    }
    public java.util.List<AgreementTerminateApplyInfo> getTerminateApplyList() {
        return this.terminateApplyList;
    }

}
