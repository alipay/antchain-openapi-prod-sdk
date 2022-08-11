// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_20ab7e4471e24e8fbfaa7df4ba0613c8.models;

import com.aliyun.tea.*;

public class QueryBaasDidCorporateFaceauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 认证ID，用于查询认证结果
    // 
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    // 产品渲染方式：H5、NATIVE 或 PC
    @NameInMap("group")
    public String group;

    // 生成的did
    @NameInMap("did")
    public String did;

    // vc id，可通过该字符串来查询vc具体内容
    @NameInMap("vc_id")
    public String vcId;

    public static QueryBaasDidCorporateFaceauthRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBaasDidCorporateFaceauthRequest self = new QueryBaasDidCorporateFaceauthRequest();
        return TeaModel.build(map, self);
    }

    public QueryBaasDidCorporateFaceauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBaasDidCorporateFaceauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBaasDidCorporateFaceauthRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public QueryBaasDidCorporateFaceauthRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public QueryBaasDidCorporateFaceauthRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public QueryBaasDidCorporateFaceauthRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryBaasDidCorporateFaceauthRequest setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

}
