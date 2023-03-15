// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryApplicationUnifiedentranceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需求id
    @NameInMap("demand_id")
    @Validation(required = true)
    public String demandId;

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

    public static QueryApplicationUnifiedentranceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationUnifiedentranceRequest self = new QueryApplicationUnifiedentranceRequest();
        return TeaModel.build(map, self);
    }

    public QueryApplicationUnifiedentranceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApplicationUnifiedentranceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApplicationUnifiedentranceRequest setDemandId(String demandId) {
        this.demandId = demandId;
        return this;
    }
    public String getDemandId() {
        return this.demandId;
    }

    public QueryApplicationUnifiedentranceRequest setFileIndex(String fileIndex) {
        this.fileIndex = fileIndex;
        return this;
    }
    public String getFileIndex() {
        return this.fileIndex;
    }

    public QueryApplicationUnifiedentranceRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public QueryApplicationUnifiedentranceRequest setUserAuthed(Boolean userAuthed) {
        this.userAuthed = userAuthed;
        return this;
    }
    public Boolean getUserAuthed() {
        return this.userAuthed;
    }

}
