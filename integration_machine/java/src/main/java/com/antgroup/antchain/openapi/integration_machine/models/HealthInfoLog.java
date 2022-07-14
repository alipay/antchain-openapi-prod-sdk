// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class HealthInfoLog extends TeaModel {
    // 身份证号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 姓名
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 健康码颜色(绿色:1,黄码:2,红码:3,灰码:4)
    @NameInMap("health_code")
    @Validation(required = true)
    public String healthCode;

    // 行程信息
    // 
    @NameInMap("travel_info")
    @Validation(required = true)
    public TravelInfo travelInfo;

    // 核酸信息
    // 
    @NameInMap("nucleic_acid_info")
    @Validation(required = true)
    public NucleicAcidInfo nucleicAcidInfo;

    // 疫苗信息
    // 
    @NameInMap("vaccination_info")
    @Validation(required = true)
    public VaccinationInfo vaccinationInfo;

    // 抗原信息
    // 
    @NameInMap("antigen_info")
    @Validation(required = true)
    public AntigenInfo antigenInfo;

    // 场所信息
    // 
    @NameInMap("scene_info")
    @Validation(required = true)
    public SceneInfo sceneInfo;

    // 数据源通行状态 0:禁止通行,1:允许通行
    // 
    @NameInMap("channel_pass_state")
    @Validation(required = true)
    public String channelPassState;

    // 经度
    // 
    @NameInMap("longitude")
    @Validation(required = true)
    public String longitude;

    // 纬度
    @NameInMap("latitude")
    @Validation(required = true)
    public String latitude;

    // 通行方式（1:自动刷脸, 2:刷证非1:1, 3:刷证1:1, 4:反扫, 5:刷奥智定制卡, 6:手动刷脸）
    // 
    @NameInMap("pass_mode")
    @Validation(required = true)
    public String passMode;

    // 通行时长(单位:毫秒)
    // 
    @NameInMap("pass_duration")
    @Validation(required = true)
    public String passDuration;

    // 通行时间
    // 
    @NameInMap("pass_time")
    @Validation(required = true)
    public String passTime;

    // 通行结果(0:禁止通行,1:允许通行)
    // 
    @NameInMap("pass_result")
    @Validation(required = true)
    public String passResult;

    public static HealthInfoLog build(java.util.Map<String, ?> map) throws Exception {
        HealthInfoLog self = new HealthInfoLog();
        return TeaModel.build(map, self);
    }

    public HealthInfoLog setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public HealthInfoLog setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public HealthInfoLog setHealthCode(String healthCode) {
        this.healthCode = healthCode;
        return this;
    }
    public String getHealthCode() {
        return this.healthCode;
    }

    public HealthInfoLog setTravelInfo(TravelInfo travelInfo) {
        this.travelInfo = travelInfo;
        return this;
    }
    public TravelInfo getTravelInfo() {
        return this.travelInfo;
    }

    public HealthInfoLog setNucleicAcidInfo(NucleicAcidInfo nucleicAcidInfo) {
        this.nucleicAcidInfo = nucleicAcidInfo;
        return this;
    }
    public NucleicAcidInfo getNucleicAcidInfo() {
        return this.nucleicAcidInfo;
    }

    public HealthInfoLog setVaccinationInfo(VaccinationInfo vaccinationInfo) {
        this.vaccinationInfo = vaccinationInfo;
        return this;
    }
    public VaccinationInfo getVaccinationInfo() {
        return this.vaccinationInfo;
    }

    public HealthInfoLog setAntigenInfo(AntigenInfo antigenInfo) {
        this.antigenInfo = antigenInfo;
        return this;
    }
    public AntigenInfo getAntigenInfo() {
        return this.antigenInfo;
    }

    public HealthInfoLog setSceneInfo(SceneInfo sceneInfo) {
        this.sceneInfo = sceneInfo;
        return this;
    }
    public SceneInfo getSceneInfo() {
        return this.sceneInfo;
    }

    public HealthInfoLog setChannelPassState(String channelPassState) {
        this.channelPassState = channelPassState;
        return this;
    }
    public String getChannelPassState() {
        return this.channelPassState;
    }

    public HealthInfoLog setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public HealthInfoLog setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public HealthInfoLog setPassMode(String passMode) {
        this.passMode = passMode;
        return this;
    }
    public String getPassMode() {
        return this.passMode;
    }

    public HealthInfoLog setPassDuration(String passDuration) {
        this.passDuration = passDuration;
        return this;
    }
    public String getPassDuration() {
        return this.passDuration;
    }

    public HealthInfoLog setPassTime(String passTime) {
        this.passTime = passTime;
        return this;
    }
    public String getPassTime() {
        return this.passTime;
    }

    public HealthInfoLog setPassResult(String passResult) {
        this.passResult = passResult;
        return this;
    }
    public String getPassResult() {
        return this.passResult;
    }

}
