// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class DeviceStatistics extends TeaModel {
    // 设备SN号
    @NameInMap("serial_no")
    @Validation(required = true)
    public String serialNo;

    // 设备状态(初始化:init,在线:online,离线:offline,故障:fault)
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 通行人次
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    // 绿码人次
    @NameInMap("green")
    @Validation(required = true)
    public Long green;

    // 黄码人次
    @NameInMap("yellow")
    @Validation(required = true)
    public Long yellow;

    // 红码人次
    @NameInMap("red")
    @Validation(required = true)
    public Long red;

    // 码值异常人次
    @NameInMap("code_err")
    @Validation(required = true)
    public Long codeErr;

    // 刷脸人次
    @NameInMap("face")
    @Validation(required = true)
    public Long face;

    // 刷健康码人次
    @NameInMap("health_code")
    @Validation(required = true)
    public Long healthCode;

    // 刷身份证人次
    @NameInMap("cert")
    @Validation(required = true)
    public Long cert;

    // 其他方式人次
    @NameInMap("other_mode")
    @Validation(required = true)
    public Long otherMode;

    // 通行成功人次
    @NameInMap("pass")
    @Validation(required = true)
    public Long pass;

    // 通行失败人次
    @NameInMap("stop")
    @Validation(required = true)
    public Long stop;

    // 平均通行时间(ms)
    @NameInMap("avg_time")
    @Validation(required = true)
    public Long avgTime;

    // 疫苗未接种人次
    @NameInMap("vaccine_no")
    @Validation(required = true)
    public Long vaccineNo;

    // 疫苗接种一针人次
    @NameInMap("vaccine_first")
    @Validation(required = true)
    public Long vaccineFirst;

    // 疫苗接种两针人次
    @NameInMap("vaccine_second")
    @Validation(required = true)
    public Long vaccineSecond;

    // 疫苗接种三针人次
    @NameInMap("vaccine_third")
    @Validation(required = true)
    public Long vaccineThird;

    // 疫苗未查询人次
    @NameInMap("vaccine_unknown")
    @Validation(required = true)
    public Long vaccineUnknown;

    // 核酸有效期24h人次
    @NameInMap("nucleic_acid24h")
    @Validation(required = true)
    public Long nucleicAcid24h;

    // 核酸有效期48h人次
    @NameInMap("nucleic_acid48h")
    @Validation(required = true)
    public Long nucleicAcid48h;

    // 核酸有效期72h人次
    @NameInMap("nucleic_acid72h")
    @Validation(required = true)
    public Long nucleicAcid72h;

    // 核酸有效期7d人次
    @NameInMap("nucleic_acid7d")
    @Validation(required = true)
    public Long nucleicAcid7d;

    // 超过7D或无核酸人次
    @NameInMap("nucleic_acid_other")
    @Validation(required = true)
    public Long nucleicAcidOther;

    // 体温小于35.5人次
    @NameInMap("temperature_a")
    @Validation(required = true)
    public Long temperatureA;

    // 体温35.5-36度人次
    @NameInMap("temperature_b")
    @Validation(required = true)
    public Long temperatureB;

    // 体温36.1-36.3度人次
    @NameInMap("temperature_c")
    @Validation(required = true)
    public Long temperatureC;

    // 体温36.4-36.7度人次
    @NameInMap("temperature_d")
    @Validation(required = true)
    public Long temperatureD;

    // 体温36.8-37度人次
    @NameInMap("temperature_e")
    @Validation(required = true)
    public Long temperatureE;

    // 体温37.1-37.5度人次
    @NameInMap("temperature_f")
    @Validation(required = true)
    public Long temperatureF;

    // 体温37.6-38度人次
    @NameInMap("temperature_g")
    @Validation(required = true)
    public Long temperatureG;

    // 体温38.1-38.5度人次
    @NameInMap("temperature_h")
    @Validation(required = true)
    public Long temperatureH;

    // 体温38.6-39度人次
    @NameInMap("temperature_i")
    @Validation(required = true)
    public Long temperatureI;

    // 体温大于39人次
    @NameInMap("temperature_j")
    @Validation(required = true)
    public Long temperatureJ;

    // 体温未获取人次
    @NameInMap("temperature_k")
    @Validation(required = true)
    public Long temperatureK;

    // 户籍所在省分布
    @NameInMap("identity_distributed_list")
    @Validation(required = true)
    public java.util.List<IdentityDistributed> identityDistributedList;

    // 扩展统计字段
    @NameInMap("extend_arg_list")
    @Validation(required = true)
    public java.util.List<StatisticsExtendArg> extendArgList;

    public static DeviceStatistics build(java.util.Map<String, ?> map) throws Exception {
        DeviceStatistics self = new DeviceStatistics();
        return TeaModel.build(map, self);
    }

    public DeviceStatistics setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

    public DeviceStatistics setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DeviceStatistics setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DeviceStatistics setGreen(Long green) {
        this.green = green;
        return this;
    }
    public Long getGreen() {
        return this.green;
    }

    public DeviceStatistics setYellow(Long yellow) {
        this.yellow = yellow;
        return this;
    }
    public Long getYellow() {
        return this.yellow;
    }

    public DeviceStatistics setRed(Long red) {
        this.red = red;
        return this;
    }
    public Long getRed() {
        return this.red;
    }

    public DeviceStatistics setCodeErr(Long codeErr) {
        this.codeErr = codeErr;
        return this;
    }
    public Long getCodeErr() {
        return this.codeErr;
    }

    public DeviceStatistics setFace(Long face) {
        this.face = face;
        return this;
    }
    public Long getFace() {
        return this.face;
    }

    public DeviceStatistics setHealthCode(Long healthCode) {
        this.healthCode = healthCode;
        return this;
    }
    public Long getHealthCode() {
        return this.healthCode;
    }

    public DeviceStatistics setCert(Long cert) {
        this.cert = cert;
        return this;
    }
    public Long getCert() {
        return this.cert;
    }

    public DeviceStatistics setOtherMode(Long otherMode) {
        this.otherMode = otherMode;
        return this;
    }
    public Long getOtherMode() {
        return this.otherMode;
    }

    public DeviceStatistics setPass(Long pass) {
        this.pass = pass;
        return this;
    }
    public Long getPass() {
        return this.pass;
    }

    public DeviceStatistics setStop(Long stop) {
        this.stop = stop;
        return this;
    }
    public Long getStop() {
        return this.stop;
    }

    public DeviceStatistics setAvgTime(Long avgTime) {
        this.avgTime = avgTime;
        return this;
    }
    public Long getAvgTime() {
        return this.avgTime;
    }

    public DeviceStatistics setVaccineNo(Long vaccineNo) {
        this.vaccineNo = vaccineNo;
        return this;
    }
    public Long getVaccineNo() {
        return this.vaccineNo;
    }

    public DeviceStatistics setVaccineFirst(Long vaccineFirst) {
        this.vaccineFirst = vaccineFirst;
        return this;
    }
    public Long getVaccineFirst() {
        return this.vaccineFirst;
    }

    public DeviceStatistics setVaccineSecond(Long vaccineSecond) {
        this.vaccineSecond = vaccineSecond;
        return this;
    }
    public Long getVaccineSecond() {
        return this.vaccineSecond;
    }

    public DeviceStatistics setVaccineThird(Long vaccineThird) {
        this.vaccineThird = vaccineThird;
        return this;
    }
    public Long getVaccineThird() {
        return this.vaccineThird;
    }

    public DeviceStatistics setVaccineUnknown(Long vaccineUnknown) {
        this.vaccineUnknown = vaccineUnknown;
        return this;
    }
    public Long getVaccineUnknown() {
        return this.vaccineUnknown;
    }

    public DeviceStatistics setNucleicAcid24h(Long nucleicAcid24h) {
        this.nucleicAcid24h = nucleicAcid24h;
        return this;
    }
    public Long getNucleicAcid24h() {
        return this.nucleicAcid24h;
    }

    public DeviceStatistics setNucleicAcid48h(Long nucleicAcid48h) {
        this.nucleicAcid48h = nucleicAcid48h;
        return this;
    }
    public Long getNucleicAcid48h() {
        return this.nucleicAcid48h;
    }

    public DeviceStatistics setNucleicAcid72h(Long nucleicAcid72h) {
        this.nucleicAcid72h = nucleicAcid72h;
        return this;
    }
    public Long getNucleicAcid72h() {
        return this.nucleicAcid72h;
    }

    public DeviceStatistics setNucleicAcid7d(Long nucleicAcid7d) {
        this.nucleicAcid7d = nucleicAcid7d;
        return this;
    }
    public Long getNucleicAcid7d() {
        return this.nucleicAcid7d;
    }

    public DeviceStatistics setNucleicAcidOther(Long nucleicAcidOther) {
        this.nucleicAcidOther = nucleicAcidOther;
        return this;
    }
    public Long getNucleicAcidOther() {
        return this.nucleicAcidOther;
    }

    public DeviceStatistics setTemperatureA(Long temperatureA) {
        this.temperatureA = temperatureA;
        return this;
    }
    public Long getTemperatureA() {
        return this.temperatureA;
    }

    public DeviceStatistics setTemperatureB(Long temperatureB) {
        this.temperatureB = temperatureB;
        return this;
    }
    public Long getTemperatureB() {
        return this.temperatureB;
    }

    public DeviceStatistics setTemperatureC(Long temperatureC) {
        this.temperatureC = temperatureC;
        return this;
    }
    public Long getTemperatureC() {
        return this.temperatureC;
    }

    public DeviceStatistics setTemperatureD(Long temperatureD) {
        this.temperatureD = temperatureD;
        return this;
    }
    public Long getTemperatureD() {
        return this.temperatureD;
    }

    public DeviceStatistics setTemperatureE(Long temperatureE) {
        this.temperatureE = temperatureE;
        return this;
    }
    public Long getTemperatureE() {
        return this.temperatureE;
    }

    public DeviceStatistics setTemperatureF(Long temperatureF) {
        this.temperatureF = temperatureF;
        return this;
    }
    public Long getTemperatureF() {
        return this.temperatureF;
    }

    public DeviceStatistics setTemperatureG(Long temperatureG) {
        this.temperatureG = temperatureG;
        return this;
    }
    public Long getTemperatureG() {
        return this.temperatureG;
    }

    public DeviceStatistics setTemperatureH(Long temperatureH) {
        this.temperatureH = temperatureH;
        return this;
    }
    public Long getTemperatureH() {
        return this.temperatureH;
    }

    public DeviceStatistics setTemperatureI(Long temperatureI) {
        this.temperatureI = temperatureI;
        return this;
    }
    public Long getTemperatureI() {
        return this.temperatureI;
    }

    public DeviceStatistics setTemperatureJ(Long temperatureJ) {
        this.temperatureJ = temperatureJ;
        return this;
    }
    public Long getTemperatureJ() {
        return this.temperatureJ;
    }

    public DeviceStatistics setTemperatureK(Long temperatureK) {
        this.temperatureK = temperatureK;
        return this;
    }
    public Long getTemperatureK() {
        return this.temperatureK;
    }

    public DeviceStatistics setIdentityDistributedList(java.util.List<IdentityDistributed> identityDistributedList) {
        this.identityDistributedList = identityDistributedList;
        return this;
    }
    public java.util.List<IdentityDistributed> getIdentityDistributedList() {
        return this.identityDistributedList;
    }

    public DeviceStatistics setExtendArgList(java.util.List<StatisticsExtendArg> extendArgList) {
        this.extendArgList = extendArgList;
        return this;
    }
    public java.util.List<StatisticsExtendArg> getExtendArgList() {
        return this.extendArgList;
    }

}
