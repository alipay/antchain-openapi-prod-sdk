// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class CustodydetailAntdigitalWebttsDacBillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // CIF ID
    @NameInMap("cif_id")
    @Validation(required = true)
    public String cifId;

    // operatorId
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 账期，格式：YYYY-MM
    @NameInMap("bill_month")
    @Validation(required = true)
    public String billMonth;

    // 分页数
    @NameInMap("page_num")
    public Long pageNum;

    // 分页
    @NameInMap("page_size")
    public Long pageSize;

    public static CustodydetailAntdigitalWebttsDacBillRequest build(java.util.Map<String, ?> map) throws Exception {
        CustodydetailAntdigitalWebttsDacBillRequest self = new CustodydetailAntdigitalWebttsDacBillRequest();
        return TeaModel.build(map, self);
    }

    public CustodydetailAntdigitalWebttsDacBillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CustodydetailAntdigitalWebttsDacBillRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CustodydetailAntdigitalWebttsDacBillRequest setCifId(String cifId) {
        this.cifId = cifId;
        return this;
    }
    public String getCifId() {
        return this.cifId;
    }

    public CustodydetailAntdigitalWebttsDacBillRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public CustodydetailAntdigitalWebttsDacBillRequest setBillMonth(String billMonth) {
        this.billMonth = billMonth;
        return this;
    }
    public String getBillMonth() {
        return this.billMonth;
    }

    public CustodydetailAntdigitalWebttsDacBillRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public CustodydetailAntdigitalWebttsDacBillRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
