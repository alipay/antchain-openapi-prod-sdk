// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_dc040d759c7a442f89b4b6590b1e39a0.models;

import com.aliyun.tea.*;

public class QueryBlockchainBotIotbasicDevicecollectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询结束时间
    @NameInMap("end_time")
    public String endTime;

    // 资产类型
    @NameInMap("data_scene")
    @Validation(required = true)
    public String dataScene;

    // 所属业务
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // 租户id
    @NameInMap("tenant_id")
    public String tenantId;

    // 上链hash
    @NameInMap("antchain_id")
    public String antchainId;

    // 上链数据内容 json
    @NameInMap("asset_data")
    public String assetData;

    // 每页数量
    @NameInMap("page_size")
    @Validation(required = true, maximum = 100, minimum = 1)
    public Long pageSize;

    // 当前页码
    @NameInMap("current_page")
    @Validation(required = true)
    public Long currentPage;

    // 业务id
    @NameInMap("business_id")
    public String businessId;

    // 查询开始时间
    @NameInMap("start_time")
    public String startTime;

    public static QueryBlockchainBotIotbasicDevicecollectRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBotIotbasicDevicecollectRequest self = new QueryBlockchainBotIotbasicDevicecollectRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBotIotbasicDevicecollectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBlockchainBotIotbasicDevicecollectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBlockchainBotIotbasicDevicecollectRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryBlockchainBotIotbasicDevicecollectRequest setDataScene(String dataScene) {
        this.dataScene = dataScene;
        return this;
    }
    public String getDataScene() {
        return this.dataScene;
    }

    public QueryBlockchainBotIotbasicDevicecollectRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public QueryBlockchainBotIotbasicDevicecollectRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryBlockchainBotIotbasicDevicecollectRequest setAntchainId(String antchainId) {
        this.antchainId = antchainId;
        return this;
    }
    public String getAntchainId() {
        return this.antchainId;
    }

    public QueryBlockchainBotIotbasicDevicecollectRequest setAssetData(String assetData) {
        this.assetData = assetData;
        return this;
    }
    public String getAssetData() {
        return this.assetData;
    }

    public QueryBlockchainBotIotbasicDevicecollectRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryBlockchainBotIotbasicDevicecollectRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryBlockchainBotIotbasicDevicecollectRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public QueryBlockchainBotIotbasicDevicecollectRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
