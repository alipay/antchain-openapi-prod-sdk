// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.smartpromotion.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoInnerSppdemandplanlistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务日期 yyyy-MM-dd；不传不过滤日期
    @NameInMap("biz_date")
    public String bizDate;

    // 产品链路APP / WECHAT
    @NameInMap("product_form")
    public String productForm;

    // 审核状态DRAFT / PENDING / APPROVED / REJECTED
    @NameInMap("audit_status")
    public String auditStatus;

    // 运营状态PENDING / RUNNING / PAUSED / FINISHED
    @NameInMap("run_status")
    public String runStatus;

    // 页码，默认1，正整数
    @NameInMap("page_no")
    public Long pageNo;

    // 每页大小，默认20，1～100；超范围报参数错误
    @NameInMap("page_size")
    public Long pageSize;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // traceid
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    public static QueryAntchainAtoInnerSppdemandplanlistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoInnerSppdemandplanlistRequest self = new QueryAntchainAtoInnerSppdemandplanlistRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoInnerSppdemandplanlistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAtoInnerSppdemandplanlistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAtoInnerSppdemandplanlistRequest setBizDate(String bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public String getBizDate() {
        return this.bizDate;
    }

    public QueryAntchainAtoInnerSppdemandplanlistRequest setProductForm(String productForm) {
        this.productForm = productForm;
        return this;
    }
    public String getProductForm() {
        return this.productForm;
    }

    public QueryAntchainAtoInnerSppdemandplanlistRequest setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public String getAuditStatus() {
        return this.auditStatus;
    }

    public QueryAntchainAtoInnerSppdemandplanlistRequest setRunStatus(String runStatus) {
        this.runStatus = runStatus;
        return this;
    }
    public String getRunStatus() {
        return this.runStatus;
    }

    public QueryAntchainAtoInnerSppdemandplanlistRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryAntchainAtoInnerSppdemandplanlistRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAntchainAtoInnerSppdemandplanlistRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAntchainAtoInnerSppdemandplanlistRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
