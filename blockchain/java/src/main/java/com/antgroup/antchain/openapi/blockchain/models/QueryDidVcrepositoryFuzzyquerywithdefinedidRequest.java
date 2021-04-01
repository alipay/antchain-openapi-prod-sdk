// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDidVcrepositoryFuzzyquerywithdefinedidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 自定义的业务id，通常此字段不是"vc:mychain:"前缀开头，会使用如下规则生成最终verifiable_claim_id： verifiable_claim_id = "vc:mychain:" + SHA256(Joiner.on(":").join(issuer_did, subject_did, define_id)); 此表达式参与SHA256的 define_id 为用户指定的当前参数。查询时使用verifiable_claim_id*
    @NameInMap("define_id")
    @Validation(required = true)
    public String defineId;

    // 请求读取数据的did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 目标证书VC的颁发者did。
    @NameInMap("issuer_did")
    @Validation(required = true)
    public String issuerDid;

    // 目标证书VC的颁发目标did。
    // 
    @NameInMap("subject_did")
    @Validation(required = true)
    public String subjectDid;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static QueryDidVcrepositoryFuzzyquerywithdefinedidRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDidVcrepositoryFuzzyquerywithdefinedidRequest self = new QueryDidVcrepositoryFuzzyquerywithdefinedidRequest();
        return TeaModel.build(map, self);
    }

    public QueryDidVcrepositoryFuzzyquerywithdefinedidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDidVcrepositoryFuzzyquerywithdefinedidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDidVcrepositoryFuzzyquerywithdefinedidRequest setDefineId(String defineId) {
        this.defineId = defineId;
        return this;
    }
    public String getDefineId() {
        return this.defineId;
    }

    public QueryDidVcrepositoryFuzzyquerywithdefinedidRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryDidVcrepositoryFuzzyquerywithdefinedidRequest setIssuerDid(String issuerDid) {
        this.issuerDid = issuerDid;
        return this;
    }
    public String getIssuerDid() {
        return this.issuerDid;
    }

    public QueryDidVcrepositoryFuzzyquerywithdefinedidRequest setSubjectDid(String subjectDid) {
        this.subjectDid = subjectDid;
        return this;
    }
    public String getSubjectDid() {
        return this.subjectDid;
    }

    public QueryDidVcrepositoryFuzzyquerywithdefinedidRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
