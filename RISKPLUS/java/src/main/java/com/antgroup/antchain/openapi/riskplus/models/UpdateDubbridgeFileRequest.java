// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class UpdateDubbridgeFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 授信申请订单号(资产方)
    @NameInMap("original_order_no")
    @Validation(required = true)
    public String originalOrderNo;

    // 客户编号
    @NameInMap("custom_no")
    @Validation(required = true)
    public String customNo;

    // 资料文件
    @NameInMap("materials")
    @Validation(required = true)
    public java.util.List<Material> materials;

    public static UpdateDubbridgeFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDubbridgeFileRequest self = new UpdateDubbridgeFileRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDubbridgeFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDubbridgeFileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDubbridgeFileRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public UpdateDubbridgeFileRequest setOriginalOrderNo(String originalOrderNo) {
        this.originalOrderNo = originalOrderNo;
        return this;
    }
    public String getOriginalOrderNo() {
        return this.originalOrderNo;
    }

    public UpdateDubbridgeFileRequest setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

    public UpdateDubbridgeFileRequest setMaterials(java.util.List<Material> materials) {
        this.materials = materials;
        return this;
    }
    public java.util.List<Material> getMaterials() {
        return this.materials;
    }

}
