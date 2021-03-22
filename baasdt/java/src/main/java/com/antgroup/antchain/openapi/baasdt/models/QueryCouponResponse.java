// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryCouponResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 电子券详细信息
    @NameInMap("coupon")
    public Coupon coupon;

    // 交易区块高度
    @NameInMap("block_number")
    public Long blockNumber;

    public static QueryCouponResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCouponResponse self = new QueryCouponResponse();
        return TeaModel.build(map, self);
    }

    public QueryCouponResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCouponResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCouponResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCouponResponse setCoupon(Coupon coupon) {
        this.coupon = coupon;
        return this;
    }
    public Coupon getCoupon() {
        return this.coupon;
    }

    public QueryCouponResponse setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public Long getBlockNumber() {
        return this.blockNumber;
    }

}
