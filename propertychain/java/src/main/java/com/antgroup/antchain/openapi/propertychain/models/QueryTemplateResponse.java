// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class QueryTemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 时间
    @NameInMap("date")
    public Long date;

    // 请求id
    @NameInMap("request_id")
    public String requestId;

    // 数据字典信息
    @NameInMap("template_info")
    public TemplateInfo templateInfo;

    public static QueryTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTemplateResponse self = new QueryTemplateResponse();
        return TeaModel.build(map, self);
    }

    public QueryTemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTemplateResponse setDate(Long date) {
        this.date = date;
        return this;
    }
    public Long getDate() {
        return this.date;
    }

    public QueryTemplateResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTemplateResponse setTemplateInfo(TemplateInfo templateInfo) {
        this.templateInfo = templateInfo;
        return this;
    }
    public TemplateInfo getTemplateInfo() {
        return this.templateInfo;
    }

}
