// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class ImportProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 幂等编码，需要唯一
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    // 所属业务线
    @NameInMap("business_line")
    @Validation(required = true)
    public String businessLine;

    // 所属产品线
    @NameInMap("product_line")
    @Validation(required = true)
    public String productLine;

    // 产品名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 产品描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // pd
    @NameInMap("pds")
    @Validation(required = true)
    public java.util.List<String> pds;

    // pd负责人
    @NameInMap("pd_leaders")
    @Validation(required = true)
    public java.util.List<String> pdLeaders;

    // 研发负责人
    @NameInMap("dev_leaders")
    @Validation(required = true)
    public java.util.List<String> devLeaders;

    // 研发人员
    @NameInMap("devs")
    public java.util.List<String> devs;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    public static ImportProductRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportProductRequest self = new ImportProductRequest();
        return TeaModel.build(map, self);
    }

    public ImportProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportProductRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public ImportProductRequest setBusinessLine(String businessLine) {
        this.businessLine = businessLine;
        return this;
    }
    public String getBusinessLine() {
        return this.businessLine;
    }

    public ImportProductRequest setProductLine(String productLine) {
        this.productLine = productLine;
        return this;
    }
    public String getProductLine() {
        return this.productLine;
    }

    public ImportProductRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ImportProductRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ImportProductRequest setPds(java.util.List<String> pds) {
        this.pds = pds;
        return this;
    }
    public java.util.List<String> getPds() {
        return this.pds;
    }

    public ImportProductRequest setPdLeaders(java.util.List<String> pdLeaders) {
        this.pdLeaders = pdLeaders;
        return this;
    }
    public java.util.List<String> getPdLeaders() {
        return this.pdLeaders;
    }

    public ImportProductRequest setDevLeaders(java.util.List<String> devLeaders) {
        this.devLeaders = devLeaders;
        return this;
    }
    public java.util.List<String> getDevLeaders() {
        return this.devLeaders;
    }

    public ImportProductRequest setDevs(java.util.List<String> devs) {
        this.devs = devs;
        return this;
    }
    public java.util.List<String> getDevs() {
        return this.devs;
    }

    public ImportProductRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
