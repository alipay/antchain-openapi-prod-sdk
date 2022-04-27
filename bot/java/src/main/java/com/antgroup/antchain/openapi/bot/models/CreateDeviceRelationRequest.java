// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateDeviceRelationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 主设备链上id
    @NameInMap("subject_chain_device_id")
    @Validation(required = true)
    public String subjectChainDeviceId;

    // 关系谓语，目前的取值范围：SUB_DEVICE（子设备）
    @NameInMap("predicate")
    @Validation(required = true)
    public String predicate;

    // 关联设备链上id列表
    @NameInMap("object_chain_device_id_list")
    @Validation(required = true)
    public java.util.List<String> objectChainDeviceIdList;

    public static CreateDeviceRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceRelationRequest self = new CreateDeviceRelationRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeviceRelationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDeviceRelationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDeviceRelationRequest setSubjectChainDeviceId(String subjectChainDeviceId) {
        this.subjectChainDeviceId = subjectChainDeviceId;
        return this;
    }
    public String getSubjectChainDeviceId() {
        return this.subjectChainDeviceId;
    }

    public CreateDeviceRelationRequest setPredicate(String predicate) {
        this.predicate = predicate;
        return this;
    }
    public String getPredicate() {
        return this.predicate;
    }

    public CreateDeviceRelationRequest setObjectChainDeviceIdList(java.util.List<String> objectChainDeviceIdList) {
        this.objectChainDeviceIdList = objectChainDeviceIdList;
        return this;
    }
    public java.util.List<String> getObjectChainDeviceIdList() {
        return this.objectChainDeviceIdList;
    }

}
