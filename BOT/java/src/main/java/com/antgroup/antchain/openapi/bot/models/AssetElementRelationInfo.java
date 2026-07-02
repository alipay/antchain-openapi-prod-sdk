// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class AssetElementRelationInfo extends TeaModel {
    // 来源要素ID
    /**
     * <strong>example:</strong>
     * <p>112233</p>
     */
    @NameInMap("source_element_id")
    @Validation(required = true)
    public String sourceElementId;

    // 目标要素ID
    /**
     * <strong>example:</strong>
     * <p>112233</p>
     */
    @NameInMap("target_element_id")
    @Validation(required = true)
    public String targetElementId;

    // 关联类型
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("relation_type")
    @Validation(required = true)
    public Long relationType;

    // 关联依据类型
    /**
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("relation_dependency_type")
    public String relationDependencyType;

    // 关联依据
    /**
     * <strong>example:</strong>
     * <p>{...}</p>
     */
    @NameInMap("relation_dependency")
    public String relationDependency;

    // 项目ID
    /**
     * <strong>example:</strong>
     * <p>112233</p>
     */
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 来源要素名称
    /**
     * <strong>example:</strong>
     * <p>来源要素</p>
     */
    @NameInMap("source_element_name")
    @Validation(required = true)
    public String sourceElementName;

    // 目标要素名称
    /**
     * <strong>example:</strong>
     * <p>目标要素</p>
     */
    @NameInMap("target_element_name")
    @Validation(required = true)
    public String targetElementName;

    public static AssetElementRelationInfo build(java.util.Map<String, ?> map) throws Exception {
        AssetElementRelationInfo self = new AssetElementRelationInfo();
        return TeaModel.build(map, self);
    }

    public AssetElementRelationInfo setSourceElementId(String sourceElementId) {
        this.sourceElementId = sourceElementId;
        return this;
    }
    public String getSourceElementId() {
        return this.sourceElementId;
    }

    public AssetElementRelationInfo setTargetElementId(String targetElementId) {
        this.targetElementId = targetElementId;
        return this;
    }
    public String getTargetElementId() {
        return this.targetElementId;
    }

    public AssetElementRelationInfo setRelationType(Long relationType) {
        this.relationType = relationType;
        return this;
    }
    public Long getRelationType() {
        return this.relationType;
    }

    public AssetElementRelationInfo setRelationDependencyType(String relationDependencyType) {
        this.relationDependencyType = relationDependencyType;
        return this;
    }
    public String getRelationDependencyType() {
        return this.relationDependencyType;
    }

    public AssetElementRelationInfo setRelationDependency(String relationDependency) {
        this.relationDependency = relationDependency;
        return this;
    }
    public String getRelationDependency() {
        return this.relationDependency;
    }

    public AssetElementRelationInfo setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AssetElementRelationInfo setSourceElementName(String sourceElementName) {
        this.sourceElementName = sourceElementName;
        return this;
    }
    public String getSourceElementName() {
        return this.sourceElementName;
    }

    public AssetElementRelationInfo setTargetElementName(String targetElementName) {
        this.targetElementName = targetElementName;
        return this;
    }
    public String getTargetElementName() {
        return this.targetElementName;
    }

}
