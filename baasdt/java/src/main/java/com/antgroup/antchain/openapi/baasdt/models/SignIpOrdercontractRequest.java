// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SignIpOrdercontractRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 订单ID
    @NameInMap("ip_order_id")
    @Validation(required = true)
    public String ipOrderId;

    // 订单合同文件OSS文件key
    @NameInMap("contract_file_url")
    public String contractFileUrl;

    // 备注信息
    @NameInMap("memo")
    public String memo;

    public static SignIpOrdercontractRequest build(java.util.Map<String, ?> map) throws Exception {
        SignIpOrdercontractRequest self = new SignIpOrdercontractRequest();
        return TeaModel.build(map, self);
    }

    public SignIpOrdercontractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SignIpOrdercontractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SignIpOrdercontractRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public SignIpOrdercontractRequest setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

    public SignIpOrdercontractRequest setContractFileUrl(String contractFileUrl) {
        this.contractFileUrl = contractFileUrl;
        return this;
    }
    public String getContractFileUrl() {
        return this.contractFileUrl;
    }

    public SignIpOrdercontractRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}
