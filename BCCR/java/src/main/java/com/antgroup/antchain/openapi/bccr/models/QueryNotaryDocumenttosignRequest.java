// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryNotaryDocumenttosignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 申请人信息
    @NameInMap("applicant_list")
    @Validation(required = true)
    public java.util.List<NotaryUser> applicantList;

    // 经办人信息
    @NameInMap("agent")
    @Validation(required = true)
    public NotaryUser agent;

    // 送达信息
    @NameInMap("receive_info")
    @Validation(required = true)
    public ReceiveInfo receiveInfo;

    // 保全内容
    @NameInMap("preservation")
    @Validation(required = true)
    public String preservation;

    // 公证处id
    @NameInMap("org_id")
    @Validation(required = true)
    public String orgId;

    public static QueryNotaryDocumenttosignRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryNotaryDocumenttosignRequest self = new QueryNotaryDocumenttosignRequest();
        return TeaModel.build(map, self);
    }

    public QueryNotaryDocumenttosignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryNotaryDocumenttosignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryNotaryDocumenttosignRequest setApplicantList(java.util.List<NotaryUser> applicantList) {
        this.applicantList = applicantList;
        return this;
    }
    public java.util.List<NotaryUser> getApplicantList() {
        return this.applicantList;
    }

    public QueryNotaryDocumenttosignRequest setAgent(NotaryUser agent) {
        this.agent = agent;
        return this;
    }
    public NotaryUser getAgent() {
        return this.agent;
    }

    public QueryNotaryDocumenttosignRequest setReceiveInfo(ReceiveInfo receiveInfo) {
        this.receiveInfo = receiveInfo;
        return this;
    }
    public ReceiveInfo getReceiveInfo() {
        return this.receiveInfo;
    }

    public QueryNotaryDocumenttosignRequest setPreservation(String preservation) {
        this.preservation = preservation;
        return this;
    }
    public String getPreservation() {
        return this.preservation;
    }

    public QueryNotaryDocumenttosignRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

}
