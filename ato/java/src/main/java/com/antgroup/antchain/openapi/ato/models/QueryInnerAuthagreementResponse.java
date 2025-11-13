// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerAuthagreementResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否已授权
    @NameInMap("agreed")
    public Boolean agreed;

    public static QueryInnerAuthagreementResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerAuthagreementResponse self = new QueryInnerAuthagreementResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerAuthagreementResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerAuthagreementResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerAuthagreementResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerAuthagreementResponse setAgreed(Boolean agreed) {
        this.agreed = agreed;
        return this;
    }
    public Boolean getAgreed() {
        return this.agreed;
    }

}
