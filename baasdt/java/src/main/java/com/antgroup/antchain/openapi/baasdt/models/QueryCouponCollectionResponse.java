// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryCouponCollectionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 批次详情
    @NameInMap("coupon_collection")
    public CouponCollection couponCollection;

    // 交易区块高度
    @NameInMap("block_number")
    public Long blockNumber;

    public static QueryCouponCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCouponCollectionResponse self = new QueryCouponCollectionResponse();
        return TeaModel.build(map, self);
    }

    public QueryCouponCollectionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCouponCollectionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCouponCollectionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCouponCollectionResponse setCouponCollection(CouponCollection couponCollection) {
        this.couponCollection = couponCollection;
        return this;
    }
    public CouponCollection getCouponCollection() {
        return this.couponCollection;
    }

    public QueryCouponCollectionResponse setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public Long getBlockNumber() {
        return this.blockNumber;
    }

}
