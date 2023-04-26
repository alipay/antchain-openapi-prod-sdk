// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class XrTicketPoolBatchReq extends TeaModel {
    // 资源id
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    // 通行证有效期
    @NameInMap("valid_time")
    @Validation(required = true)
    public String validTime;

    // 体验时长
    @NameInMap("test_time")
    @Validation(required = true)
    public Long testTime;

    // vr设备集合
    @NameInMap("xr_apps")
    public String xrApps;

    // 券池最大出票数
    @NameInMap("max_pool_count")
    @Validation(required = true)
    public Long maxPoolCount;

    // 通行证名称
    @NameInMap("xr_ticket_pool_name")
    @Validation(required = true)
    public String xrTicketPoolName;

    // 核销类型
    @NameInMap("xr_verification_type")
    @Validation(required = true)
    public String xrVerificationType;

    public static XrTicketPoolBatchReq build(java.util.Map<String, ?> map) throws Exception {
        XrTicketPoolBatchReq self = new XrTicketPoolBatchReq();
        return TeaModel.build(map, self);
    }

    public XrTicketPoolBatchReq setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public XrTicketPoolBatchReq setValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }
    public String getValidTime() {
        return this.validTime;
    }

    public XrTicketPoolBatchReq setTestTime(Long testTime) {
        this.testTime = testTime;
        return this;
    }
    public Long getTestTime() {
        return this.testTime;
    }

    public XrTicketPoolBatchReq setXrApps(String xrApps) {
        this.xrApps = xrApps;
        return this;
    }
    public String getXrApps() {
        return this.xrApps;
    }

    public XrTicketPoolBatchReq setMaxPoolCount(Long maxPoolCount) {
        this.maxPoolCount = maxPoolCount;
        return this;
    }
    public Long getMaxPoolCount() {
        return this.maxPoolCount;
    }

    public XrTicketPoolBatchReq setXrTicketPoolName(String xrTicketPoolName) {
        this.xrTicketPoolName = xrTicketPoolName;
        return this;
    }
    public String getXrTicketPoolName() {
        return this.xrTicketPoolName;
    }

    public XrTicketPoolBatchReq setXrVerificationType(String xrVerificationType) {
        this.xrVerificationType = xrVerificationType;
        return this;
    }
    public String getXrVerificationType() {
        return this.xrVerificationType;
    }

}
