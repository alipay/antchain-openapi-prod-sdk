// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commonrcsmart.models;

import com.aliyun.tea.*;

public class QueryRcApprovalMessageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 审核结果基类
    @NameInMap("rc_smart_response")
    public RcSmartResponse rcSmartResponse;

    // 通用版文本审核结果
    @NameInMap("result_vo")
    public MessageApprovalResultVO resultVo;

    // 审核结果页
    @NameInMap("page_url")
    public String pageUrl;

    public static QueryRcApprovalMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRcApprovalMessageResponse self = new QueryRcApprovalMessageResponse();
        return TeaModel.build(map, self);
    }

    public QueryRcApprovalMessageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRcApprovalMessageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRcApprovalMessageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRcApprovalMessageResponse setRcSmartResponse(RcSmartResponse rcSmartResponse) {
        this.rcSmartResponse = rcSmartResponse;
        return this;
    }
    public RcSmartResponse getRcSmartResponse() {
        return this.rcSmartResponse;
    }

    public QueryRcApprovalMessageResponse setResultVo(MessageApprovalResultVO resultVo) {
        this.resultVo = resultVo;
        return this;
    }
    public MessageApprovalResultVO getResultVo() {
        return this.resultVo;
    }

    public QueryRcApprovalMessageResponse setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
        return this;
    }
    public String getPageUrl() {
        return this.pageUrl;
    }

}
