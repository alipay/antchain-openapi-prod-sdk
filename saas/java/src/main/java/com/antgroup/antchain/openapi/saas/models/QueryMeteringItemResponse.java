// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas.models;

import com.aliyun.tea.*;

public class QueryMeteringItemResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商业产品码
    @NameInMap("business_code")
    public String businessCode;

    // 计量域
    @NameInMap("metering_domain_code")
    public String meteringDomainCode;

    // 计量项
    @NameInMap("item_rules")
    public java.util.List<ItemRule> itemRules;

    public static QueryMeteringItemResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMeteringItemResponse self = new QueryMeteringItemResponse();
        return TeaModel.build(map, self);
    }

    public QueryMeteringItemResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMeteringItemResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMeteringItemResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMeteringItemResponse setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public QueryMeteringItemResponse setMeteringDomainCode(String meteringDomainCode) {
        this.meteringDomainCode = meteringDomainCode;
        return this;
    }
    public String getMeteringDomainCode() {
        return this.meteringDomainCode;
    }

    public QueryMeteringItemResponse setItemRules(java.util.List<ItemRule> itemRules) {
        this.itemRules = itemRules;
        return this;
    }
    public java.util.List<ItemRule> getItemRules() {
        return this.itemRules;
    }

}
