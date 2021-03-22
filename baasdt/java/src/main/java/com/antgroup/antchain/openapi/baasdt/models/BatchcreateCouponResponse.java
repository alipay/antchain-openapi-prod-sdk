// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class BatchcreateCouponResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 交易块高
    @NameInMap("block_number")
    public Long blockNumber;

    // 电子券创建结果：电子券ID列表
    @NameInMap("coupon_id_list")
    public java.util.List<String> couponIdList;

    public static BatchcreateCouponResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateCouponResponse self = new BatchcreateCouponResponse();
        return TeaModel.build(map, self);
    }

    public BatchcreateCouponResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchcreateCouponResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchcreateCouponResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchcreateCouponResponse setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public Long getBlockNumber() {
        return this.blockNumber;
    }

    public BatchcreateCouponResponse setCouponIdList(java.util.List<String> couponIdList) {
        this.couponIdList = couponIdList;
        return this;
    }
    public java.util.List<String> getCouponIdList() {
        return this.couponIdList;
    }

}
