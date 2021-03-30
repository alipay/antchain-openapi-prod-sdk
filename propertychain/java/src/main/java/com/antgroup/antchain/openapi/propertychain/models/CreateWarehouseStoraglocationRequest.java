// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class CreateWarehouseStoraglocationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 是否禁用智能监管
    @NameInMap("disable_surv")
    public Boolean disableSurv;

    // 其他信息
    @NameInMap("extra_info")
    public String extraInfo;

    // 库位名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

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

    // 仓位虚拟id
    @NameInMap("virtual_storage_location_id")
    @Validation(required = true)
    public String virtualStorageLocationId;

    // 仓库id
    @NameInMap("warehouse_id")
    @Validation(required = true)
    public String warehouseId;

    public static CreateWarehouseStoraglocationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWarehouseStoraglocationRequest self = new CreateWarehouseStoraglocationRequest();
        return TeaModel.build(map, self);
    }

    public CreateWarehouseStoraglocationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateWarehouseStoraglocationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateWarehouseStoraglocationRequest setDisableSurv(Boolean disableSurv) {
        this.disableSurv = disableSurv;
        return this;
    }
    public Boolean getDisableSurv() {
        return this.disableSurv;
    }

    public CreateWarehouseStoraglocationRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public CreateWarehouseStoraglocationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateWarehouseStoraglocationRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public CreateWarehouseStoraglocationRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateWarehouseStoraglocationRequest setStorageLocationArea(String storageLocationArea) {
        this.storageLocationArea = storageLocationArea;
        return this;
    }
    public String getStorageLocationArea() {
        return this.storageLocationArea;
    }

    public CreateWarehouseStoraglocationRequest setStorageLocationHeight(String storageLocationHeight) {
        this.storageLocationHeight = storageLocationHeight;
        return this;
    }
    public String getStorageLocationHeight() {
        return this.storageLocationHeight;
    }

    public CreateWarehouseStoraglocationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateWarehouseStoraglocationRequest setVirtualStorageLocationId(String virtualStorageLocationId) {
        this.virtualStorageLocationId = virtualStorageLocationId;
        return this;
    }
    public String getVirtualStorageLocationId() {
        return this.virtualStorageLocationId;
    }

    public CreateWarehouseStoraglocationRequest setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }
    public String getWarehouseId() {
        return this.warehouseId;
    }

}
