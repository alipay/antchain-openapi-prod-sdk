// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeleteDeviceRelationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 主设备链上id
    @NameInMap("subject_chain_device_id")
    @Validation(required = true)
    public String subjectChainDeviceId;

    // 关系谓语，目前取值范围：SUB_DEVICE、MAIN_DEVICE
    @NameInMap("predicate")
    @Validation(required = true)
    public String predicate;

    // 目标设备链上id
    @NameInMap("object_chain_device_id")
    @Validation(required = true)
    public String objectChainDeviceId;

    public static DeleteDeviceRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceRelationRequest self = new DeleteDeviceRelationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceRelationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteDeviceRelationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteDeviceRelationRequest setSubjectChainDeviceId(String subjectChainDeviceId) {
        this.subjectChainDeviceId = subjectChainDeviceId;
        return this;
    }
    public String getSubjectChainDeviceId() {
        return this.subjectChainDeviceId;
    }

    public DeleteDeviceRelationRequest setPredicate(String predicate) {
        this.predicate = predicate;
        return this;
    }
    public String getPredicate() {
        return this.predicate;
    }

    public DeleteDeviceRelationRequest setObjectChainDeviceId(String objectChainDeviceId) {
        this.objectChainDeviceId = objectChainDeviceId;
        return this;
    }
    public String getObjectChainDeviceId() {
        return this.objectChainDeviceId;
    }

}
