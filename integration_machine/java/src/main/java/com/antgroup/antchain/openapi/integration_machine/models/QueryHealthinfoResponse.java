// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class QueryHealthinfoResponse extends TeaModel {
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
    @NameInMap("scene_info")
    public SceneInfo sceneInfo;

    // 通行记录ID
    @NameInMap("pass_id")
    public String passId;

    public static QueryHealthinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHealthinfoResponse self = new QueryHealthinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryHealthinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryHealthinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHealthinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryHealthinfoResponse setHealthInfo(HealthInfo healthInfo) {
        this.healthInfo = healthInfo;
        return this;
    }
    public HealthInfo getHealthInfo() {
        return this.healthInfo;
    }

    public QueryHealthinfoResponse setNucleicAcidInfo(NucleicAcidInfo nucleicAcidInfo) {
        this.nucleicAcidInfo = nucleicAcidInfo;
        return this;
    }
    public NucleicAcidInfo getNucleicAcidInfo() {
        return this.nucleicAcidInfo;
    }

    public QueryHealthinfoResponse setTravelInfo(TravelInfo travelInfo) {
        this.travelInfo = travelInfo;
        return this;
    }
    public TravelInfo getTravelInfo() {
        return this.travelInfo;
    }

    public QueryHealthinfoResponse setVaccinationInfo(VaccinationInfo vaccinationInfo) {
        this.vaccinationInfo = vaccinationInfo;
        return this;
    }
    public VaccinationInfo getVaccinationInfo() {
        return this.vaccinationInfo;
    }

    public QueryHealthinfoResponse setAntigenInfo(AntigenInfo antigenInfo) {
        this.antigenInfo = antigenInfo;
        return this;
    }
    public AntigenInfo getAntigenInfo() {
        return this.antigenInfo;
    }

    public QueryHealthinfoResponse setSceneInfo(SceneInfo sceneInfo) {
        this.sceneInfo = sceneInfo;
        return this;
    }
    public SceneInfo getSceneInfo() {
        return this.sceneInfo;
    }

    public QueryHealthinfoResponse setPassId(String passId) {
        this.passId = passId;
        return this;
    }
    public String getPassId() {
        return this.passId;
    }

}
