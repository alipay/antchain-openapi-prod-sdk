// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidZkpverifiableclaimVisibilityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // vc颁发者
    @NameInMap("issuer")
    @Validation(required = true)
    public String issuer;

    // 哪些字段将被展示。
    // 如果父路径和子路径都被包含，那么将以最上级路径为准，展示上级路径对应的内容
    @NameInMap("path")
    @Validation(required = true)
    public java.util.List<String> path;

    // vc完整原文
    @NameInMap("vc")
    @Validation(required = true)
    public String vc;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static StartDidZkpverifiableclaimVisibilityRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidZkpverifiableclaimVisibilityRequest self = new StartDidZkpverifiableclaimVisibilityRequest();
        return TeaModel.build(map, self);
    }

    public StartDidZkpverifiableclaimVisibilityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidZkpverifiableclaimVisibilityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidZkpverifiableclaimVisibilityRequest setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public StartDidZkpverifiableclaimVisibilityRequest setPath(java.util.List<String> path) {
        this.path = path;
        return this;
    }
    public java.util.List<String> getPath() {
        return this.path;
    }

    public StartDidZkpverifiableclaimVisibilityRequest setVc(String vc) {
        this.vc = vc;
        return this;
    }
    public String getVc() {
        return this.vc;
    }

    public StartDidZkpverifiableclaimVisibilityRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
