// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDataauthorizationDirectAuthorizationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务UUID,业务系统唯一标示
    @NameInMap("biz_uid")
    @Validation(required = true)
    public String bizUid;

    // 直接授权原因
    @NameInMap("comment")
    @Validation(required = true)
    public String comment;

    // 数据ID
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

    // 授权者ID
    @NameInMap("issuer_id")
    @Validation(required = true)
    public String issuerId;

    // 被授予者ID
    @NameInMap("subject_id")
    @Validation(required = true)
    public String subjectId;

    public static CreateDataauthorizationDirectAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataauthorizationDirectAuthorizationRequest self = new CreateDataauthorizationDirectAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataauthorizationDirectAuthorizationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDataauthorizationDirectAuthorizationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDataauthorizationDirectAuthorizationRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public CreateDataauthorizationDirectAuthorizationRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDataauthorizationDirectAuthorizationRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public CreateDataauthorizationDirectAuthorizationRequest setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public CreateDataauthorizationDirectAuthorizationRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public CreateDataauthorizationDirectAuthorizationRequest setIssuerId(String issuerId) {
        this.issuerId = issuerId;
        return this;
    }
    public String getIssuerId() {
        return this.issuerId;
    }

    public CreateDataauthorizationDirectAuthorizationRequest setSubjectId(String subjectId) {
        this.subjectId = subjectId;
        return this;
    }
    public String getSubjectId() {
        return this.subjectId;
    }

}
