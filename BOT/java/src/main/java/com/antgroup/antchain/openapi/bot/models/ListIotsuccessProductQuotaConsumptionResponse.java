// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ListIotsuccessProductQuotaConsumptionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 枚举:LICENSES,INSTANCE_POOL
    @NameInMap("scope")
    @Validation(required = true)
    public String scope;

    @NameInMap("shared_pool")
    @Validation(required = true)
    public Boolean sharedPool;

    // 枚举:AGENT_REQUEST
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    // 枚举:QUOTA_POINT
    @NameInMap("unit")
    @Validation(required = true)
    public String unit;

    // 所有入口切换并完成在途处理和基准余额保存后的可靠覆盖起点；未知为null
    @NameInMap("coverage_from")
    @Validation(required = true)
    public String coverageFrom;

    // 当前请求范围中所有周期均有已提交流水覆盖
    @NameInMap("complete")
    @Validation(required = true)
    public Boolean complete;

    // 本次强一致查询时点，不是完整结算水位或跨页快照
    @NameInMap("as_of")
    @Validation(required = true)
    public String asOf;

    @NameInMap("items")
    @Validation(required = true)
    public java.util.List<OpenApiQuotaConsumptionItem> items;

    public static ListIotsuccessProductQuotaConsumptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIotsuccessProductQuotaConsumptionResponse self = new ListIotsuccessProductQuotaConsumptionResponse();
        return TeaModel.build(map, self);
    }

    public ListIotsuccessProductQuotaConsumptionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListIotsuccessProductQuotaConsumptionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListIotsuccessProductQuotaConsumptionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListIotsuccessProductQuotaConsumptionResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListIotsuccessProductQuotaConsumptionResponse setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public ListIotsuccessProductQuotaConsumptionResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListIotsuccessProductQuotaConsumptionResponse setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListIotsuccessProductQuotaConsumptionResponse setSharedPool(Boolean sharedPool) {
        this.sharedPool = sharedPool;
        return this;
    }
    public Boolean getSharedPool() {
        return this.sharedPool;
    }

    public ListIotsuccessProductQuotaConsumptionResponse setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListIotsuccessProductQuotaConsumptionResponse setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public ListIotsuccessProductQuotaConsumptionResponse setCoverageFrom(String coverageFrom) {
        this.coverageFrom = coverageFrom;
        return this;
    }
    public String getCoverageFrom() {
        return this.coverageFrom;
    }

    public ListIotsuccessProductQuotaConsumptionResponse setComplete(Boolean complete) {
        this.complete = complete;
        return this;
    }
    public Boolean getComplete() {
        return this.complete;
    }

    public ListIotsuccessProductQuotaConsumptionResponse setAsOf(String asOf) {
        this.asOf = asOf;
        return this;
    }
    public String getAsOf() {
        return this.asOf;
    }

    public ListIotsuccessProductQuotaConsumptionResponse setItems(java.util.List<OpenApiQuotaConsumptionItem> items) {
        this.items = items;
        return this;
    }
    public java.util.List<OpenApiQuotaConsumptionItem> getItems() {
        return this.items;
    }

}
