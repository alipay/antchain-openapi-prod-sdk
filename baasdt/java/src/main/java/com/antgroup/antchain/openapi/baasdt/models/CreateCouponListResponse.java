// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CreateCouponListResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 电子券创建结果：电子券ID列表
    @NameInMap("coupon_id_list")
    public java.util.List<String> couponIdList;

    // 交易区块高度
    @NameInMap("block_number")
    public Long blockNumber;

    public static CreateCouponListResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCouponListResponse self = new CreateCouponListResponse();
        return TeaModel.build(map, self);
    }

    public CreateCouponListResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateCouponListResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateCouponListResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateCouponListResponse setCouponIdList(java.util.List<String> couponIdList) {
        this.couponIdList = couponIdList;
        return this;
    }
    public java.util.List<String> getCouponIdList() {
        return this.couponIdList;
    }

    public CreateCouponListResponse setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public Long getBlockNumber() {
        return this.blockNumber;
    }

}
