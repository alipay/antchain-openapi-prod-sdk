// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commonrcsmart.models;

import com.aliyun.tea.*;

public class QueryRcApprovalImageResponse extends TeaModel {
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

    // 通用版图片审核结果
    @NameInMap("result_vo")
    public ImageApprovalResultVO resultVo;

    // 审核结果页
    @NameInMap("page_url")
    public String pageUrl;

    public static QueryRcApprovalImageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRcApprovalImageResponse self = new QueryRcApprovalImageResponse();
        return TeaModel.build(map, self);
    }

    public QueryRcApprovalImageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRcApprovalImageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRcApprovalImageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRcApprovalImageResponse setRcSmartResponse(RcSmartResponse rcSmartResponse) {
        this.rcSmartResponse = rcSmartResponse;
        return this;
    }
    public RcSmartResponse getRcSmartResponse() {
        return this.rcSmartResponse;
    }

    public QueryRcApprovalImageResponse setResultVo(ImageApprovalResultVO resultVo) {
        this.resultVo = resultVo;
        return this;
    }
    public ImageApprovalResultVO getResultVo() {
        return this.resultVo;
    }

    public QueryRcApprovalImageResponse setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
        return this;
    }
    public String getPageUrl() {
        return this.pageUrl;
    }

}
