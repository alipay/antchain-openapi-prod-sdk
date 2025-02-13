// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SyncAssetelementProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 若要素项目已存在，是否进行全量覆盖
    @NameInMap("cover_exist_project")
    @Validation(required = true)
    public Boolean coverExistProject;

    // 同步目标
    @NameInMap("destination")
    @Validation(required = true)
    public String destination;

    // 项目ID
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 项目名称
    @NameInMap("project_name")
    @Validation(required = true)
    public String projectName;

    // 根元素ID列表
    @NameInMap("root_elements")
    public String rootElements;

    // 是否只读
    @NameInMap("read_only")
    @Validation(required = true)
    public Boolean readOnly;

    // 备注
    @NameInMap("remark")
    public String remark;

    // 附件列表
    @NameInMap("attachment_list")
    public String attachmentList;

    // 产品Owner
    @NameInMap("pd_owner")
    public String pdOwner;

    // 要素列表
    @NameInMap("asset_element_info_list")
    public java.util.List<AssetElementInfo> assetElementInfoList;

    // 要素关系列表
    @NameInMap("asset_element_relation_info_list")
    public java.util.List<AssetElementRelationInfo> assetElementRelationInfoList;

    public static SyncAssetelementProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAssetelementProjectRequest self = new SyncAssetelementProjectRequest();
        return TeaModel.build(map, self);
    }

    public SyncAssetelementProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncAssetelementProjectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncAssetelementProjectRequest setCoverExistProject(Boolean coverExistProject) {
        this.coverExistProject = coverExistProject;
        return this;
    }
    public Boolean getCoverExistProject() {
        return this.coverExistProject;
    }

    public SyncAssetelementProjectRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public SyncAssetelementProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SyncAssetelementProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public SyncAssetelementProjectRequest setRootElements(String rootElements) {
        this.rootElements = rootElements;
        return this;
    }
    public String getRootElements() {
        return this.rootElements;
    }

    public SyncAssetelementProjectRequest setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public SyncAssetelementProjectRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public SyncAssetelementProjectRequest setAttachmentList(String attachmentList) {
        this.attachmentList = attachmentList;
        return this;
    }
    public String getAttachmentList() {
        return this.attachmentList;
    }

    public SyncAssetelementProjectRequest setPdOwner(String pdOwner) {
        this.pdOwner = pdOwner;
        return this;
    }
    public String getPdOwner() {
        return this.pdOwner;
    }

    public SyncAssetelementProjectRequest setAssetElementInfoList(java.util.List<AssetElementInfo> assetElementInfoList) {
        this.assetElementInfoList = assetElementInfoList;
        return this;
    }
    public java.util.List<AssetElementInfo> getAssetElementInfoList() {
        return this.assetElementInfoList;
    }

    public SyncAssetelementProjectRequest setAssetElementRelationInfoList(java.util.List<AssetElementRelationInfo> assetElementRelationInfoList) {
        this.assetElementRelationInfoList = assetElementRelationInfoList;
        return this;
    }
    public java.util.List<AssetElementRelationInfo> getAssetElementRelationInfoList() {
        return this.assetElementRelationInfoList;
    }

}
