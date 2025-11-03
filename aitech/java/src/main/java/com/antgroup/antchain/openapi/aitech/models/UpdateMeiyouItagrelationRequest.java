// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class UpdateMeiyouItagrelationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 更新关系信息
    @NameInMap("relation_info_list")
    public java.util.List<UpdateMeiyouItagRelationWebInfo> relationInfoList;

    // 是否更新审核记录信息
    @NameInMap("update_audit_flag")
    @Validation(required = true)
    public Boolean updateAuditFlag;

    // 数据来源
    @NameInMap("source")
    public String source;

    public static UpdateMeiyouItagrelationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeiyouItagrelationRequest self = new UpdateMeiyouItagrelationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMeiyouItagrelationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateMeiyouItagrelationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateMeiyouItagrelationRequest setRelationInfoList(java.util.List<UpdateMeiyouItagRelationWebInfo> relationInfoList) {
        this.relationInfoList = relationInfoList;
        return this;
    }
    public java.util.List<UpdateMeiyouItagRelationWebInfo> getRelationInfoList() {
        return this.relationInfoList;
    }

    public UpdateMeiyouItagrelationRequest setUpdateAuditFlag(Boolean updateAuditFlag) {
        this.updateAuditFlag = updateAuditFlag;
        return this;
    }
    public Boolean getUpdateAuditFlag() {
        return this.updateAuditFlag;
    }

    public UpdateMeiyouItagrelationRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
