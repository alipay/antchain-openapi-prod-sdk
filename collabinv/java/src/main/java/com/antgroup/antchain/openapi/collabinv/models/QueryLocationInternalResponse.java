// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class QueryLocationInternalResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 置信度取值：A/B/C
    @NameInMap("confidence_value")
    public String confidenceValue;

    // 扩展字段，其他信息
    @NameInMap("ext_info")
    public String extInfo;

    public static QueryLocationInternalResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLocationInternalResponse self = new QueryLocationInternalResponse();
        return TeaModel.build(map, self);
    }

    public QueryLocationInternalResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLocationInternalResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLocationInternalResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLocationInternalResponse setConfidenceValue(String confidenceValue) {
        this.confidenceValue = confidenceValue;
        return this;
    }
    public String getConfidenceValue() {
        return this.confidenceValue;
    }

    public QueryLocationInternalResponse setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
