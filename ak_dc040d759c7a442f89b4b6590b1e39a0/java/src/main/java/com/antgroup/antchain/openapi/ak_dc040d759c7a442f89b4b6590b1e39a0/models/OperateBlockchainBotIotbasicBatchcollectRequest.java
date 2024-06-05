// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_dc040d759c7a442f89b4b6590b1e39a0.models;

import com.aliyun.tea.*;

public class OperateBlockchainBotIotbasicBatchcollectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 所属业务
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // 租户id
    @NameInMap("tenant_id")
    public String tenantId;

    // 上链数据列表
    @NameInMap("collect_info_list")
    @Validation(required = true)
    public java.util.List<CollectInfo> collectInfoList;

    public static OperateBlockchainBotIotbasicBatchcollectRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateBlockchainBotIotbasicBatchcollectRequest self = new OperateBlockchainBotIotbasicBatchcollectRequest();
        return TeaModel.build(map, self);
    }

    public OperateBlockchainBotIotbasicBatchcollectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateBlockchainBotIotbasicBatchcollectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateBlockchainBotIotbasicBatchcollectRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public OperateBlockchainBotIotbasicBatchcollectRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OperateBlockchainBotIotbasicBatchcollectRequest setCollectInfoList(java.util.List<CollectInfo> collectInfoList) {
        this.collectInfoList = collectInfoList;
        return this;
    }
    public java.util.List<CollectInfo> getCollectInfoList() {
        return this.collectInfoList;
    }

}
