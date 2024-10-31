// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryMainsiteUnifiedentranceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权协议索引
    @NameInMap("file_index")
    public String fileIndex;

    // 整个需求的入参，map json
    @NameInMap("params")
    @Validation(required = true)
    public String params;

    // 是否授权
    @NameInMap("user_authed")
    public Boolean userAuthed;

    // 数据集服务id
    @NameInMap("data_set_id")
    @Validation(required = true)
    public String dataSetId;

    // 	
    // 授权token
    @NameInMap("token")
    public String token;

    // token授权场景码
    @NameInMap("scene_code")
    public String sceneCode;

    // 实际调用的租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static QueryMainsiteUnifiedentranceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMainsiteUnifiedentranceRequest self = new QueryMainsiteUnifiedentranceRequest();
        return TeaModel.build(map, self);
    }

    public QueryMainsiteUnifiedentranceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMainsiteUnifiedentranceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMainsiteUnifiedentranceRequest setFileIndex(String fileIndex) {
        this.fileIndex = fileIndex;
        return this;
    }
    public String getFileIndex() {
        return this.fileIndex;
    }

    public QueryMainsiteUnifiedentranceRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public QueryMainsiteUnifiedentranceRequest setUserAuthed(Boolean userAuthed) {
        this.userAuthed = userAuthed;
        return this;
    }
    public Boolean getUserAuthed() {
        return this.userAuthed;
    }

    public QueryMainsiteUnifiedentranceRequest setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public String getDataSetId() {
        return this.dataSetId;
    }

    public QueryMainsiteUnifiedentranceRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public QueryMainsiteUnifiedentranceRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryMainsiteUnifiedentranceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
