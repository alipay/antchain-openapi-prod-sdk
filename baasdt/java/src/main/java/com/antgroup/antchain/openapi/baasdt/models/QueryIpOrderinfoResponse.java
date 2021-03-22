// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpOrderinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 订单信息
    @NameInMap("ip_order")
    public IPOrder ipOrder;

    // IP授权销售数据
    @NameInMap("ip_sales_info_list")
    public java.util.List<IPSalesInfo> ipSalesInfoList;

    public static QueryIpOrderinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIpOrderinfoResponse self = new QueryIpOrderinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryIpOrderinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIpOrderinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIpOrderinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIpOrderinfoResponse setIpOrder(IPOrder ipOrder) {
        this.ipOrder = ipOrder;
        return this;
    }
    public IPOrder getIpOrder() {
        return this.ipOrder;
    }

    public QueryIpOrderinfoResponse setIpSalesInfoList(java.util.List<IPSalesInfo> ipSalesInfoList) {
        this.ipSalesInfoList = ipSalesInfoList;
        return this;
    }
    public java.util.List<IPSalesInfo> getIpSalesInfoList() {
        return this.ipSalesInfoList;
    }

}
