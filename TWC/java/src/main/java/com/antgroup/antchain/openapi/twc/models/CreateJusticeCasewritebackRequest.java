// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateJusticeCasewritebackRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    // 自动进件案件基础信息
    @NameInMap("case_basic_info")
    @Validation(required = true)
    public CaseBasicInfo caseBasicInfo;

    // 发起人对象列表
    @NameInMap("proposer_objects")
    @Validation(required = true)
    public java.util.List<ProposerObject> proposerObjects;

    // 答辩人对象列表
    @NameInMap("pleader_objects")
    @Validation(required = true)
    public java.util.List<PleaderObject> pleaderObjects;

    // 自动进件证据要素
    @NameInMap("lease_evidential_element")
    @Validation(required = true)
    public LeaseEvidentialElement leaseEvidentialElement;

    // 证据清单列表
    @NameInMap("evidential_check_list")
    @Validation(required = true)
    public java.util.List<EvidentialCheckList> evidentialCheckList;

    public static CreateJusticeCasewritebackRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJusticeCasewritebackRequest self = new CreateJusticeCasewritebackRequest();
        return TeaModel.build(map, self);
    }

    public CreateJusticeCasewritebackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateJusticeCasewritebackRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateJusticeCasewritebackRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateJusticeCasewritebackRequest setCaseBasicInfo(CaseBasicInfo caseBasicInfo) {
        this.caseBasicInfo = caseBasicInfo;
        return this;
    }
    public CaseBasicInfo getCaseBasicInfo() {
        return this.caseBasicInfo;
    }

    public CreateJusticeCasewritebackRequest setProposerObjects(java.util.List<ProposerObject> proposerObjects) {
        this.proposerObjects = proposerObjects;
        return this;
    }
    public java.util.List<ProposerObject> getProposerObjects() {
        return this.proposerObjects;
    }

    public CreateJusticeCasewritebackRequest setPleaderObjects(java.util.List<PleaderObject> pleaderObjects) {
        this.pleaderObjects = pleaderObjects;
        return this;
    }
    public java.util.List<PleaderObject> getPleaderObjects() {
        return this.pleaderObjects;
    }

    public CreateJusticeCasewritebackRequest setLeaseEvidentialElement(LeaseEvidentialElement leaseEvidentialElement) {
        this.leaseEvidentialElement = leaseEvidentialElement;
        return this;
    }
    public LeaseEvidentialElement getLeaseEvidentialElement() {
        return this.leaseEvidentialElement;
    }

    public CreateJusticeCasewritebackRequest setEvidentialCheckList(java.util.List<EvidentialCheckList> evidentialCheckList) {
        this.evidentialCheckList = evidentialCheckList;
        return this;
    }
    public java.util.List<EvidentialCheckList> getEvidentialCheckList() {
        return this.evidentialCheckList;
    }

}
