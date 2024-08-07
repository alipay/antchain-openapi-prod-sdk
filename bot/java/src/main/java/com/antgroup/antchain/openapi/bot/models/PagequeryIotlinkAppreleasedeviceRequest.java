// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PagequeryIotlinkAppreleasedeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名称
    @NameInMap("apk_name")
    public String apkName;

    // 应用版本号
    @NameInMap("apk_version")
    public String apkVersion;

    // 工单id
    @NameInMap("order_id")
    public String orderId;

    // 设备sn
    @NameInMap("device_sn")
    public String deviceSn;

    // 设备升级状态
    // 待确认：CONFIRM
    // 待推送：QUEUED
    // 已推送：NOTIFIED
    // 升级中：IN_PROGRESS
    // 升级成功：SUCCEEDED
    // 升级失败：FAILED
    // 已取消：CANCELED
    // 升级超时：TIMEOUT
    @NameInMap("status")
    public String status;

    // 当前页
    @NameInMap("current")
    @Validation(required = true)
    public Long current;

    // 每页数量
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static PagequeryIotlinkAppreleasedeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryIotlinkAppreleasedeviceRequest self = new PagequeryIotlinkAppreleasedeviceRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryIotlinkAppreleasedeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryIotlinkAppreleasedeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryIotlinkAppreleasedeviceRequest setApkName(String apkName) {
        this.apkName = apkName;
        return this;
    }
    public String getApkName() {
        return this.apkName;
    }

    public PagequeryIotlinkAppreleasedeviceRequest setApkVersion(String apkVersion) {
        this.apkVersion = apkVersion;
        return this;
    }
    public String getApkVersion() {
        return this.apkVersion;
    }

    public PagequeryIotlinkAppreleasedeviceRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public PagequeryIotlinkAppreleasedeviceRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public PagequeryIotlinkAppreleasedeviceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PagequeryIotlinkAppreleasedeviceRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public PagequeryIotlinkAppreleasedeviceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
