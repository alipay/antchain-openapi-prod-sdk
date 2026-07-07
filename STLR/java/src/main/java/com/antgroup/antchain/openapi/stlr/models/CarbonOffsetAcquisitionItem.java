// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class CarbonOffsetAcquisitionItem extends TeaModel {
    // 采集数据单号
    /**
     * <strong>example:</strong>
     * <p>123456789abcdefghi</p>
     */
    @NameInMap("acquisition_item_no")
    @Validation(required = true)
    public String acquisitionItemNo;

    // 碳补偿项目编号
    /**
     * <strong>example:</strong>
     * <p>13222</p>
     */
    @NameInMap("project_no")
    @Validation(required = true)
    public String projectNo;

    // 参与账户DID
    /**
     * <strong>example:</strong>
     * <p>123456789abcdefghi</p>
     */
    @NameInMap("account_did")
    @Validation(required = true)
    public String accountDid;

    // 发生时间
    /**
     * <strong>example:</strong>
     * <p>2023-05-23 12:11:32:33</p>
     */
    @NameInMap("occurrent_time")
    @Validation(required = true)
    public String occurrentTime;

    // 发生场景编码
    /**
     * <strong>example:</strong>
     * <p>xingzou</p>
     */
    @NameInMap("scenario_code")
    @Validation(required = true)
    public String scenarioCode;

    // 发生场景名称
    /**
     * <strong>example:</strong>
     * <p>出行</p>
     */
    @NameInMap("scenario_name")
    @Validation(required = true)
    public String scenarioName;

    // 碳普惠平台编码，如果非平台采集数据，则显示为自采编码：Self
    /**
     * <strong>example:</strong>
     * <p>Antforest</p>
     */
    @NameInMap("platform_no")
    @Validation(required = true)
    public String platformNo;

    // 活动数据原始值，多个活动数据列表
    @NameInMap("active_datum")
    public java.util.List<AnyAmountItem> activeDatum;

    // 减碳量
    /**
     * <strong>example:</strong>
     * <p>122.22</p>
     */
    @NameInMap("offset_volume")
    public String offsetVolume;

    // 碳能量值
    /**
     * <strong>example:</strong>
     * <p>229</p>
     */
    @NameInMap("carbon_energy")
    public Long carbonEnergy;

    public static CarbonOffsetAcquisitionItem build(java.util.Map<String, ?> map) throws Exception {
        CarbonOffsetAcquisitionItem self = new CarbonOffsetAcquisitionItem();
        return TeaModel.build(map, self);
    }

    public CarbonOffsetAcquisitionItem setAcquisitionItemNo(String acquisitionItemNo) {
        this.acquisitionItemNo = acquisitionItemNo;
        return this;
    }
    public String getAcquisitionItemNo() {
        return this.acquisitionItemNo;
    }

    public CarbonOffsetAcquisitionItem setProjectNo(String projectNo) {
        this.projectNo = projectNo;
        return this;
    }
    public String getProjectNo() {
        return this.projectNo;
    }

    public CarbonOffsetAcquisitionItem setAccountDid(String accountDid) {
        this.accountDid = accountDid;
        return this;
    }
    public String getAccountDid() {
        return this.accountDid;
    }

    public CarbonOffsetAcquisitionItem setOccurrentTime(String occurrentTime) {
        this.occurrentTime = occurrentTime;
        return this;
    }
    public String getOccurrentTime() {
        return this.occurrentTime;
    }

    public CarbonOffsetAcquisitionItem setScenarioCode(String scenarioCode) {
        this.scenarioCode = scenarioCode;
        return this;
    }
    public String getScenarioCode() {
        return this.scenarioCode;
    }

    public CarbonOffsetAcquisitionItem setScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
        return this;
    }
    public String getScenarioName() {
        return this.scenarioName;
    }

    public CarbonOffsetAcquisitionItem setPlatformNo(String platformNo) {
        this.platformNo = platformNo;
        return this;
    }
    public String getPlatformNo() {
        return this.platformNo;
    }

    public CarbonOffsetAcquisitionItem setActiveDatum(java.util.List<AnyAmountItem> activeDatum) {
        this.activeDatum = activeDatum;
        return this;
    }
    public java.util.List<AnyAmountItem> getActiveDatum() {
        return this.activeDatum;
    }

    public CarbonOffsetAcquisitionItem setOffsetVolume(String offsetVolume) {
        this.offsetVolume = offsetVolume;
        return this;
    }
    public String getOffsetVolume() {
        return this.offsetVolume;
    }

    public CarbonOffsetAcquisitionItem setCarbonEnergy(Long carbonEnergy) {
        this.carbonEnergy = carbonEnergy;
        return this;
    }
    public Long getCarbonEnergy() {
        return this.carbonEnergy;
    }

}
