// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryDeviceRegisterresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备SN，可以传deviceSn和corpName，或者deviceDid，都传的以deviceDid为准
    @NameInMap("device_sn")
    public String deviceSn;

    // 设备厂商名称，可以传deviceSn和corpName，或者deviceDid，都传的以deviceDid为准
    @NameInMap("corp_name")
    public String corpName;

    // 设备did，可以传deviceSn和corpName，或者deviceDid，都传的以deviceDid为准
    @NameInMap("device_did")
    public String deviceDid;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static QueryDeviceRegisterresultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceRegisterresultRequest self = new QueryDeviceRegisterresultRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceRegisterresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDeviceRegisterresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDeviceRegisterresultRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public QueryDeviceRegisterresultRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public QueryDeviceRegisterresultRequest setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public QueryDeviceRegisterresultRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
