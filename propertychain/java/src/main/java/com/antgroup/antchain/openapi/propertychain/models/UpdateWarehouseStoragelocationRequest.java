// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class UpdateWarehouseStoragelocationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 其他信息
    @NameInMap("extra_info")
    public String extraInfo;

    // 仓位id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 货物类型【DANGER：危险品，NON_DANGER：非危险品，FOOD：食品】
    @NameInMap("product_type")
    @Validation(required = true)
    public String productType;

    // 状态【AVAILABLE：可用，IN_USE：使用中，IN_CONFIG：配置中，DELETED：已删除】
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 仓位面积
    @NameInMap("storage_location_area")
    @Validation(required = true)
    public String storageLocationArea;

    // 仓位高度
    @NameInMap("storage_location_height")
    @Validation(required = true)
    public String storageLocationHeight;

    // 库位类型【CHILL：冷藏，FREEZE：冷冻，PASSAGE：通道，FLAT：平面， STEREO：立体】
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static UpdateWarehouseStoragelocationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWarehouseStoragelocationRequest self = new UpdateWarehouseStoragelocationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWarehouseStoragelocationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateWarehouseStoragelocationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateWarehouseStoragelocationRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public UpdateWarehouseStoragelocationRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateWarehouseStoragelocationRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public UpdateWarehouseStoragelocationRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateWarehouseStoragelocationRequest setStorageLocationArea(String storageLocationArea) {
        this.storageLocationArea = storageLocationArea;
        return this;
    }
    public String getStorageLocationArea() {
        return this.storageLocationArea;
    }

    public UpdateWarehouseStoragelocationRequest setStorageLocationHeight(String storageLocationHeight) {
        this.storageLocationHeight = storageLocationHeight;
        return this;
    }
    public String getStorageLocationHeight() {
        return this.storageLocationHeight;
    }

    public UpdateWarehouseStoragelocationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
