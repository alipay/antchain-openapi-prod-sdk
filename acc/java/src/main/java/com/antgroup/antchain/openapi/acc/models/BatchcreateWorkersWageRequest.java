// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class BatchcreateWorkersWageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 项目编号
    @NameInMap("project_code")
    @Validation(required = true)
    public String projectCode;

    // 身份证号
    @NameInMap("id_card")
    @Validation(required = true)
    public String idCard;

    // 农民工工资发放信息
    @NameInMap("wage_list")
    @Validation(required = true)
    public java.util.List<WorkersWagePayment> wageList;

    public static BatchcreateWorkersWageRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateWorkersWageRequest self = new BatchcreateWorkersWageRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateWorkersWageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateWorkersWageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateWorkersWageRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public BatchcreateWorkersWageRequest setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }
    public String getIdCard() {
        return this.idCard;
    }

    public BatchcreateWorkersWageRequest setWageList(java.util.List<WorkersWagePayment> wageList) {
        this.wageList = wageList;
        return this;
    }
    public java.util.List<WorkersWagePayment> getWageList() {
        return this.wageList;
    }

}
