// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeEcloanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务场景
    @NameInMap("business_scene")
    @Validation(required = true)
    public String businessScene;

    // 交易流水号
    @NameInMap("transaction_no")
    @Validation(required = true)
    public String transactionNo;

    // 合同编号
    @NameInMap("contract_no")
    @Validation(required = true)
    public String contractNo;

    // 申请单号
    @NameInMap("order_no")
    public String orderNo;

    // 页码
    @NameInMap("page_no")
    public String pageNo;

    // 每页条数
    @NameInMap("page_size")
    public String pageSize;

    // 申请人身份证号码
    @NameInMap("applicant_id_no")
    public String applicantIdNo;

    // 企业证件号码 当申请人身份证号码为空时,企业证件号码不允许为空
    @NameInMap("ent_id_no")
    public String entIdNo;

    public static QueryDubbridgeEcloanRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeEcloanRequest self = new QueryDubbridgeEcloanRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeEcloanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeEcloanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeEcloanRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public QueryDubbridgeEcloanRequest setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
        return this;
    }
    public String getTransactionNo() {
        return this.transactionNo;
    }

    public QueryDubbridgeEcloanRequest setContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }
    public String getContractNo() {
        return this.contractNo;
    }

    public QueryDubbridgeEcloanRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryDubbridgeEcloanRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public QueryDubbridgeEcloanRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryDubbridgeEcloanRequest setApplicantIdNo(String applicantIdNo) {
        this.applicantIdNo = applicantIdNo;
        return this;
    }
    public String getApplicantIdNo() {
        return this.applicantIdNo;
    }

    public QueryDubbridgeEcloanRequest setEntIdNo(String entIdNo) {
        this.entIdNo = entIdNo;
        return this;
    }
    public String getEntIdNo() {
        return this.entIdNo;
    }

}
