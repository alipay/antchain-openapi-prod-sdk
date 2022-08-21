// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CreateDciRegistrationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // DC456
    @NameInMap("dci_content_id")
    @Validation(required = true)
    public String dciContentId;

    // 作品创作申明
    @NameInMap("creation_statement")
    @Validation(required = true)
    public String creationStatement;

    // 补充授权文件
    @NameInMap("ancillary_evidence_path_list")
    public java.util.List<String> ancillaryEvidencePathList;

    // 客户端令牌
    @NameInMap("client_token")
    public String clientToken;

    public static CreateDciRegistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDciRegistrationRequest self = new CreateDciRegistrationRequest();
        return TeaModel.build(map, self);
    }

    public CreateDciRegistrationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDciRegistrationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDciRegistrationRequest setDciContentId(String dciContentId) {
        this.dciContentId = dciContentId;
        return this;
    }
    public String getDciContentId() {
        return this.dciContentId;
    }

    public CreateDciRegistrationRequest setCreationStatement(String creationStatement) {
        this.creationStatement = creationStatement;
        return this;
    }
    public String getCreationStatement() {
        return this.creationStatement;
    }

    public CreateDciRegistrationRequest setAncillaryEvidencePathList(java.util.List<String> ancillaryEvidencePathList) {
        this.ancillaryEvidencePathList = ancillaryEvidencePathList;
        return this;
    }
    public java.util.List<String> getAncillaryEvidencePathList() {
        return this.ancillaryEvidencePathList;
    }

    public CreateDciRegistrationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
