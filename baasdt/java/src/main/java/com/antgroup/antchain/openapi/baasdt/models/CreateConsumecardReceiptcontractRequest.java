// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CreateConsumecardReceiptcontractRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础请求对象
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 合同编号，纯数字
    @NameInMap("contract_number")
    @Validation(required = true)
    public String contractNumber;

    public static CreateConsumecardReceiptcontractRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumecardReceiptcontractRequest self = new CreateConsumecardReceiptcontractRequest();
        return TeaModel.build(map, self);
    }

    public CreateConsumecardReceiptcontractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateConsumecardReceiptcontractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateConsumecardReceiptcontractRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public CreateConsumecardReceiptcontractRequest setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
        return this;
    }
    public String getContractNumber() {
        return this.contractNumber;
    }

}
