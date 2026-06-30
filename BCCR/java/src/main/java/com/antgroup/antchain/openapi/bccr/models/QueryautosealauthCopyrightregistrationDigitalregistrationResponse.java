// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryautosealauthCopyrightregistrationDigitalregistrationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否支持静默签，true 支持 false  不支持
    @NameInMap("is_auto_seal")
    public Boolean isAutoSeal;

    public static QueryautosealauthCopyrightregistrationDigitalregistrationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryautosealauthCopyrightregistrationDigitalregistrationResponse self = new QueryautosealauthCopyrightregistrationDigitalregistrationResponse();
        return TeaModel.build(map, self);
    }

    public QueryautosealauthCopyrightregistrationDigitalregistrationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryautosealauthCopyrightregistrationDigitalregistrationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryautosealauthCopyrightregistrationDigitalregistrationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryautosealauthCopyrightregistrationDigitalregistrationResponse setIsAutoSeal(Boolean isAutoSeal) {
        this.isAutoSeal = isAutoSeal;
        return this;
    }
    public Boolean getIsAutoSeal() {
        return this.isAutoSeal;
    }

}
