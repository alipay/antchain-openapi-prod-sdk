// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class QueryMarketingCouponResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 优惠券列表
    @NameInMap("coupon_list")
    public java.util.List<Coupon> couponList;

    public static QueryMarketingCouponResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMarketingCouponResponse self = new QueryMarketingCouponResponse();
        return TeaModel.build(map, self);
    }

    public QueryMarketingCouponResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMarketingCouponResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMarketingCouponResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMarketingCouponResponse setCouponList(java.util.List<Coupon> couponList) {
        this.couponList = couponList;
        return this;
    }
    public java.util.List<Coupon> getCouponList() {
        return this.couponList;
    }

}
