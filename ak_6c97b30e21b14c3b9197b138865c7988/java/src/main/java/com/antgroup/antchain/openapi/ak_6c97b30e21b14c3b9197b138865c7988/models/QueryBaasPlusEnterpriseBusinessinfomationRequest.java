// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_6c97b30e21b14c3b9197b138865c7988.models;

import com.aliyun.tea.*;

public class QueryBaasPlusEnterpriseBusinessinfomationRequest extends TeaModel {
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

    public static QueryBaasPlusEnterpriseBusinessinfomationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBaasPlusEnterpriseBusinessinfomationRequest self = new QueryBaasPlusEnterpriseBusinessinfomationRequest();
        return TeaModel.build(map, self);
    }

    public QueryBaasPlusEnterpriseBusinessinfomationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBaasPlusEnterpriseBusinessinfomationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBaasPlusEnterpriseBusinessinfomationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryBaasPlusEnterpriseBusinessinfomationRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public QueryBaasPlusEnterpriseBusinessinfomationRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
