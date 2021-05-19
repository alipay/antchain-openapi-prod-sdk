// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyInsuranceInventoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 库存申报交易号，调用方生成的唯一编码
    @NameInMap("trade_no")
    @Validation(required = true, maxLength = 50)
    public String tradeNo;

    // 库存申报编号
    @NameInMap("inventory_no")
    @Validation(required = true, maxLength = 50)
    public String inventoryNo;

    // 库存查询时间，yyyy-mm-dd，精确到（天）
    @NameInMap("inventory_query_date")
    @Validation(required = true)
    public String inventoryQueryDate;

    // 仓库代码
    // 
    // 
    @NameInMap("repository_code")
    @Validation(required = true, maxLength = 50)
    public String repositoryCode;

    // 库存货物列表
    @NameInMap("inventory_cargos")
    @Validation(required = true)
    public java.util.List<InventoryCargo> inventoryCargos;

    public static ApplyInsuranceInventoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInsuranceInventoryRequest self = new ApplyInsuranceInventoryRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInsuranceInventoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyInsuranceInventoryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyInsuranceInventoryRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public ApplyInsuranceInventoryRequest setInventoryNo(String inventoryNo) {
        this.inventoryNo = inventoryNo;
        return this;
    }
    public String getInventoryNo() {
        return this.inventoryNo;
    }

    public ApplyInsuranceInventoryRequest setInventoryQueryDate(String inventoryQueryDate) {
        this.inventoryQueryDate = inventoryQueryDate;
        return this;
    }
    public String getInventoryQueryDate() {
        return this.inventoryQueryDate;
    }

    public ApplyInsuranceInventoryRequest setRepositoryCode(String repositoryCode) {
        this.repositoryCode = repositoryCode;
        return this;
    }
    public String getRepositoryCode() {
        return this.repositoryCode;
    }

    public ApplyInsuranceInventoryRequest setInventoryCargos(java.util.List<InventoryCargo> inventoryCargos) {
        this.inventoryCargos = inventoryCargos;
        return this;
    }
    public java.util.List<InventoryCargo> getInventoryCargos() {
        return this.inventoryCargos;
    }

}
