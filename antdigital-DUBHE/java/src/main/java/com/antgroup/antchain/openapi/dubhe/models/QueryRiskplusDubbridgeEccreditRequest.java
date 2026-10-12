// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class QueryRiskplusDubbridgeEccreditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务场景码
    @NameInMap("business_scene")
    @Validation(required = true)
    public String businessScene;

    // 外部申请编号 third_apply_no、apply_no必填其一)
    @NameInMap("third_apply_no")
    public String thirdApplyNo;

    // 银行审批流水号 third_apply_no、apply_no必填其一)
    @NameInMap("apply_no")
    public String applyNo;

    // 企业名称 客户企业的工商注册名称，有企业信息则必输
    @NameInMap("ent_name")
    @Validation(required = true)
    public String entName;

    // 企业证件号码 客户企业的统一社会信用代码，有企业信息则必输
    @NameInMap("ent_id_no")
    public String entIdNo;

    public static QueryRiskplusDubbridgeEccreditRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskplusDubbridgeEccreditRequest self = new QueryRiskplusDubbridgeEccreditRequest();
        return TeaModel.build(map, self);
    }

    public QueryRiskplusDubbridgeEccreditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRiskplusDubbridgeEccreditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRiskplusDubbridgeEccreditRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public QueryRiskplusDubbridgeEccreditRequest setThirdApplyNo(String thirdApplyNo) {
        this.thirdApplyNo = thirdApplyNo;
        return this;
    }
    public String getThirdApplyNo() {
        return this.thirdApplyNo;
    }

    public QueryRiskplusDubbridgeEccreditRequest setApplyNo(String applyNo) {
        this.applyNo = applyNo;
        return this;
    }
    public String getApplyNo() {
        return this.applyNo;
    }

    public QueryRiskplusDubbridgeEccreditRequest setEntName(String entName) {
        this.entName = entName;
        return this;
    }
    public String getEntName() {
        return this.entName;
    }

    public QueryRiskplusDubbridgeEccreditRequest setEntIdNo(String entIdNo) {
        this.entIdNo = entIdNo;
        return this;
    }
    public String getEntIdNo() {
        return this.entIdNo;
    }

}
