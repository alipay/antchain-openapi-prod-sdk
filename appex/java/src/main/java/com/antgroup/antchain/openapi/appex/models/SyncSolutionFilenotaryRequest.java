// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class SyncSolutionFilenotaryRequest extends TeaModel {
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

    public static SyncSolutionFilenotaryRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncSolutionFilenotaryRequest self = new SyncSolutionFilenotaryRequest();
        return TeaModel.build(map, self);
    }

    public SyncSolutionFilenotaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncSolutionFilenotaryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncSolutionFilenotaryRequest setAppDid(String appDid) {
        this.appDid = appDid;
        return this;
    }
    public String getAppDid() {
        return this.appDid;
    }

    public SyncSolutionFilenotaryRequest setFileNotaryId(String fileNotaryId) {
        this.fileNotaryId = fileNotaryId;
        return this;
    }
    public String getFileNotaryId() {
        return this.fileNotaryId;
    }

}
