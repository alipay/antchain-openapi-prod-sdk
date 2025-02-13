// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ListSimOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备编号
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 请求的页数
    @NameInMap("page_no")
    @Validation(required = true)
    public Long pageNo;

    // 单页项数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 登录态token
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    public static ListSimOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSimOrderRequest self = new ListSimOrderRequest();
        return TeaModel.build(map, self);
    }

    public ListSimOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSimOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListSimOrderRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ListSimOrderRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListSimOrderRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSimOrderRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
