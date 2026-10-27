// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class GetMktExtresulturlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求id，每一次请求保持唯一，若重复，则报错
    @NameInMap("request_id")
    @Validation(required = true, maxLength = 128)
    public String requestId;

    // 项目ID，蚂蚁分配
    @NameInMap("project_id")
    @Validation(required = true, maxLength = 64)
    public String projectId;

    // 上传营销标识，来源于上传结果通知中的uploadMktNo
    @NameInMap("upload_mkt_no")
    @Validation(required = true, maxLength = 64)
    public String uploadMktNo;

    public static GetMktExtresulturlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMktExtresulturlRequest self = new GetMktExtresulturlRequest();
        return TeaModel.build(map, self);
    }

    public GetMktExtresulturlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetMktExtresulturlRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMktExtresulturlRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetMktExtresulturlRequest setUploadMktNo(String uploadMktNo) {
        this.uploadMktNo = uploadMktNo;
        return this;
    }
    public String getUploadMktNo() {
        return this.uploadMktNo;
    }

}
