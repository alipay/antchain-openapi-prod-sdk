// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryDataBytxhashRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 链上交易hash
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 上链类型枚举： 
    // REGISTER_DEVICE	设备注册
    // DISTRIBUTE_DEVICE	设备发行
    // LABEL_DATA	标签流转数据收集
    // COLLECT_DATA	设备数据收集
    // DEVICE_BIZ_DATA	设备业务订单数据收集
    // REGISTER_PERIPHERAL_DEVICE	外围设备注册
    @NameInMap("contract_method")
    @Validation(required = true)
    public String contractMethod;

    public static QueryDataBytxhashRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataBytxhashRequest self = new QueryDataBytxhashRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataBytxhashRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDataBytxhashRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDataBytxhashRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public QueryDataBytxhashRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public QueryDataBytxhashRequest setContractMethod(String contractMethod) {
        this.contractMethod = contractMethod;
        return this;
    }
    public String getContractMethod() {
        return this.contractMethod;
    }

}
