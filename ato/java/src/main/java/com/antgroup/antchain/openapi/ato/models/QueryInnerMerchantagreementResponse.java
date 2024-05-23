// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerMerchantagreementResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 签约状态 枚举
    // TOBE 待签
    // FAIL 签约失败
    // SUCCESS 签约成功
    @NameInMap("sign_status")
    public String signStatus;

    // 签约时间
    @NameInMap("sign_date_str")
    public String signDateStr;

    // 协议内容 富文本
    @NameInMap("agreement_content")
    public String agreementContent;

    public static QueryInnerMerchantagreementResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerMerchantagreementResponse self = new QueryInnerMerchantagreementResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerMerchantagreementResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerMerchantagreementResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerMerchantagreementResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerMerchantagreementResponse setSignStatus(String signStatus) {
        this.signStatus = signStatus;
        return this;
    }
    public String getSignStatus() {
        return this.signStatus;
    }

    public QueryInnerMerchantagreementResponse setSignDateStr(String signDateStr) {
        this.signDateStr = signDateStr;
        return this;
    }
    public String getSignDateStr() {
        return this.signDateStr;
    }

    public QueryInnerMerchantagreementResponse setAgreementContent(String agreementContent) {
        this.agreementContent = agreementContent;
        return this;
    }
    public String getAgreementContent() {
        return this.agreementContent;
    }

}
