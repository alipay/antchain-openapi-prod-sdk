// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class RegisterCdsqTireinsuranceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 平台名称
    @NameInMap("partner_code")
    @Validation(required = true)
    public String partnerCode;

    // 交易流水号
    @NameInMap("transaction_no")
    @Validation(required = true)
    public String transactionNo;

    // 用户ID
    @NameInMap("userid")
    public String userid;

    // 方案名称
    // 代步车+置换、轮
    // 胎险+置换、代步
    // 车、四轮轮胎险、
    // 置换、二轮轮胎险
    @NameInMap("scheme_name")
    @Validation(required = true)
    public String schemeName;

    // 购买时间
    @NameInMap("buytime")
    public String buytime;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    public static RegisterCdsqTireinsuranceRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterCdsqTireinsuranceRequest self = new RegisterCdsqTireinsuranceRequest();
        return TeaModel.build(map, self);
    }

    public RegisterCdsqTireinsuranceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterCdsqTireinsuranceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterCdsqTireinsuranceRequest setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }
    public String getPartnerCode() {
        return this.partnerCode;
    }

    public RegisterCdsqTireinsuranceRequest setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
        return this;
    }
    public String getTransactionNo() {
        return this.transactionNo;
    }

    public RegisterCdsqTireinsuranceRequest setUserid(String userid) {
        this.userid = userid;
        return this;
    }
    public String getUserid() {
        return this.userid;
    }

    public RegisterCdsqTireinsuranceRequest setSchemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }
    public String getSchemeName() {
        return this.schemeName;
    }

    public RegisterCdsqTireinsuranceRequest setBuytime(String buytime) {
        this.buytime = buytime;
        return this;
    }
    public String getBuytime() {
        return this.buytime;
    }

    public RegisterCdsqTireinsuranceRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
