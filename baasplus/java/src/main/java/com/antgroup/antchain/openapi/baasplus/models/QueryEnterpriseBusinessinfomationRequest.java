// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryEnterpriseBusinessinfomationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 00：企业名；01：注册号；02：18位统一社会信用代码；03：9位组织机构代码
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 企业查询关键字，企业名/注册号/社会信用代码/组织机构代码
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 产品场景编码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    public static QueryEnterpriseBusinessinfomationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseBusinessinfomationRequest self = new QueryEnterpriseBusinessinfomationRequest();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseBusinessinfomationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEnterpriseBusinessinfomationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEnterpriseBusinessinfomationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryEnterpriseBusinessinfomationRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public QueryEnterpriseBusinessinfomationRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
