// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class BatteryReport extends TeaModel {
    // 充电单号，最大长度/规则：32
    /**
     * <strong>example:</strong>
     * <p>202603031234567890</p>
     */
    @NameInMap("start_charge_seq")
    @Validation(required = true)
    public String startChargeSeq;

    // VIN，最大长度/规则：17位
    /**
     * <strong>example:</strong>
     * <p>LFV3A2***3123456</p>
     */
    @NameInMap("vin_code")
    @Validation(required = true)
    public String vinCode;

    // 公告号，最大长度/规则36
    /**
     * <strong>example:</strong>
     * <p>BJ7000USD3-BEV</p>
     */
    @NameInMap("publication_no")
    public String publicationNo;

    // 本次累积充电量，单位kWh；最大长度/规则：整数位<=10,小数位<=2
    /**
     * <strong>example:</strong>
     * <p>25.30</p>
     */
    @NameInMap("total_power")
    public String totalPower;

    // 本次累积充入SOC（%）；最大长度/规则：0-100,小数位<=2
    /**
     * <strong>example:</strong>
     * <p>50.00</p>
     */
    @NameInMap("total_charge_soc")
    public String totalChargeSoc;

    // 本次充电开始SOC(%)；最大长度/规则：0-100,小数位<=2
    /**
     * <strong>example:</strong>
     * <p>25.00</p>
     */
    @NameInMap("start_soc")
    public String startSoc;

    // 本次充电截止SOC(%)；最大长度/规则：0-100,小数位<=2
    /**
     * <strong>example:</strong>
     * <p>75.00</p>
     */
    @NameInMap("end_soc")
    public String endSoc;

    // 标称能量，单位kWh；最大长度/规则：0-1000,小数位<=2
    /**
     * <strong>example:</strong>
     * <p>60.00</p>
     */
    @NameInMap("nominal_energy")
    public String nominalEnergy;

    // 充电城市ID；最大长度/规则：30
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("city_id")
    public String cityId;

    // 注册日期；最大长度/规则：yyyy-MM-dd
    /**
     * <strong>example:</strong>
     * <p>2018-10-10</p>
     */
    @NameInMap("register_date")
    public String registerDate;

    public static BatteryReport build(java.util.Map<String, ?> map) throws Exception {
        BatteryReport self = new BatteryReport();
        return TeaModel.build(map, self);
    }

    public BatteryReport setStartChargeSeq(String startChargeSeq) {
        this.startChargeSeq = startChargeSeq;
        return this;
    }
    public String getStartChargeSeq() {
        return this.startChargeSeq;
    }

    public BatteryReport setVinCode(String vinCode) {
        this.vinCode = vinCode;
        return this;
    }
    public String getVinCode() {
        return this.vinCode;
    }

    public BatteryReport setPublicationNo(String publicationNo) {
        this.publicationNo = publicationNo;
        return this;
    }
    public String getPublicationNo() {
        return this.publicationNo;
    }

    public BatteryReport setTotalPower(String totalPower) {
        this.totalPower = totalPower;
        return this;
    }
    public String getTotalPower() {
        return this.totalPower;
    }

    public BatteryReport setTotalChargeSoc(String totalChargeSoc) {
        this.totalChargeSoc = totalChargeSoc;
        return this;
    }
    public String getTotalChargeSoc() {
        return this.totalChargeSoc;
    }

    public BatteryReport setStartSoc(String startSoc) {
        this.startSoc = startSoc;
        return this;
    }
    public String getStartSoc() {
        return this.startSoc;
    }

    public BatteryReport setEndSoc(String endSoc) {
        this.endSoc = endSoc;
        return this;
    }
    public String getEndSoc() {
        return this.endSoc;
    }

    public BatteryReport setNominalEnergy(String nominalEnergy) {
        this.nominalEnergy = nominalEnergy;
        return this;
    }
    public String getNominalEnergy() {
        return this.nominalEnergy;
    }

    public BatteryReport setCityId(String cityId) {
        this.cityId = cityId;
        return this;
    }
    public String getCityId() {
        return this.cityId;
    }

    public BatteryReport setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
        return this;
    }
    public String getRegisterDate() {
        return this.registerDate;
    }

}
