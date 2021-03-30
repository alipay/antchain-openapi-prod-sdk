// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class InsureCarrierObjectInfo extends TeaModel {
    // 厂牌型号
    @NameInMap("cp_model")
    @Validation(required = true)
    public String cpModel;

    // 车架号
    @NameInMap("frame_no")
    @Validation(required = true)
    public String frameNo;

    // 车牌号码
    @NameInMap("license_no")
    @Validation(required = true)
    public String licenseNo;

    // 吨位
    @NameInMap("ton_nage")
    @Validation(required = true)
    public String tonNage;

    // 行驶证车主
    @NameInMap("driv_per")
    @Validation(required = true)
    public String drivPer;

    // 运营证号
    @NameInMap("run_no")
    @Validation(required = true)
    public String runNo;

    // 运输货物
    @NameInMap("ts_car_go")
    @Validation(required = true)
    public String tsCarGo;

    public static InsureCarrierObjectInfo build(java.util.Map<String, ?> map) throws Exception {
        InsureCarrierObjectInfo self = new InsureCarrierObjectInfo();
        return TeaModel.build(map, self);
    }

    public InsureCarrierObjectInfo setCpModel(String cpModel) {
        this.cpModel = cpModel;
        return this;
    }
    public String getCpModel() {
        return this.cpModel;
    }

    public InsureCarrierObjectInfo setFrameNo(String frameNo) {
        this.frameNo = frameNo;
        return this;
    }
    public String getFrameNo() {
        return this.frameNo;
    }

    public InsureCarrierObjectInfo setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
        return this;
    }
    public String getLicenseNo() {
        return this.licenseNo;
    }

    public InsureCarrierObjectInfo setTonNage(String tonNage) {
        this.tonNage = tonNage;
        return this;
    }
    public String getTonNage() {
        return this.tonNage;
    }

    public InsureCarrierObjectInfo setDrivPer(String drivPer) {
        this.drivPer = drivPer;
        return this;
    }
    public String getDrivPer() {
        return this.drivPer;
    }

    public InsureCarrierObjectInfo setRunNo(String runNo) {
        this.runNo = runNo;
        return this;
    }
    public String getRunNo() {
        return this.runNo;
    }

    public InsureCarrierObjectInfo setTsCarGo(String tsCarGo) {
        this.tsCarGo = tsCarGo;
        return this;
    }
    public String getTsCarGo() {
        return this.tsCarGo;
    }

}
