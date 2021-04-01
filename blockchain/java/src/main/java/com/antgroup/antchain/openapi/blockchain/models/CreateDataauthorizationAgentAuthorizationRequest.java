// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDataauthorizationAgentAuthorizationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务UUID
    @NameInMap("biz_uid")
    @Validation(required = true)
    public String bizUid;

    // 授权原因
    @NameInMap("comment")
    @Validation(required = true)
    public String comment;

    // 数据资产ID
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 过期时间
    @NameInMap("expire")
    @Validation(required = true)
    public Long expire;

    // 扩展参数
    @NameInMap("extension_info")
    public String extensionInfo;

    // 授权规则
    @NameInMap("rule")
    public AuthorizationRule rule;

    // 被授权人ID
    @NameInMap("subject_id")
    @Validation(required = true)
    public String subjectId;

    // 申请代理授权的参与方DID
    @NameInMap("applicant_id")
    @Validation(required = true)
    public String applicantId;

    public static CreateDataauthorizationAgentAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataauthorizationAgentAuthorizationRequest self = new CreateDataauthorizationAgentAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataauthorizationAgentAuthorizationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDataauthorizationAgentAuthorizationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDataauthorizationAgentAuthorizationRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public CreateDataauthorizationAgentAuthorizationRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDataauthorizationAgentAuthorizationRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public CreateDataauthorizationAgentAuthorizationRequest setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public CreateDataauthorizationAgentAuthorizationRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public CreateDataauthorizationAgentAuthorizationRequest setRule(AuthorizationRule rule) {
        this.rule = rule;
        return this;
    }
    public AuthorizationRule getRule() {
        return this.rule;
    }

    public CreateDataauthorizationAgentAuthorizationRequest setSubjectId(String subjectId) {
        this.subjectId = subjectId;
        return this;
    }
    public String getSubjectId() {
        return this.subjectId;
    }

    public CreateDataauthorizationAgentAuthorizationRequest setApplicantId(String applicantId) {
        this.applicantId = applicantId;
        return this;
    }
    public String getApplicantId() {
        return this.applicantId;
    }

}
