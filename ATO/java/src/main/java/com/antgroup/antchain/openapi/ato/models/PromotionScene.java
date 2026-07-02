// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PromotionScene extends TeaModel {
    // 租户id
    /**
     * <strong>example:</strong>
     * <p>VBVKBCHQ</p>
     */
    @NameInMap("tenant_id")
    public String tenantId;

    // 场景码
    /**
     * <strong>example:</strong>
     * <p>APDKQOWE</p>
     */
    @NameInMap("scene_code")
    public String sceneCode;

    // 场景名称
    /**
     * <strong>example:</strong>
     * <p>场景名称</p>
     */
    @NameInMap("scene_name")
    public String sceneName;

    // 场景备注
    /**
     * <strong>example:</strong>
     * <p>备注内容</p>
     */
    @NameInMap("scene_remark")
    public String sceneRemark;

    // 场景商品数量
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("scene_product_amount")
    public Long sceneProductAmount;

    // 已上线场景商品数量
    /**
     * <strong>example:</strong>
     * <p>已上线场景商品数量</p>
     */
    @NameInMap("online_scene_product_amount")
    public Long onlineSceneProductAmount;

    public static PromotionScene build(java.util.Map<String, ?> map) throws Exception {
        PromotionScene self = new PromotionScene();
        return TeaModel.build(map, self);
    }

    public PromotionScene setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PromotionScene setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public PromotionScene setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public PromotionScene setSceneRemark(String sceneRemark) {
        this.sceneRemark = sceneRemark;
        return this;
    }
    public String getSceneRemark() {
        return this.sceneRemark;
    }

    public PromotionScene setSceneProductAmount(Long sceneProductAmount) {
        this.sceneProductAmount = sceneProductAmount;
        return this;
    }
    public Long getSceneProductAmount() {
        return this.sceneProductAmount;
    }

    public PromotionScene setOnlineSceneProductAmount(Long onlineSceneProductAmount) {
        this.onlineSceneProductAmount = onlineSceneProductAmount;
        return this;
    }
    public Long getOnlineSceneProductAmount() {
        return this.onlineSceneProductAmount;
    }

}
