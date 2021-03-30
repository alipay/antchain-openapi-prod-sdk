// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class ListCmportUserprofitRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 记账日期 yyyy-mm-dd
    @NameInMap("accounting_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String accountingDate;

    public static ListCmportUserprofitRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCmportUserprofitRequest self = new ListCmportUserprofitRequest();
        return TeaModel.build(map, self);
    }

    public ListCmportUserprofitRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListCmportUserprofitRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListCmportUserprofitRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListCmportUserprofitRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCmportUserprofitRequest setAccountingDate(String accountingDate) {
        this.accountingDate = accountingDate;
        return this;
    }
    public String getAccountingDate() {
        return this.accountingDate;
    }

}
