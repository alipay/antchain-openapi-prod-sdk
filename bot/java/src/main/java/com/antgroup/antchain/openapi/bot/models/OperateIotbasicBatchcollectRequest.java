// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OperateIotbasicBatchcollectRequest extends TeaModel {
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
    @Validation(required = true)
    public String tenantId;

    // 上链数据列表
    @NameInMap("collect_info_list")
    @Validation(required = true)
    public java.util.List<CollectInfo> collectInfoList;

    public static OperateIotbasicBatchcollectRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateIotbasicBatchcollectRequest self = new OperateIotbasicBatchcollectRequest();
        return TeaModel.build(map, self);
    }

    public OperateIotbasicBatchcollectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateIotbasicBatchcollectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateIotbasicBatchcollectRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public OperateIotbasicBatchcollectRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OperateIotbasicBatchcollectRequest setCollectInfoList(java.util.List<CollectInfo> collectInfoList) {
        this.collectInfoList = collectInfoList;
        return this;
    }
    public java.util.List<CollectInfo> getCollectInfoList() {
        return this.collectInfoList;
    }

}
