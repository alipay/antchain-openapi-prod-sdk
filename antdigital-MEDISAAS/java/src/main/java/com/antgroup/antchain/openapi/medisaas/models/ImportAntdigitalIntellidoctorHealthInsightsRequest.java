// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.medisaas.models;

import com.aliyun.tea.*;

public class ImportAntdigitalIntellidoctorHealthInsightsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户Code
    @NameInMap("customcode")
    @Validation(required = true)
    public String customcode;

    // 终端用户ID
    @NameInMap("userid")
    @Validation(required = true)
    public String userid;

    // 物模型数据列表，JSON 数组字符串
    @NameInMap("datalist")
    @Validation(required = true)
    public String datalist;

    // 设备 ID
    @NameInMap("deviceid")
    public String deviceid;

    public static ImportAntdigitalIntellidoctorHealthInsightsRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportAntdigitalIntellidoctorHealthInsightsRequest self = new ImportAntdigitalIntellidoctorHealthInsightsRequest();
        return TeaModel.build(map, self);
    }

    public ImportAntdigitalIntellidoctorHealthInsightsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportAntdigitalIntellidoctorHealthInsightsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportAntdigitalIntellidoctorHealthInsightsRequest setCustomcode(String customcode) {
        this.customcode = customcode;
        return this;
    }
    public String getCustomcode() {
        return this.customcode;
    }

    public ImportAntdigitalIntellidoctorHealthInsightsRequest setUserid(String userid) {
        this.userid = userid;
        return this;
    }
    public String getUserid() {
        return this.userid;
    }

    public ImportAntdigitalIntellidoctorHealthInsightsRequest setDatalist(String datalist) {
        this.datalist = datalist;
        return this;
    }
    public String getDatalist() {
        return this.datalist;
    }

    public ImportAntdigitalIntellidoctorHealthInsightsRequest setDeviceid(String deviceid) {
        this.deviceid = deviceid;
        return this;
    }
    public String getDeviceid() {
        return this.deviceid;
    }

}
