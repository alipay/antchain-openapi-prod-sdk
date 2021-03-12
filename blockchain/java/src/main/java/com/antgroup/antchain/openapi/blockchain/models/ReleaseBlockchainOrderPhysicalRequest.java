// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ReleaseBlockchainOrderPhysicalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
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

    public static ReleaseBlockchainOrderPhysicalRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseBlockchainOrderPhysicalRequest self = new ReleaseBlockchainOrderPhysicalRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseBlockchainOrderPhysicalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReleaseBlockchainOrderPhysicalRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReleaseBlockchainOrderPhysicalRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public ReleaseBlockchainOrderPhysicalRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public ReleaseBlockchainOrderPhysicalRequest setGmtWakeup(String gmtWakeup) {
        this.gmtWakeup = gmtWakeup;
        return this;
    }
    public String getGmtWakeup() {
        return this.gmtWakeup;
    }

    public ReleaseBlockchainOrderPhysicalRequest setHid(Long hid) {
        this.hid = hid;
        return this;
    }
    public Long getHid() {
        return this.hid;
    }

    public ReleaseBlockchainOrderPhysicalRequest setInterrupt(Boolean interrupt) {
        this.interrupt = interrupt;
        return this;
    }
    public Boolean getInterrupt() {
        return this.interrupt;
    }

    public ReleaseBlockchainOrderPhysicalRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public ReleaseBlockchainOrderPhysicalRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReleaseBlockchainOrderPhysicalRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReleaseBlockchainOrderPhysicalRequest setTaskExtraData(String taskExtraData) {
        this.taskExtraData = taskExtraData;
        return this;
    }
    public String getTaskExtraData() {
        return this.taskExtraData;
    }

    public ReleaseBlockchainOrderPhysicalRequest setTaskIdentifier(String taskIdentifier) {
        this.taskIdentifier = taskIdentifier;
        return this;
    }
    public String getTaskIdentifier() {
        return this.taskIdentifier;
    }

}
