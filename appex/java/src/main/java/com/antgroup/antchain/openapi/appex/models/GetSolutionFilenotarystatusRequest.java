// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class GetSolutionFilenotarystatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用did
    // 
    @NameInMap("app_did")
    @Validation(required = true)
    public String appDid;

    // 文件存证id
    // 
    @NameInMap("file_notary_id")
    @Validation(required = true)
    public String fileNotaryId;

    public static GetSolutionFilenotarystatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSolutionFilenotarystatusRequest self = new GetSolutionFilenotarystatusRequest();
        return TeaModel.build(map, self);
    }

    public GetSolutionFilenotarystatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetSolutionFilenotarystatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetSolutionFilenotarystatusRequest setAppDid(String appDid) {
        this.appDid = appDid;
        return this;
    }
    public String getAppDid() {
        return this.appDid;
    }

    public GetSolutionFilenotarystatusRequest setFileNotaryId(String fileNotaryId) {
        this.fileNotaryId = fileNotaryId;
        return this;
    }
    public String getFileNotaryId() {
        return this.fileNotaryId;
    }

}
