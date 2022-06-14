// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class GetHealthinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 健康信息
    // 
    @NameInMap("health_info")
    public HealthInfo healthInfo;

    // 核酸信息
    // 
    @NameInMap("nucleic_acid_info")
    public NucleicAcidInfo nucleicAcidInfo;

    // 行程信息
    // 
    @NameInMap("travel_info")
    public TravelInfo travelInfo;

    // 疫苗接种信息
    // 
    @NameInMap("vaccination_info")
    public VaccinationInfo vaccinationInfo;

    // 抗原信息
    // 
    @NameInMap("antigen_info")
    public AntigenInfo antigenInfo;

    // 场所信息
    // 
    @NameInMap("scene_info")
    public SceneInfo sceneInfo;

    // 被查询人姓名
    @NameInMap("name")
    public String name;

    // 被查询人身份证号
    // 
    @NameInMap("cert_no")
    public String certNo;

    // 通行记录ID
    @NameInMap("pass_id")
    public String passId;

    public static GetHealthinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHealthinfoResponse self = new GetHealthinfoResponse();
        return TeaModel.build(map, self);
    }

    public GetHealthinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetHealthinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetHealthinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetHealthinfoResponse setHealthInfo(HealthInfo healthInfo) {
        this.healthInfo = healthInfo;
        return this;
    }
    public HealthInfo getHealthInfo() {
        return this.healthInfo;
    }

    public GetHealthinfoResponse setNucleicAcidInfo(NucleicAcidInfo nucleicAcidInfo) {
        this.nucleicAcidInfo = nucleicAcidInfo;
        return this;
    }
    public NucleicAcidInfo getNucleicAcidInfo() {
        return this.nucleicAcidInfo;
    }

    public GetHealthinfoResponse setTravelInfo(TravelInfo travelInfo) {
        this.travelInfo = travelInfo;
        return this;
    }
    public TravelInfo getTravelInfo() {
        return this.travelInfo;
    }

    public GetHealthinfoResponse setVaccinationInfo(VaccinationInfo vaccinationInfo) {
        this.vaccinationInfo = vaccinationInfo;
        return this;
    }
    public VaccinationInfo getVaccinationInfo() {
        return this.vaccinationInfo;
    }

    public GetHealthinfoResponse setAntigenInfo(AntigenInfo antigenInfo) {
        this.antigenInfo = antigenInfo;
        return this;
    }
    public AntigenInfo getAntigenInfo() {
        return this.antigenInfo;
    }

    public GetHealthinfoResponse setSceneInfo(SceneInfo sceneInfo) {
        this.sceneInfo = sceneInfo;
        return this;
    }
    public SceneInfo getSceneInfo() {
        return this.sceneInfo;
    }

    public GetHealthinfoResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetHealthinfoResponse setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public GetHealthinfoResponse setPassId(String passId) {
        this.passId = passId;
        return this;
    }
    public String getPassId() {
        return this.passId;
    }

}
