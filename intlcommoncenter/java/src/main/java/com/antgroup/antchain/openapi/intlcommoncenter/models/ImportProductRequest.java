// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intlcommoncenter.models;

import com.aliyun.tea.*;

public class ImportProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商业化状态
    @NameInMap("business_status")
    @Validation(required = true)
    public String businessStatus;

    // 是否已上架蚂蚁链官网
    @NameInMap("product_put_ant_official")
    @Validation(required = true)
    public String productPutAntOfficial;

    // 产品名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 橡实立项code
    @NameInMap("xs_code")
    @Validation(required = true)
    public String xsCode;

    // 上线时间
    @NameInMap("start_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 产品经理
    @NameInMap("pd")
    @Validation(required = true)
    public String pd;

    // 产品经理负责人
    @NameInMap("pd_leader")
    @Validation(required = true)
    public String pdLeader;

    // 产品研发负责人
    @NameInMap("dev_leader")
    public String devLeader;

    // 产品研发
    @NameInMap("dev")
    public String dev;

    // 产品描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 操作员
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 业务线id
    @NameInMap("business_line")
    @Validation(required = true)
    public String businessLine;

    // 产品线id
    @NameInMap("product_line")
    @Validation(required = true)
    public String productLine;

    // 产品code
    @NameInMap("product_code")
    public String productCode;

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

    public ImportProductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportProductRequest setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public ImportProductRequest setProductPutAntOfficial(String productPutAntOfficial) {
        this.productPutAntOfficial = productPutAntOfficial;
        return this;
    }
    public String getProductPutAntOfficial() {
        return this.productPutAntOfficial;
    }

    public ImportProductRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ImportProductRequest setXsCode(String xsCode) {
        this.xsCode = xsCode;
        return this;
    }
    public String getXsCode() {
        return this.xsCode;
    }

    public ImportProductRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ImportProductRequest setPd(String pd) {
        this.pd = pd;
        return this;
    }
    public String getPd() {
        return this.pd;
    }

    public ImportProductRequest setPdLeader(String pdLeader) {
        this.pdLeader = pdLeader;
        return this;
    }
    public String getPdLeader() {
        return this.pdLeader;
    }

    public ImportProductRequest setDevLeader(String devLeader) {
        this.devLeader = devLeader;
        return this;
    }
    public String getDevLeader() {
        return this.devLeader;
    }

    public ImportProductRequest setDev(String dev) {
        this.dev = dev;
        return this;
    }
    public String getDev() {
        return this.dev;
    }

    public ImportProductRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ImportProductRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
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

    public ImportProductRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
