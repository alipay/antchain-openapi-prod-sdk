// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CountIpAccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户数量
    @NameInMap("user_count")
    public Long userCount;

    // 版权方数量
    @NameInMap("seller_count")
    public Long sellerCount;

    // 版权方数量
    @NameInMap("buyer_count")
    public Long buyerCount;

    public static CountIpAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CountIpAccountResponse self = new CountIpAccountResponse();
        return TeaModel.build(map, self);
    }

    public CountIpAccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CountIpAccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CountIpAccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CountIpAccountResponse setUserCount(Long userCount) {
        this.userCount = userCount;
        return this;
    }
    public Long getUserCount() {
        return this.userCount;
    }

    public CountIpAccountResponse setSellerCount(Long sellerCount) {
        this.sellerCount = sellerCount;
        return this;
    }
    public Long getSellerCount() {
        return this.sellerCount;
    }

    public CountIpAccountResponse setBuyerCount(Long buyerCount) {
        this.buyerCount = buyerCount;
        return this;
    }
    public Long getBuyerCount() {
        return this.buyerCount;
    }

}
