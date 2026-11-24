// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class ListBlockchainBotIotsuccessProductQuotaConsumptionRequest extends TeaModel {
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

    public static ListBlockchainBotIotsuccessProductQuotaConsumptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBlockchainBotIotsuccessProductQuotaConsumptionRequest self = new ListBlockchainBotIotsuccessProductQuotaConsumptionRequest();
        return TeaModel.build(map, self);
    }

    public ListBlockchainBotIotsuccessProductQuotaConsumptionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListBlockchainBotIotsuccessProductQuotaConsumptionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListBlockchainBotIotsuccessProductQuotaConsumptionRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public ListBlockchainBotIotsuccessProductQuotaConsumptionRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public ListBlockchainBotIotsuccessProductQuotaConsumptionRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListBlockchainBotIotsuccessProductQuotaConsumptionRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public ListBlockchainBotIotsuccessProductQuotaConsumptionRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public ListBlockchainBotIotsuccessProductQuotaConsumptionRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

}
