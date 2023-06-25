// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryDeviceTransactionResultData extends TeaModel {
    // 设备所属厂商
    @NameInMap("corp_name")
    @Validation(required = true)
    public String corpName;

    // 场景码,所属项目
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // IMEI
    @NameInMap("device_imei")
    public String deviceImei;

    // 设备sn
    @NameInMap("device_sn")
    @Validation(required = true)
    public String deviceSn;

    // 设备金额
    @NameInMap("price")
    public String price;

    // 设备分布式身份did
    @NameInMap("device_did")
    @Validation(required = true)
    public String deviceDid;

    // 设备终端唯一ID
    @NameInMap("device_tuid")
    public String deviceTuid;

    // 设备参数:品类+型号+规格
    @NameInMap("device_specs")
    @Validation(required = true)
    public String deviceSpecs;

    // 所属租户
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 所属账号
    @NameInMap("account_name")
    @Validation(required = true)
    public String accountName;

    public static QueryDeviceTransactionResultData build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceTransactionResultData self = new QueryDeviceTransactionResultData();
        return TeaModel.build(map, self);
    }

    public QueryDeviceTransactionResultData setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public QueryDeviceTransactionResultData setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public QueryDeviceTransactionResultData setDeviceImei(String deviceImei) {
        this.deviceImei = deviceImei;
        return this;
    }
    public String getDeviceImei() {
        return this.deviceImei;
    }

    public QueryDeviceTransactionResultData setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public QueryDeviceTransactionResultData setPrice(String price) {
        this.price = price;
        return this;
    }
    public String getPrice() {
        return this.price;
    }

    public QueryDeviceTransactionResultData setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public QueryDeviceTransactionResultData setDeviceTuid(String deviceTuid) {
        this.deviceTuid = deviceTuid;
        return this;
    }
    public String getDeviceTuid() {
        return this.deviceTuid;
    }

    public QueryDeviceTransactionResultData setDeviceSpecs(String deviceSpecs) {
        this.deviceSpecs = deviceSpecs;
        return this;
    }
    public String getDeviceSpecs() {
        return this.deviceSpecs;
    }

    public QueryDeviceTransactionResultData setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryDeviceTransactionResultData setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

}
