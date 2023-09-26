// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class AddChaininsightStatisticRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 统计类型，    ContractStatistic： 合约性能检测指标
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 链上合约地址
    @NameInMap("hex_address")
    public String hexAddress;

    // 租户ID，留空
    @NameInMap("tenant_id")
    public String tenantId;

    public static AddChaininsightStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        AddChaininsightStatisticRequest self = new AddChaininsightStatisticRequest();
        return TeaModel.build(map, self);
    }

    public AddChaininsightStatisticRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddChaininsightStatisticRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddChaininsightStatisticRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AddChaininsightStatisticRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddChaininsightStatisticRequest setHexAddress(String hexAddress) {
        this.hexAddress = hexAddress;
        return this;
    }
    public String getHexAddress() {
        return this.hexAddress;
    }

    public AddChaininsightStatisticRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
