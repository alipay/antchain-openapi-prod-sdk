// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PagequeryXrCustomerdeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备sn
    @NameInMap("device_sn")
    public String deviceSn;

    // 服务状态
    @NameInMap("service_status")
    public String serviceStatus;

    // 设备状态
    @NameInMap("device_status")
    public String deviceStatus;

    //  设备品类-型号-规格  
    @NameInMap("device_type")
    public String deviceType;

    // 当前页
    @NameInMap("current")
    @Validation(required = true)
    public Long current;

    // 每页数据
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 业务类型
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    public static PagequeryXrCustomerdeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryXrCustomerdeviceRequest self = new PagequeryXrCustomerdeviceRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryXrCustomerdeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryXrCustomerdeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryXrCustomerdeviceRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public PagequeryXrCustomerdeviceRequest setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    public PagequeryXrCustomerdeviceRequest setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
        return this;
    }
    public String getDeviceStatus() {
        return this.deviceStatus;
    }

    public PagequeryXrCustomerdeviceRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public PagequeryXrCustomerdeviceRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public PagequeryXrCustomerdeviceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryXrCustomerdeviceRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

}
