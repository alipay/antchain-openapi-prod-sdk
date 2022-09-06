// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeCompanyItemsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回公司列表
    @NameInMap("business_items")
    public java.util.List<CompanyItems> businessItems;

    // 企业信息个数
    @NameInMap("total")
    public Long total;

    public static QueryDubbridgeCompanyItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeCompanyItemsResponse self = new QueryDubbridgeCompanyItemsResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeCompanyItemsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeCompanyItemsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeCompanyItemsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeCompanyItemsResponse setBusinessItems(java.util.List<CompanyItems> businessItems) {
        this.businessItems = businessItems;
        return this;
    }
    public java.util.List<CompanyItems> getBusinessItems() {
        return this.businessItems;
    }

    public QueryDubbridgeCompanyItemsResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
