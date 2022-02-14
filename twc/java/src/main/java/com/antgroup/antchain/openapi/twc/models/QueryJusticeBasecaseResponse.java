// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryJusticeBasecaseResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务码，0表示成功 其余都是代表失败
    @NameInMap("code")
    public Long code;

    // 案件基础信息出参
    @NameInMap("case_base_info_list")
    public java.util.List<CaseBaseInfo> caseBaseInfoList;

    // 响应的详细信息
    @NameInMap("message")
    public String message;

    public static QueryJusticeBasecaseResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryJusticeBasecaseResponse self = new QueryJusticeBasecaseResponse();
        return TeaModel.build(map, self);
    }

    public QueryJusticeBasecaseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryJusticeBasecaseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryJusticeBasecaseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryJusticeBasecaseResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryJusticeBasecaseResponse setCaseBaseInfoList(java.util.List<CaseBaseInfo> caseBaseInfoList) {
        this.caseBaseInfoList = caseBaseInfoList;
        return this;
    }
    public java.util.List<CaseBaseInfo> getCaseBaseInfoList() {
        return this.caseBaseInfoList;
    }

    public QueryJusticeBasecaseResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
