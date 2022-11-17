// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class UploadNotaryAttachmentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单ID
    @NameInMap("notary_order_id")
    @Validation(required = true)
    public String notaryOrderId;

    // 材料文件
    @NameInMap("material_file_list")
    @Validation(required = true)
    public java.util.List<String> materialFileList;

    public static UploadNotaryAttachmentRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadNotaryAttachmentRequest self = new UploadNotaryAttachmentRequest();
        return TeaModel.build(map, self);
    }

    public UploadNotaryAttachmentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadNotaryAttachmentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadNotaryAttachmentRequest setNotaryOrderId(String notaryOrderId) {
        this.notaryOrderId = notaryOrderId;
        return this;
    }
    public String getNotaryOrderId() {
        return this.notaryOrderId;
    }

    public UploadNotaryAttachmentRequest setMaterialFileList(java.util.List<String> materialFileList) {
        this.materialFileList = materialFileList;
        return this;
    }
    public java.util.List<String> getMaterialFileList() {
        return this.materialFileList;
    }

}
