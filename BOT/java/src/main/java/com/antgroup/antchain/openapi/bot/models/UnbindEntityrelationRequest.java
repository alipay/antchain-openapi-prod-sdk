// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UnbindEntityrelationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // [主]实体场景码
    @NameInMap("subject_scene")
    @Validation(required = true)
    public String subjectScene;

    // [主]实体ID（当[主]实体平台唯一ID（subject_trustiot_id）为空时，此项不能为空）
    @NameInMap("subject_entity_id")
    public String subjectEntityId;

    // [主]实体平台唯一ID（当[主]实体ID（subject_entity_id）为空时，此项不能为空）
    @NameInMap("subject_trustiot_id")
    public Long subjectTrustiotId;

    // 关系谓语, 取值范围：SUB_DEVICE、USER、LOCATION
    @NameInMap("predicate")
    @Validation(required = true)
    public String predicate;

    // [宾]实体类型，取值范围：DEVICE、PERIPHERAL、LABEL、CUSTOMER_ENTITY
    @NameInMap("object_entity_type")
    @Validation(required = true)
    public String objectEntityType;

    // [宾]场景码（当[宾]实体唯一ID列表(object_trustiotiot_id_list)为空时，此项必填）
    @NameInMap("object_scene")
    public String objectScene;

    // [宾]实体ID列表（当[宾]实体唯一ID列表(object_trustiotiot_id_list)为空时，此项必填）
    // 
    @NameInMap("object_entity_id_list")
    public java.util.List<String> objectEntityIdList;

    // [宾]实体唯一ID列表,与[宾]实体场景码+[宾]实体ID列表（object_scene+object_entity_id）不能同时为空
    @NameInMap("object_trustiotiot_id_list")
    public java.util.List<Long> objectTrustiotiotIdList;

    public static UnbindEntityrelationRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindEntityrelationRequest self = new UnbindEntityrelationRequest();
        return TeaModel.build(map, self);
    }

    public UnbindEntityrelationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UnbindEntityrelationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UnbindEntityrelationRequest setSubjectScene(String subjectScene) {
        this.subjectScene = subjectScene;
        return this;
    }
    public String getSubjectScene() {
        return this.subjectScene;
    }

    public UnbindEntityrelationRequest setSubjectEntityId(String subjectEntityId) {
        this.subjectEntityId = subjectEntityId;
        return this;
    }
    public String getSubjectEntityId() {
        return this.subjectEntityId;
    }

    public UnbindEntityrelationRequest setSubjectTrustiotId(Long subjectTrustiotId) {
        this.subjectTrustiotId = subjectTrustiotId;
        return this;
    }
    public Long getSubjectTrustiotId() {
        return this.subjectTrustiotId;
    }

    public UnbindEntityrelationRequest setPredicate(String predicate) {
        this.predicate = predicate;
        return this;
    }
    public String getPredicate() {
        return this.predicate;
    }

    public UnbindEntityrelationRequest setObjectEntityType(String objectEntityType) {
        this.objectEntityType = objectEntityType;
        return this;
    }
    public String getObjectEntityType() {
        return this.objectEntityType;
    }

    public UnbindEntityrelationRequest setObjectScene(String objectScene) {
        this.objectScene = objectScene;
        return this;
    }
    public String getObjectScene() {
        return this.objectScene;
    }

    public UnbindEntityrelationRequest setObjectEntityIdList(java.util.List<String> objectEntityIdList) {
        this.objectEntityIdList = objectEntityIdList;
        return this;
    }
    public java.util.List<String> getObjectEntityIdList() {
        return this.objectEntityIdList;
    }

    public UnbindEntityrelationRequest setObjectTrustiotiotIdList(java.util.List<Long> objectTrustiotiotIdList) {
        this.objectTrustiotiotIdList = objectTrustiotiotIdList;
        return this;
    }
    public java.util.List<Long> getObjectTrustiotiotIdList() {
        return this.objectTrustiotiotIdList;
    }

}
