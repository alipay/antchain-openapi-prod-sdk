// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateCollectorUploadfileurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 待上传文件的业务类型，
    // 设备心跳数据：COLLECT_MUL
    // 设备业务数据： COLLECT_DEVICE_BIZ_DATA
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    public static CreateCollectorUploadfileurlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCollectorUploadfileurlRequest self = new CreateCollectorUploadfileurlRequest();
        return TeaModel.build(map, self);
    }

    public CreateCollectorUploadfileurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCollectorUploadfileurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateCollectorUploadfileurlRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateCollectorUploadfileurlRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

}
