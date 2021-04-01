// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryMerchantResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商户完整信息
    // {
    //             "tenant_id": "Z",
    //             "did": "did:mychain:ct",
    //             "admin_id": "ed7b3acb718e2f91bc8fab6a5e7cc3c061",
    //             "fund_manager_id": "b7ecd55bde04827b3e611a741d",
    //             "description": "SK",
    //             "is_equity_provider": true,
    //             "is_equity_consumer": true,
    //             "is_asset_issuer": true,
    //             "status": 0,
    //             "provision": {
    //                 "currency": "CNY",
    //                 "debit": "99999999.0000",
    //                 "credit_max": "99999999.0000",
    //                 "credit_used": "0.0000"
    //             }
    //         }
    @NameInMap("merchant")
    public Merchant merchant;

    // 查询商户信息时的区块高度
    @NameInMap("block_number")
    public Long blockNumber;

    public static QueryMerchantResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMerchantResponse self = new QueryMerchantResponse();
        return TeaModel.build(map, self);
    }

    public QueryMerchantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMerchantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMerchantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMerchantResponse setMerchant(Merchant merchant) {
        this.merchant = merchant;
        return this;
    }
    public Merchant getMerchant() {
        return this.merchant;
    }

    public QueryMerchantResponse setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public Long getBlockNumber() {
        return this.blockNumber;
    }

}
