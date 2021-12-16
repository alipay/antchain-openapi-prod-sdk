// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class PagequeryBillingcoreSpbillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 当前页码
    @NameInMap("current")
    @Validation(required = true)
    public Long current;

    // 每页记录数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 开始时间
    @NameInMap("start_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startDate;

    // 结束时间
    @NameInMap("end_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endDate;

    // 账单状态
    @NameInMap("status")
    public String status;

    public static PagequeryBillingcoreSpbillRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryBillingcoreSpbillRequest self = new PagequeryBillingcoreSpbillRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryBillingcoreSpbillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryBillingcoreSpbillRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public PagequeryBillingcoreSpbillRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryBillingcoreSpbillRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public PagequeryBillingcoreSpbillRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public PagequeryBillingcoreSpbillRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
