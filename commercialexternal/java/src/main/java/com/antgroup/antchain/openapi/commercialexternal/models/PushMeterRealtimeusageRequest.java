// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercialexternal.models;

import com.aliyun.tea.*;

public class PushMeterRealtimeusageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求id，防重用
    @NameInMap("request_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String requestId;

    // 计量域编码
    @NameInMap("domain_code")
    @Validation(required = true, maxLength = 128, minLength = 1)
    public String domainCode;

    // 规格编码
    @NameInMap("spec_code")
    @Validation(required = true, maxLength = 128, minLength = 1)
    public String specCode;

    // 资源编码
    @NameInMap("resource_code")
    @Validation(required = true, maxLength = 128, minLength = 1)
    public String resourceCode;

    // 规格实例id
    @NameInMap("spec_instance_id")
    @Validation(required = true, maxLength = 128, minLength = 1)
    public String specInstanceId;

    // 计量数据，json string格式字符串
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // 计量数据发生时间
    @NameInMap("gmt_meter")
    @Validation(required = true)
    public String gmtMeter;

    public static PushMeterRealtimeusageRequest build(java.util.Map<String, ?> map) throws Exception {
        PushMeterRealtimeusageRequest self = new PushMeterRealtimeusageRequest();
        return TeaModel.build(map, self);
    }

    public PushMeterRealtimeusageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushMeterRealtimeusageRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushMeterRealtimeusageRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public PushMeterRealtimeusageRequest setSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }
    public String getSpecCode() {
        return this.specCode;
    }

    public PushMeterRealtimeusageRequest setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
        return this;
    }
    public String getResourceCode() {
        return this.resourceCode;
    }

    public PushMeterRealtimeusageRequest setSpecInstanceId(String specInstanceId) {
        this.specInstanceId = specInstanceId;
        return this;
    }
    public String getSpecInstanceId() {
        return this.specInstanceId;
    }

    public PushMeterRealtimeusageRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public PushMeterRealtimeusageRequest setGmtMeter(String gmtMeter) {
        this.gmtMeter = gmtMeter;
        return this;
    }
    public String getGmtMeter() {
        return this.gmtMeter;
    }

}
