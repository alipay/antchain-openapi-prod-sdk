// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CancelIpAuthtradebillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 授权模式销售数据的账单ID
    @NameInMap("ip_bill_id")
    @Validation(required = true)
    public String ipBillId;

    // 买家的链上账户Id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 备注信息
    @NameInMap("memo")
    public String memo;

    public static CancelIpAuthtradebillRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelIpAuthtradebillRequest self = new CancelIpAuthtradebillRequest();
        return TeaModel.build(map, self);
    }

    public CancelIpAuthtradebillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelIpAuthtradebillRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelIpAuthtradebillRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public CancelIpAuthtradebillRequest setIpBillId(String ipBillId) {
        this.ipBillId = ipBillId;
        return this;
    }
    public String getIpBillId() {
        return this.ipBillId;
    }

    public CancelIpAuthtradebillRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CancelIpAuthtradebillRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}
