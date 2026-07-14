// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commerce.models;

import com.aliyun.tea.*;

public class SettleSignInfo extends TeaModel {
    // 合同号
    /**
     * <strong>example:</strong>
     * <p>202106240C01241784</p>
     */
    @NameInMap("contract_id")
    @Validation(required = true)
    public String contractId;

    // 实例号
    /**
     * <strong>example:</strong>
     * <p>A0MYTCNCEHERUE1ZXEMOCZBWO</p>
     */
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 订购号，表示一次签约关系
    /**
     * <strong>example:</strong>
     * <p>2021122218000801f193cb49e4b27</p>
     */
    @NameInMap("subscribe_id")
    @Validation(required = true)
    public String subscribeId;

    // 商品码
    /**
     * <strong>example:</strong>
     * <p>ANFXFM00325176</p>
     */
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    public static SettleSignInfo build(java.util.Map<String, ?> map) throws Exception {
        SettleSignInfo self = new SettleSignInfo();
        return TeaModel.build(map, self);
    }

    public SettleSignInfo setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public SettleSignInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SettleSignInfo setSubscribeId(String subscribeId) {
        this.subscribeId = subscribeId;
        return this;
    }
    public String getSubscribeId() {
        return this.subscribeId;
    }

    public SettleSignInfo setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
