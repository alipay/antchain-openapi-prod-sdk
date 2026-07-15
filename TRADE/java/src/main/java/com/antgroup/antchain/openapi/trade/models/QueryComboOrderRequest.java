// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class QueryComboOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户ID，租户ID和租户名称二选一必填
    @NameInMap("tenant_id")
    public String tenantId;

    // 租户名称，租户ID和租户名称二选一必填
    @NameInMap("tenant_name")
    public String tenantName;

    // 订单状态
    @NameInMap("status")
    public String status;

    // 套餐编码
    @NameInMap("combo_code")
    public String comboCode;

    // 下单开始时间
    @NameInMap("begin_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String beginTime;

    // 下单结束时间
    @NameInMap("end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // 每页数量，不传默认20
    @NameInMap("page_size")
    public Long pageSize;

    // 当前页数，不传则默认1
    @NameInMap("page_no")
    public Long pageNo;

    public static QueryComboOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryComboOrderRequest self = new QueryComboOrderRequest();
        return TeaModel.build(map, self);
    }

    public QueryComboOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryComboOrderRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryComboOrderRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public QueryComboOrderRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryComboOrderRequest setComboCode(String comboCode) {
        this.comboCode = comboCode;
        return this;
    }
    public String getComboCode() {
        return this.comboCode;
    }

    public QueryComboOrderRequest setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public QueryComboOrderRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryComboOrderRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryComboOrderRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

}
