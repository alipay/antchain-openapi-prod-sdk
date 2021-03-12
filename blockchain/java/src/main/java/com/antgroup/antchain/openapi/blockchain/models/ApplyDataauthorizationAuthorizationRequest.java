// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ApplyDataauthorizationAuthorizationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 申请人ID
    @NameInMap("applicant_id")
    @Validation(required = true)
    public String applicantId;

    // 1592877833149
    @NameInMap("applicant_time")
    @Validation(required = true)
    public Long applicantTime;

    // 申请ID，业务系统唯一
    @NameInMap("biz_uid")
    @Validation(required = true)
    public String bizUid;

    // 申请原因
    @NameInMap("comment")
    @Validation(required = true)
    public String comment;

    // 数据ID
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 扩展参数
    @NameInMap("extension_info")
    public String extensionInfo;

    public static ApplyDataauthorizationAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDataauthorizationAuthorizationRequest self = new ApplyDataauthorizationAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDataauthorizationAuthorizationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyDataauthorizationAuthorizationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyDataauthorizationAuthorizationRequest setApplicantId(String applicantId) {
        this.applicantId = applicantId;
        return this;
    }
    public String getApplicantId() {
        return this.applicantId;
    }

    public ApplyDataauthorizationAuthorizationRequest setApplicantTime(Long applicantTime) {
        this.applicantTime = applicantTime;
        return this;
    }
    public Long getApplicantTime() {
        return this.applicantTime;
    }

    public ApplyDataauthorizationAuthorizationRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public ApplyDataauthorizationAuthorizationRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ApplyDataauthorizationAuthorizationRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ApplyDataauthorizationAuthorizationRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

}
