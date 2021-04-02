// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ThingsDidUpdateReq extends TeaModel {
    // 业务类型，默认空
    @NameInMap("biz_type")
    public String bizType;

    // 待更新的实体did
    @NameInMap("thing_did")
    @Validation(required = true)
    public String thingDid;

    // 更新内容，参考更新请求不同实体类型结构体，对应不同实体类型不一样
    // 信物链实体附加信息 不同实体身份，有不同的json组织格式，
    // 参考 DeviceRegisterReqModel， SpaceRegisterReqModel， CorporateReqModel， WarehouseReqModel，
    @NameInMap("thing_extra_params")
    public String thingExtraParams;

    // 更新后的实体版本
    @NameInMap("thing_version")
    @Validation(required = true)
    public String thingVersion;

    public static ThingsDidUpdateReq build(java.util.Map<String, ?> map) throws Exception {
        ThingsDidUpdateReq self = new ThingsDidUpdateReq();
        return TeaModel.build(map, self);
    }

    public ThingsDidUpdateReq setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ThingsDidUpdateReq setThingDid(String thingDid) {
        this.thingDid = thingDid;
        return this;
    }
    public String getThingDid() {
        return this.thingDid;
    }

    public ThingsDidUpdateReq setThingExtraParams(String thingExtraParams) {
        this.thingExtraParams = thingExtraParams;
        return this;
    }
    public String getThingExtraParams() {
        return this.thingExtraParams;
    }

    public ThingsDidUpdateReq setThingVersion(String thingVersion) {
        this.thingVersion = thingVersion;
        return this;
    }
    public String getThingVersion() {
        return this.thingVersion;
    }

}
