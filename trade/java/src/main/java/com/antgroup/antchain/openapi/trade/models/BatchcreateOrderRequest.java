// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class BatchcreateOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    //  批量下单场景编码 BatchOrderSceneEnum.online_acboss.getCode()
    @NameInMap("batch_order_scene")
    @Validation(required = true)
    public String batchOrderScene;

    //  批量下单批次号
    @NameInMap("batch_order_bsn_no")
    @Validation(required = true)
    public String batchOrderBsnNo;

    // 销售市场 com.antgroup.actradeprod.common.service.model.order.enums.SaleMarketEnum
    @NameInMap("sale_market")
    @Validation(required = true)
    public String saleMarket;

    // 租户Id
    @NameInMap("tenant_id")
    public String tenantId;

    // 租户名称
    @NameInMap("tenant_name")
    public String tenantName;

    // 操作人ID，不填则默认和租户ID一致
    @NameInMap("operator_id")
    public String operatorId;

    // 支付选项
    @NameInMap("pay_options")
    public PayOptions payOptions;

    // 商品实例列表
    @NameInMap("commodity_instance_list")
    @Validation(required = true)
    public java.util.List<CommodityInstance> commodityInstanceList;

    // 扩展属性，JSON字符串
    @NameInMap("extended_properties")
    @Validation(required = true)
    public String extendedProperties;

    public static BatchcreateOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateOrderRequest self = new BatchcreateOrderRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateOrderRequest setBatchOrderScene(String batchOrderScene) {
        this.batchOrderScene = batchOrderScene;
        return this;
    }
    public String getBatchOrderScene() {
        return this.batchOrderScene;
    }

    public BatchcreateOrderRequest setBatchOrderBsnNo(String batchOrderBsnNo) {
        this.batchOrderBsnNo = batchOrderBsnNo;
        return this;
    }
    public String getBatchOrderBsnNo() {
        return this.batchOrderBsnNo;
    }

    public BatchcreateOrderRequest setSaleMarket(String saleMarket) {
        this.saleMarket = saleMarket;
        return this;
    }
    public String getSaleMarket() {
        return this.saleMarket;
    }

    public BatchcreateOrderRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public BatchcreateOrderRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public BatchcreateOrderRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public BatchcreateOrderRequest setPayOptions(PayOptions payOptions) {
        this.payOptions = payOptions;
        return this;
    }
    public PayOptions getPayOptions() {
        return this.payOptions;
    }

    public BatchcreateOrderRequest setCommodityInstanceList(java.util.List<CommodityInstance> commodityInstanceList) {
        this.commodityInstanceList = commodityInstanceList;
        return this;
    }
    public java.util.List<CommodityInstance> getCommodityInstanceList() {
        return this.commodityInstanceList;
    }

    public BatchcreateOrderRequest setExtendedProperties(String extendedProperties) {
        this.extendedProperties = extendedProperties;
        return this;
    }
    public String getExtendedProperties() {
        return this.extendedProperties;
    }

}
