// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class ListAntdigitalWebttsDacBillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // CIF ID（从登录态解析）
    @NameInMap("cif_id")
    @Validation(required = true)
    public String cifId;

    // 操作人ID（从登录态解析）
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 账期，格式：YYYY-MM，不传则返回最近12个月
    @NameInMap("bill_month")
    public String billMonth;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 每页条数
    @NameInMap("page_size")
    public Long pageSize;

    public static ListAntdigitalWebttsDacBillRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAntdigitalWebttsDacBillRequest self = new ListAntdigitalWebttsDacBillRequest();
        return TeaModel.build(map, self);
    }

    public ListAntdigitalWebttsDacBillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAntdigitalWebttsDacBillRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListAntdigitalWebttsDacBillRequest setCifId(String cifId) {
        this.cifId = cifId;
        return this;
    }
    public String getCifId() {
        return this.cifId;
    }

    public ListAntdigitalWebttsDacBillRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public ListAntdigitalWebttsDacBillRequest setBillMonth(String billMonth) {
        this.billMonth = billMonth;
        return this;
    }
    public String getBillMonth() {
        return this.billMonth;
    }

    public ListAntdigitalWebttsDacBillRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListAntdigitalWebttsDacBillRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
