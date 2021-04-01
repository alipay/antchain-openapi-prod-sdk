// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDistributionFundShopResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 审批中额度
    @NameInMap("approve_quota")
    public String approveQuota;

    // 可提现额度
    @NameInMap("balance")
    public String balance;

    // 已到账额度
    @NameInMap("finish_quota")
    public String finishQuota;

    // 商户id
    @NameInMap("shop_id")
    public String shopId;

    public static QueryDistributionFundShopResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributionFundShopResponse self = new QueryDistributionFundShopResponse();
        return TeaModel.build(map, self);
    }

    public QueryDistributionFundShopResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDistributionFundShopResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDistributionFundShopResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDistributionFundShopResponse setApproveQuota(String approveQuota) {
        this.approveQuota = approveQuota;
        return this;
    }
    public String getApproveQuota() {
        return this.approveQuota;
    }

    public QueryDistributionFundShopResponse setBalance(String balance) {
        this.balance = balance;
        return this;
    }
    public String getBalance() {
        return this.balance;
    }

    public QueryDistributionFundShopResponse setFinishQuota(String finishQuota) {
        this.finishQuota = finishQuota;
        return this;
    }
    public String getFinishQuota() {
        return this.finishQuota;
    }

    public QueryDistributionFundShopResponse setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

}
