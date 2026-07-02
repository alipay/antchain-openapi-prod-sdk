// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ExecDeviceCustomerthingserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备sn
    @NameInMap("sn")
    @Validation(required = true)
    public String sn;

    // 设备厂商
    @NameInMap("corp")
    @Validation(required = true)
    public String corp;

    // 设备所属用户
    @NameInMap("user")
    @Validation(required = true)
    public String user;

    // 服务调用标识符
    @NameInMap("service_identifier")
    @Validation(required = true)
    public String serviceIdentifier;

    // 服务调用参数 key-value，json字符串
    @NameInMap("service_args")
    public String serviceArgs;

    public static ExecDeviceCustomerthingserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDeviceCustomerthingserviceRequest self = new ExecDeviceCustomerthingserviceRequest();
        return TeaModel.build(map, self);
    }

    public ExecDeviceCustomerthingserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecDeviceCustomerthingserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecDeviceCustomerthingserviceRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public ExecDeviceCustomerthingserviceRequest setCorp(String corp) {
        this.corp = corp;
        return this;
    }
    public String getCorp() {
        return this.corp;
    }

    public ExecDeviceCustomerthingserviceRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

    public ExecDeviceCustomerthingserviceRequest setServiceIdentifier(String serviceIdentifier) {
        this.serviceIdentifier = serviceIdentifier;
        return this;
    }
    public String getServiceIdentifier() {
        return this.serviceIdentifier;
    }

    public ExecDeviceCustomerthingserviceRequest setServiceArgs(String serviceArgs) {
        this.serviceArgs = serviceArgs;
        return this;
    }
    public String getServiceArgs() {
        return this.serviceArgs;
    }

}
