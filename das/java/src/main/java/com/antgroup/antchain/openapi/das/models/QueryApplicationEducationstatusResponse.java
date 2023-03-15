// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryApplicationEducationstatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 学籍信息
    @NameInMap("data")
    public java.util.List<EducationStatus> data;

    public static QueryApplicationEducationstatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationEducationstatusResponse self = new QueryApplicationEducationstatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryApplicationEducationstatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryApplicationEducationstatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryApplicationEducationstatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryApplicationEducationstatusResponse setData(java.util.List<EducationStatus> data) {
        this.data = data;
        return this;
    }
    public java.util.List<EducationStatus> getData() {
        return this.data;
    }

}
