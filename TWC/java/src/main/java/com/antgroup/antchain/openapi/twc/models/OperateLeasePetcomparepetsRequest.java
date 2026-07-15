// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class OperateLeasePetcomparepetsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 	
    // 算法服务
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 算法功能
    @NameInMap("uri")
    @Validation(required = true)
    public String uri;

    // 来源系统
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 额外参数
    @NameInMap("ext")
    @Validation(required = true)
    public String ext;

    public static OperateLeasePetcomparepetsRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateLeasePetcomparepetsRequest self = new OperateLeasePetcomparepetsRequest();
        return TeaModel.build(map, self);
    }

    public OperateLeasePetcomparepetsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateLeasePetcomparepetsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateLeasePetcomparepetsRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public OperateLeasePetcomparepetsRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

    public OperateLeasePetcomparepetsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public OperateLeasePetcomparepetsRequest setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

}
