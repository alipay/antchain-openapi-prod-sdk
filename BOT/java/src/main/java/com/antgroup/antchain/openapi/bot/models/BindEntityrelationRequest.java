// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BindEntityrelationRequest extends TeaModel {
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

    // [宾]场景码（当[宾]实体唯一ID为空时，此项必填）
    @NameInMap("object_scene")
    public String objectScene;

    // [宾]实体ID（当[宾]实体唯一ID为空时，此项必填）
    @NameInMap("object_entity_id")
    public String objectEntityId;

    // [宾]平台唯一ID，与[宾]实体场景码+[宾]实体ID（object_scene+object_entity_id）不能同时为空
    @NameInMap("object_trustiot_id")
    public Long objectTrustiotId;

    // 绑定请求中，主语或宾语有历史关系，是否删除历史，写入新关系
    // (只处理1对1关系，即生效的前提是{RelationProperty}的maxObjectCount=1 & maxSubjectCount=1)
    @NameInMap("upsert")
    @Validation(required = true)
    public Boolean upsert;

    // 备注
    @NameInMap("remark")
    public String remark;

    // 自定义实体信息（如果object_entity_type=CUSTOMER_ENTITY，则custom_entity_info必填）
    @NameInMap("custom_entity_info")
    public CustomEntityInfo customEntityInfo;

    public static BindEntityrelationRequest build(java.util.Map<String, ?> map) throws Exception {
        BindEntityrelationRequest self = new BindEntityrelationRequest();
        return TeaModel.build(map, self);
    }

    public BindEntityrelationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindEntityrelationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindEntityrelationRequest setSubjectScene(String subjectScene) {
        this.subjectScene = subjectScene;
        return this;
    }
    public String getSubjectScene() {
        return this.subjectScene;
    }

    public BindEntityrelationRequest setSubjectEntityId(String subjectEntityId) {
        this.subjectEntityId = subjectEntityId;
        return this;
    }
    public String getSubjectEntityId() {
        return this.subjectEntityId;
    }

    public BindEntityrelationRequest setSubjectTrustiotId(Long subjectTrustiotId) {
        this.subjectTrustiotId = subjectTrustiotId;
        return this;
    }
    public Long getSubjectTrustiotId() {
        return this.subjectTrustiotId;
    }

    public BindEntityrelationRequest setPredicate(String predicate) {
        this.predicate = predicate;
        return this;
    }
    public String getPredicate() {
        return this.predicate;
    }

    public BindEntityrelationRequest setObjectEntityType(String objectEntityType) {
        this.objectEntityType = objectEntityType;
        return this;
    }
    public String getObjectEntityType() {
        return this.objectEntityType;
    }

    public BindEntityrelationRequest setObjectScene(String objectScene) {
        this.objectScene = objectScene;
        return this;
    }
    public String getObjectScene() {
        return this.objectScene;
    }

    public BindEntityrelationRequest setObjectEntityId(String objectEntityId) {
        this.objectEntityId = objectEntityId;
        return this;
    }
    public String getObjectEntityId() {
        return this.objectEntityId;
    }

    public BindEntityrelationRequest setObjectTrustiotId(Long objectTrustiotId) {
        this.objectTrustiotId = objectTrustiotId;
        return this;
    }
    public Long getObjectTrustiotId() {
        return this.objectTrustiotId;
    }

    public BindEntityrelationRequest setUpsert(Boolean upsert) {
        this.upsert = upsert;
        return this;
    }
    public Boolean getUpsert() {
        return this.upsert;
    }

    public BindEntityrelationRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public BindEntityrelationRequest setCustomEntityInfo(CustomEntityInfo customEntityInfo) {
        this.customEntityInfo = customEntityInfo;
        return this;
    }
    public CustomEntityInfo getCustomEntityInfo() {
        return this.customEntityInfo;
    }

}
