// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.billing.models;

import com.aliyun.tea.*;

public class QueryBillInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // tenantId租户id必填
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 实例id
    @NameInMap("instance_id")
    public String instanceId;

    // billMonth账期
    @NameInMap("bill_month")
    public String billMonth;

    // productCategory产品类别选填
    @NameInMap("product_category")
    public String productCategory;

    // productName选填
    @NameInMap("product_name")
    public String productName;

    // currentPage 默认为 1
    @NameInMap("current_page")
    public String currentPage;

    // pageSize 默认为 10, 最大为 100
    @NameInMap("page_size")
    public String pageSize;

    // 合同id
    @NameInMap("contract_id")
    public String contractId;

    // 多个实例id
    @NameInMap("instance_id_list")
    public java.util.List<String> instanceIdList;

    public static QueryBillInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBillInstanceRequest self = new QueryBillInstanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryBillInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBillInstanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryBillInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryBillInstanceRequest setBillMonth(String billMonth) {
        this.billMonth = billMonth;
        return this;
    }
    public String getBillMonth() {
        return this.billMonth;
    }

    public QueryBillInstanceRequest setProductCategory(String productCategory) {
        this.productCategory = productCategory;
        return this;
    }
    public String getProductCategory() {
        return this.productCategory;
    }

    public QueryBillInstanceRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public QueryBillInstanceRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public QueryBillInstanceRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryBillInstanceRequest setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public QueryBillInstanceRequest setInstanceIdList(java.util.List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

}
