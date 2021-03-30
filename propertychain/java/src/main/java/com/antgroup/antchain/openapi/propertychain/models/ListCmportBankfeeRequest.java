// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class ListCmportBankfeeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // accountingDate
    @NameInMap("account_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String accountDate;

    // 页码，从1开始
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 页大小，最大100
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static ListCmportBankfeeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCmportBankfeeRequest self = new ListCmportBankfeeRequest();
        return TeaModel.build(map, self);
    }

    public ListCmportBankfeeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListCmportBankfeeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListCmportBankfeeRequest setAccountDate(String accountDate) {
        this.accountDate = accountDate;
        return this;
    }
    public String getAccountDate() {
        return this.accountDate;
    }

    public ListCmportBankfeeRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListCmportBankfeeRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
