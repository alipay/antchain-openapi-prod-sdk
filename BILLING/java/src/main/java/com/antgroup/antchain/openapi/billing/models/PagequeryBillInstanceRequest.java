// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.billing.models;

import com.aliyun.tea.*;

public class PagequeryBillInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // iaasId
    @NameInMap("iaas_id")
    @Validation(required = true)
    public String iaasId;

    // 毫秒数时间-表示要查询的月份
    @NameInMap("time_in_milli_second")
    @Validation(required = true)
    public String timeInMilliSecond;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 当前页
    @NameInMap("page_no")
    @Validation(required = true)
    public Long pageNo;

    // 单页数据量
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 需要零账单
    @NameInMap("need_zero_bill")
    @Validation(required = true)
    public Boolean needZeroBill;

    public static PagequeryBillInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryBillInstanceRequest self = new PagequeryBillInstanceRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryBillInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryBillInstanceRequest setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public PagequeryBillInstanceRequest setTimeInMilliSecond(String timeInMilliSecond) {
        this.timeInMilliSecond = timeInMilliSecond;
        return this;
    }
    public String getTimeInMilliSecond() {
        return this.timeInMilliSecond;
    }

    public PagequeryBillInstanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PagequeryBillInstanceRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public PagequeryBillInstanceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryBillInstanceRequest setNeedZeroBill(Boolean needZeroBill) {
        this.needZeroBill = needZeroBill;
        return this;
    }
    public Boolean getNeedZeroBill() {
        return this.needZeroBill;
    }

}
