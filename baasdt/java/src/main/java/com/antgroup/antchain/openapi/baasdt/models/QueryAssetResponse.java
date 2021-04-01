// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryAssetResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 资产完整信息
    // {
    //             "asset_id": "CT::Asset001",
    //             "asset_name": "CTPoints",
    //             "tenant_id": "OREDKOCN",
    //             "admin_id": "f46857d8796fc2b829862e2752bda38f7eefeec5581ad41398002f50a3ad8ccd",
    //             "currency": "CNY",
    //             "asset_rate": "1000.0000",
    //             "total_issue_balance": "11111111.0000",
    //             "issue_account_balance": "0.0000",
    //             "relay_Account_balance": "0.0000",
    //             "receive_payment_account_balance": "0.0000",
    //             "overdue_recovery_account_balance": "",
    //             "status": 76,
    //             "asset_ext_info": {
    //                 "dispense_tenant_id": "",
    //                 "dispense_balance": "",
    //                 "user_id": "",
    //                 "user_credit_balance": ""
    //             }
    //         }
    @NameInMap("asset")
    public Asset asset;

    public static QueryAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAssetResponse self = new QueryAssetResponse();
        return TeaModel.build(map, self);
    }

    public QueryAssetResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAssetResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAssetResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAssetResponse setAsset(Asset asset) {
        this.asset = asset;
        return this;
    }
    public Asset getAsset() {
        return this.asset;
    }

}
