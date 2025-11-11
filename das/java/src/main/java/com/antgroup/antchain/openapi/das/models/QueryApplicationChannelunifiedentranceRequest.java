// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryApplicationChannelunifiedentranceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权文件ID
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
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // token授权场景码
    @NameInMap("scene_code")
    public String sceneCode;

    // 	
    // 授权token
    @NameInMap("token")
    public String token;

    // 客户ID
    @NameInMap("customer_id")
    @Validation(required = true)
    public String customerId;

    public static QueryApplicationChannelunifiedentranceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationChannelunifiedentranceRequest self = new QueryApplicationChannelunifiedentranceRequest();
        return TeaModel.build(map, self);
    }

    public QueryApplicationChannelunifiedentranceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApplicationChannelunifiedentranceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApplicationChannelunifiedentranceRequest setFileIndex(String fileIndex) {
        this.fileIndex = fileIndex;
        return this;
    }
    public String getFileIndex() {
        return this.fileIndex;
    }

    public QueryApplicationChannelunifiedentranceRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public QueryApplicationChannelunifiedentranceRequest setUserAuthed(Boolean userAuthed) {
        this.userAuthed = userAuthed;
        return this;
    }
    public Boolean getUserAuthed() {
        return this.userAuthed;
    }

    public QueryApplicationChannelunifiedentranceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public QueryApplicationChannelunifiedentranceRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryApplicationChannelunifiedentranceRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public QueryApplicationChannelunifiedentranceRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

}
