// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercialexternal.models;

import com.aliyun.tea.*;

public class PushMeterPeriodicusageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 计量域编码
    @NameInMap("domain_code")
    @Validation(required = true, maxLength = 128, minLength = 1)
    public String domainCode;

    // 规格编码
    @NameInMap("spec_code")
    @Validation(required = true, maxLength = 128, minLength = 1)
    public String specCode;

    // 	
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

    // 计量数据对应的发生周期开始时间yyyyMMddHHmmss格式
    @NameInMap("gmt_meter_begin")
    @Validation(required = true)
    public String gmtMeterBegin;

    // 计量数据对应的发生周期开始时间yyyyMMddHHmmss格式
    @NameInMap("gmt_meter_end")
    @Validation(required = true)
    public String gmtMeterEnd;

    public static PushMeterPeriodicusageRequest build(java.util.Map<String, ?> map) throws Exception {
        PushMeterPeriodicusageRequest self = new PushMeterPeriodicusageRequest();
        return TeaModel.build(map, self);
    }

    public PushMeterPeriodicusageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushMeterPeriodicusageRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public PushMeterPeriodicusageRequest setSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }
    public String getSpecCode() {
        return this.specCode;
    }

    public PushMeterPeriodicusageRequest setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
        return this;
    }
    public String getResourceCode() {
        return this.resourceCode;
    }

    public PushMeterPeriodicusageRequest setSpecInstanceId(String specInstanceId) {
        this.specInstanceId = specInstanceId;
        return this;
    }
    public String getSpecInstanceId() {
        return this.specInstanceId;
    }

    public PushMeterPeriodicusageRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public PushMeterPeriodicusageRequest setGmtMeterBegin(String gmtMeterBegin) {
        this.gmtMeterBegin = gmtMeterBegin;
        return this;
    }
    public String getGmtMeterBegin() {
        return this.gmtMeterBegin;
    }

    public PushMeterPeriodicusageRequest setGmtMeterEnd(String gmtMeterEnd) {
        this.gmtMeterEnd = gmtMeterEnd;
        return this;
    }
    public String getGmtMeterEnd() {
        return this.gmtMeterEnd;
    }

}
