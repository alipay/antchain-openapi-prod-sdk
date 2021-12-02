// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class ModelRelationship extends TeaModel {
    // 目标模型的唯一标识
    @NameInMap("destination_model_id")
    @Validation(required = true)
    public String destinationModelId;

    // 源模型的唯一标识（目标模型内唯一）
    @NameInMap("source_model_id")
    @Validation(required = true)
    public String sourceModelId;

    // 唯一标识（目标模型内唯一，等同于目标模型中与源模型建立关联的外键属性）
    @NameInMap("unique_id")
    @Validation(required = true)
    public String uniqueId;

    // 描述
    @NameInMap("description")
    public String description;

    // 关联类型【取值范围：ONE_TO_ONE，ONE_TO_MANY】
    @NameInMap("relation_type")
    @Validation(required = true)
    public String relationType;

    // 是否为系统内置
    @NameInMap("system")
    @Validation(required = true)
    public Boolean system;

    // 创建时间
    @NameInMap("created_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createdTime;

    // 修改时间
    @NameInMap("modified_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String modifiedTime;

    public static ModelRelationship build(java.util.Map<String, ?> map) throws Exception {
        ModelRelationship self = new ModelRelationship();
        return TeaModel.build(map, self);
    }

    public ModelRelationship setDestinationModelId(String destinationModelId) {
        this.destinationModelId = destinationModelId;
        return this;
    }
    public String getDestinationModelId() {
        return this.destinationModelId;
    }

    public ModelRelationship setSourceModelId(String sourceModelId) {
        this.sourceModelId = sourceModelId;
        return this;
    }
    public String getSourceModelId() {
        return this.sourceModelId;
    }

    public ModelRelationship setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public ModelRelationship setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModelRelationship setRelationType(String relationType) {
        this.relationType = relationType;
        return this;
    }
    public String getRelationType() {
        return this.relationType;
    }

    public ModelRelationship setSystem(Boolean system) {
        this.system = system;
        return this;
    }
    public Boolean getSystem() {
        return this.system;
    }

    public ModelRelationship setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public ModelRelationship setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

}
