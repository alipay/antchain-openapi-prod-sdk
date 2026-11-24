// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ListIotsuccessProductQuotaConsumptionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_key")
    @Validation(required = true)
    public String productKey;

    @NameInMap("page_index")
    public Long pageIndex;

    @NameInMap("page_size")
    public Long pageSize;

    @NameInMap("from")
    @Validation(required = true)
    public String from;

    @NameInMap("to")
    @Validation(required = true)
    public String to;

    // 枚举:DAY,WEEK,MONTH
    @NameInMap("granularity")
    @Validation(required = true)
    public String granularity;

    public static ListIotsuccessProductQuotaConsumptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIotsuccessProductQuotaConsumptionRequest self = new ListIotsuccessProductQuotaConsumptionRequest();
        return TeaModel.build(map, self);
    }

    public ListIotsuccessProductQuotaConsumptionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListIotsuccessProductQuotaConsumptionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListIotsuccessProductQuotaConsumptionRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public ListIotsuccessProductQuotaConsumptionRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public ListIotsuccessProductQuotaConsumptionRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListIotsuccessProductQuotaConsumptionRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public ListIotsuccessProductQuotaConsumptionRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public ListIotsuccessProductQuotaConsumptionRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

}
