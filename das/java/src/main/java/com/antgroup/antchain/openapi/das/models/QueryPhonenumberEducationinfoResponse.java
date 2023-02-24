// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryPhonenumberEducationinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 教育信息
    @NameInMap("data")
    public EducationInfo data;

    public static QueryPhonenumberEducationinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPhonenumberEducationinfoResponse self = new QueryPhonenumberEducationinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryPhonenumberEducationinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPhonenumberEducationinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPhonenumberEducationinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPhonenumberEducationinfoResponse setData(EducationInfo data) {
        this.data = data;
        return this;
    }
    public EducationInfo getData() {
        return this.data;
    }

}
