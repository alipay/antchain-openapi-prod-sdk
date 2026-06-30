// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryPoiMallpointbalanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 支付宝小程序用户唯一ID
    @NameInMap("open_id")
    public String openId;

    // 门店ID
    @NameInMap("store_id")
    public String storeId;

    // 分期主订单号
    @NameInMap("biz_order_no")
    public String bizOrderNo;

    // 商城可用余额金额
    @NameInMap("available_balance")
    public String availableBalance;

    // 商城已消费金额
    @NameInMap("consumed_amount")
    public String consumedAmount;

    public static QueryPoiMallpointbalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPoiMallpointbalanceResponse self = new QueryPoiMallpointbalanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryPoiMallpointbalanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPoiMallpointbalanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPoiMallpointbalanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPoiMallpointbalanceResponse setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public QueryPoiMallpointbalanceResponse setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public QueryPoiMallpointbalanceResponse setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public QueryPoiMallpointbalanceResponse setAvailableBalance(String availableBalance) {
        this.availableBalance = availableBalance;
        return this;
    }
    public String getAvailableBalance() {
        return this.availableBalance;
    }

    public QueryPoiMallpointbalanceResponse setConsumedAmount(String consumedAmount) {
        this.consumedAmount = consumedAmount;
        return this;
    }
    public String getConsumedAmount() {
        return this.consumedAmount;
    }

}
