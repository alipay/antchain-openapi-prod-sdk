// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class WhiteListInfo extends TeaModel {
    // app_ame
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 2018-10-10T10:10:00Z
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // instance_id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 机房选择：0非弹机房，1弹性机房；
    @NameInMap("is_elastic")
    @Validation(required = true)
    public Long isElastic;

    // 0正常流量，1影子流量；
    @NameInMap("is_load_test")
    @Validation(required = true)
    public Long isLoadTest;

    // 数据源名称
    @NameInMap("logical_ds_name")
    @Validation(required = true)
    public String logicalDsName;

    // business_type
    @NameInMap("business_type")
    public String businessType;

    public static WhiteListInfo build(java.util.Map<String, ?> map) throws Exception {
        WhiteListInfo self = new WhiteListInfo();
        return TeaModel.build(map, self);
    }

    public WhiteListInfo setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public WhiteListInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public WhiteListInfo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public WhiteListInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public WhiteListInfo setIsElastic(Long isElastic) {
        this.isElastic = isElastic;
        return this;
    }
    public Long getIsElastic() {
        return this.isElastic;
    }

    public WhiteListInfo setIsLoadTest(Long isLoadTest) {
        this.isLoadTest = isLoadTest;
        return this;
    }
    public Long getIsLoadTest() {
        return this.isLoadTest;
    }

    public WhiteListInfo setLogicalDsName(String logicalDsName) {
        this.logicalDsName = logicalDsName;
        return this;
    }
    public String getLogicalDsName() {
        return this.logicalDsName;
    }

    public WhiteListInfo setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

}
