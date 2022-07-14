// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class PushHealthinfologRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 通行记录ID
    @NameInMap("pass_id")
    @Validation(required = true)
    public String passId;

    // 设备SN
    @NameInMap("serial_no")
    @Validation(required = true)
    public String serialNo;

    // 设备厂商
    // 
    @NameInMap("corp_name")
    @Validation(required = true)
    public String corpName;

    // 通行时长(ms)
    @NameInMap("cost_time")
    @Validation(required = true)
    public Long costTime;

    // 通行结果
    @NameInMap("pass_result")
    public String passResult;

    // 被查询人姓名
    // 
    @NameInMap("name")
    public String name;

    // 被查询人身份证号
    @NameInMap("cert_no")
    public String certNo;

    // 异常类型
    @NameInMap("error_type")
    public String errorType;

    // 错误码
    @NameInMap("error_code")
    public String errorCode;

    // 错误信息
    @NameInMap("error_msg")
    public String errorMsg;

    // 体温
    @NameInMap("temperature")
    public String temperature;

    // 健康信息
    @NameInMap("health_info")
    public HealthInfo healthInfo;

    // 核酸信息
    @NameInMap("nucleic_acid_info")
    public NucleicAcidInfo nucleicAcidInfo;

    // 行程信息
    // 
    @NameInMap("travel_info")
    public TravelInfo travelInfo;

    // 疫苗接种信息
    @NameInMap("vaccination_info")
    public VaccinationInfo vaccinationInfo;

    // 抗原信息
    @NameInMap("antigen_info")
    public AntigenInfo antigenInfo;

    // 场所信息
    // 
    @NameInMap("scene_info")
    public SceneInfo sceneInfo;

    // 通行方式(1:自动刷脸, 2:刷证非1:1, 3:刷证1:1, 4:反扫, 5:刷奥智定制卡, 6:手动刷脸)
    @NameInMap("pass_mode")
    public String passMode;

    // 经度
    @NameInMap("longitude")
    public String longitude;

    // 纬度
    @NameInMap("latitude")
    public String latitude;

    // 数据源通行状态 0:禁止通行,1:允许通行
    @NameInMap("channel_pass_state")
    public String channelPassState;

    public static PushHealthinfologRequest build(java.util.Map<String, ?> map) throws Exception {
        PushHealthinfologRequest self = new PushHealthinfologRequest();
        return TeaModel.build(map, self);
    }

    public PushHealthinfologRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushHealthinfologRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushHealthinfologRequest setPassId(String passId) {
        this.passId = passId;
        return this;
    }
    public String getPassId() {
        return this.passId;
    }

    public PushHealthinfologRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

    public PushHealthinfologRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public PushHealthinfologRequest setCostTime(Long costTime) {
        this.costTime = costTime;
        return this;
    }
    public Long getCostTime() {
        return this.costTime;
    }

    public PushHealthinfologRequest setPassResult(String passResult) {
        this.passResult = passResult;
        return this;
    }
    public String getPassResult() {
        return this.passResult;
    }

    public PushHealthinfologRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PushHealthinfologRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public PushHealthinfologRequest setErrorType(String errorType) {
        this.errorType = errorType;
        return this;
    }
    public String getErrorType() {
        return this.errorType;
    }

    public PushHealthinfologRequest setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public PushHealthinfologRequest setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public PushHealthinfologRequest setTemperature(String temperature) {
        this.temperature = temperature;
        return this;
    }
    public String getTemperature() {
        return this.temperature;
    }

    public PushHealthinfologRequest setHealthInfo(HealthInfo healthInfo) {
        this.healthInfo = healthInfo;
        return this;
    }
    public HealthInfo getHealthInfo() {
        return this.healthInfo;
    }

    public PushHealthinfologRequest setNucleicAcidInfo(NucleicAcidInfo nucleicAcidInfo) {
        this.nucleicAcidInfo = nucleicAcidInfo;
        return this;
    }
    public NucleicAcidInfo getNucleicAcidInfo() {
        return this.nucleicAcidInfo;
    }

    public PushHealthinfologRequest setTravelInfo(TravelInfo travelInfo) {
        this.travelInfo = travelInfo;
        return this;
    }
    public TravelInfo getTravelInfo() {
        return this.travelInfo;
    }

    public PushHealthinfologRequest setVaccinationInfo(VaccinationInfo vaccinationInfo) {
        this.vaccinationInfo = vaccinationInfo;
        return this;
    }
    public VaccinationInfo getVaccinationInfo() {
        return this.vaccinationInfo;
    }

    public PushHealthinfologRequest setAntigenInfo(AntigenInfo antigenInfo) {
        this.antigenInfo = antigenInfo;
        return this;
    }
    public AntigenInfo getAntigenInfo() {
        return this.antigenInfo;
    }

    public PushHealthinfologRequest setSceneInfo(SceneInfo sceneInfo) {
        this.sceneInfo = sceneInfo;
        return this;
    }
    public SceneInfo getSceneInfo() {
        return this.sceneInfo;
    }

    public PushHealthinfologRequest setPassMode(String passMode) {
        this.passMode = passMode;
        return this;
    }
    public String getPassMode() {
        return this.passMode;
    }

    public PushHealthinfologRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public PushHealthinfologRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public PushHealthinfologRequest setChannelPassState(String channelPassState) {
        this.channelPassState = channelPassState;
        return this;
    }
    public String getChannelPassState() {
        return this.channelPassState;
    }

}
