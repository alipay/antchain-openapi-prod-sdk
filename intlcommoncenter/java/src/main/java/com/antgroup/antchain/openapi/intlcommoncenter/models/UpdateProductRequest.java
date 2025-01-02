// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intlcommoncenter.models;

import com.aliyun.tea.*;

public class UpdateProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品线code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // L1code
    @NameInMap("business_line")
    @Validation(required = true)
    public String businessLine;

    // L2code
    @NameInMap("product_line")
    @Validation(required = true)
    public String productLine;

    // 研发负责人
    @NameInMap("dev_leader")
    public String devLeader;

    // 研发参与人
    @NameInMap("devs")
    public String devs;

    // 产品负责人
    @NameInMap("pd_leader")
    public String pdLeader;

    // 产品参与人
    @NameInMap("pds")
    public String pds;

    // 财务负责人
    @NameInMap("finance")
    public String finance;

    // 法务负责人
    @NameInMap("legal_owner")
    public String legalOwner;

    // 产管
    @NameInMap("product_assistant")
    public String productAssistant;

    public static UpdateProductRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductRequest self = new UpdateProductRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateProductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateProductRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public UpdateProductRequest setBusinessLine(String businessLine) {
        this.businessLine = businessLine;
        return this;
    }
    public String getBusinessLine() {
        return this.businessLine;
    }

    public UpdateProductRequest setProductLine(String productLine) {
        this.productLine = productLine;
        return this;
    }
    public String getProductLine() {
        return this.productLine;
    }

    public UpdateProductRequest setDevLeader(String devLeader) {
        this.devLeader = devLeader;
        return this;
    }
    public String getDevLeader() {
        return this.devLeader;
    }

    public UpdateProductRequest setDevs(String devs) {
        this.devs = devs;
        return this;
    }
    public String getDevs() {
        return this.devs;
    }

    public UpdateProductRequest setPdLeader(String pdLeader) {
        this.pdLeader = pdLeader;
        return this;
    }
    public String getPdLeader() {
        return this.pdLeader;
    }

    public UpdateProductRequest setPds(String pds) {
        this.pds = pds;
        return this;
    }
    public String getPds() {
        return this.pds;
    }

    public UpdateProductRequest setFinance(String finance) {
        this.finance = finance;
        return this;
    }
    public String getFinance() {
        return this.finance;
    }

    public UpdateProductRequest setLegalOwner(String legalOwner) {
        this.legalOwner = legalOwner;
        return this;
    }
    public String getLegalOwner() {
        return this.legalOwner;
    }

    public UpdateProductRequest setProductAssistant(String productAssistant) {
        this.productAssistant = productAssistant;
        return this;
    }
    public String getProductAssistant() {
        return this.productAssistant;
    }

}
