// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CheckBlockchainResourceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // bid
    @NameInMap("bid")
    @Validation(required = true)
    public String bid;

    // country
    @NameInMap("country")
    public String country;

    // gmt_wakeup
    @NameInMap("gmt_wakeup")
    public String gmtWakeup;

    // hid
    @NameInMap("hid")
    @Validation(required = true)
    public Long hid;

    // interrupt
    @NameInMap("interrupt")
    public Boolean interrupt;

    // pk
    @NameInMap("pk")
    @Validation(required = true)
    public String pk;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    // request_id
    @NameInMap("request_id")
    public String requestId;

    // task_extra_data
    @NameInMap("task_extra_data")
    public String taskExtraData;

    // task_identifier
    @NameInMap("task_identifier")
    public String taskIdentifier;

    public static CheckBlockchainResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckBlockchainResourceRequest self = new CheckBlockchainResourceRequest();
        return TeaModel.build(map, self);
    }

    public CheckBlockchainResourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckBlockchainResourceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckBlockchainResourceRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public CheckBlockchainResourceRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public CheckBlockchainResourceRequest setGmtWakeup(String gmtWakeup) {
        this.gmtWakeup = gmtWakeup;
        return this;
    }
    public String getGmtWakeup() {
        return this.gmtWakeup;
    }

    public CheckBlockchainResourceRequest setHid(Long hid) {
        this.hid = hid;
        return this;
    }
    public Long getHid() {
        return this.hid;
    }

    public CheckBlockchainResourceRequest setInterrupt(Boolean interrupt) {
        this.interrupt = interrupt;
        return this;
    }
    public Boolean getInterrupt() {
        return this.interrupt;
    }

    public CheckBlockchainResourceRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public CheckBlockchainResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckBlockchainResourceRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckBlockchainResourceRequest setTaskExtraData(String taskExtraData) {
        this.taskExtraData = taskExtraData;
        return this;
    }
    public String getTaskExtraData() {
        return this.taskExtraData;
    }

    public CheckBlockchainResourceRequest setTaskIdentifier(String taskIdentifier) {
        this.taskIdentifier = taskIdentifier;
        return this;
    }
    public String getTaskIdentifier() {
        return this.taskIdentifier;
    }

}
