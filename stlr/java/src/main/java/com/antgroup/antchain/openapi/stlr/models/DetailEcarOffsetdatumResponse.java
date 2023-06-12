// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class DetailEcarOffsetdatumResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 碳补偿项目编码
    @NameInMap("project_no")
    public String projectNo;

    // 碳普惠项目名称
    @NameInMap("project_name")
    public String projectName;

    // 会员账户DID
    @NameInMap("account_did")
    public String accountDid;

    // 采集数据单号
    // 
    @NameInMap("acquisition_item_no")
    public String acquisitionItemNo;

    // 发生时间
    @NameInMap("occurrent_time")
    public String occurrentTime;

    // 发生场景编码
    @NameInMap("scenario_code")
    public String scenarioCode;

    // 发生场景名称
    @NameInMap("scenario_name")
    public String scenarioName;

    // 碳普惠平台编码，如果非平台采集数据，则显示为自采编码：Self
    @NameInMap("platform_no")
    public String platformNo;

    // 减碳量
    @NameInMap("offset_volume")
    public String offsetVolume;

    // 碳能量值
    @NameInMap("carbon_energy")
    public Long carbonEnergy;

    // 活动数据详情列表
    @NameInMap("active_data_list")
    public java.util.List<CarbonOffsetActiveDataDetail> activeDataList;

    public static DetailEcarOffsetdatumResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailEcarOffsetdatumResponse self = new DetailEcarOffsetdatumResponse();
        return TeaModel.build(map, self);
    }

    public DetailEcarOffsetdatumResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailEcarOffsetdatumResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailEcarOffsetdatumResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailEcarOffsetdatumResponse setProjectNo(String projectNo) {
        this.projectNo = projectNo;
        return this;
    }
    public String getProjectNo() {
        return this.projectNo;
    }

    public DetailEcarOffsetdatumResponse setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DetailEcarOffsetdatumResponse setAccountDid(String accountDid) {
        this.accountDid = accountDid;
        return this;
    }
    public String getAccountDid() {
        return this.accountDid;
    }

    public DetailEcarOffsetdatumResponse setAcquisitionItemNo(String acquisitionItemNo) {
        this.acquisitionItemNo = acquisitionItemNo;
        return this;
    }
    public String getAcquisitionItemNo() {
        return this.acquisitionItemNo;
    }

    public DetailEcarOffsetdatumResponse setOccurrentTime(String occurrentTime) {
        this.occurrentTime = occurrentTime;
        return this;
    }
    public String getOccurrentTime() {
        return this.occurrentTime;
    }

    public DetailEcarOffsetdatumResponse setScenarioCode(String scenarioCode) {
        this.scenarioCode = scenarioCode;
        return this;
    }
    public String getScenarioCode() {
        return this.scenarioCode;
    }

    public DetailEcarOffsetdatumResponse setScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
        return this;
    }
    public String getScenarioName() {
        return this.scenarioName;
    }

    public DetailEcarOffsetdatumResponse setPlatformNo(String platformNo) {
        this.platformNo = platformNo;
        return this;
    }
    public String getPlatformNo() {
        return this.platformNo;
    }

    public DetailEcarOffsetdatumResponse setOffsetVolume(String offsetVolume) {
        this.offsetVolume = offsetVolume;
        return this;
    }
    public String getOffsetVolume() {
        return this.offsetVolume;
    }

    public DetailEcarOffsetdatumResponse setCarbonEnergy(Long carbonEnergy) {
        this.carbonEnergy = carbonEnergy;
        return this;
    }
    public Long getCarbonEnergy() {
        return this.carbonEnergy;
    }

    public DetailEcarOffsetdatumResponse setActiveDataList(java.util.List<CarbonOffsetActiveDataDetail> activeDataList) {
        this.activeDataList = activeDataList;
        return this;
    }
    public java.util.List<CarbonOffsetActiveDataDetail> getActiveDataList() {
        return this.activeDataList;
    }

}
