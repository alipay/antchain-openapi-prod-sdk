// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTEGRATION_MACHINE.Models
{
    // 设备实时通行统计
    public class DeviceStatistics : TeaModel {
        // 设备SN号
        [NameInMap("serial_no")]
        [Validation(Required=true)]
        public string SerialNo { get; set; }

        // 设备状态(初始化:init,在线:online,离线:offline,故障:fault)
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 通行人次
        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

        // 绿码人次
        [NameInMap("green")]
        [Validation(Required=true)]
        public long? Green { get; set; }

        // 黄码人次
        [NameInMap("yellow")]
        [Validation(Required=true)]
        public long? Yellow { get; set; }

        // 红码人次
        [NameInMap("red")]
        [Validation(Required=true)]
        public long? Red { get; set; }

        // 码值异常人次
        [NameInMap("code_err")]
        [Validation(Required=true)]
        public long? CodeErr { get; set; }

        // 刷脸人次
        [NameInMap("face")]
        [Validation(Required=true)]
        public long? Face { get; set; }

        // 刷健康码人次
        [NameInMap("health_code")]
        [Validation(Required=true)]
        public long? HealthCode { get; set; }

        // 刷身份证人次
        [NameInMap("cert")]
        [Validation(Required=true)]
        public long? Cert { get; set; }

        // 其他方式人次
        [NameInMap("other_mode")]
        [Validation(Required=true)]
        public long? OtherMode { get; set; }

        // 通行成功人次
        [NameInMap("pass")]
        [Validation(Required=true)]
        public long? Pass { get; set; }

        // 通行失败人次
        [NameInMap("stop")]
        [Validation(Required=true)]
        public long? Stop { get; set; }

        // 平均通行时间(ms)
        [NameInMap("avg_time")]
        [Validation(Required=true)]
        public long? AvgTime { get; set; }

        // 疫苗未接种人次
        [NameInMap("vaccine_no")]
        [Validation(Required=true)]
        public long? VaccineNo { get; set; }

        // 疫苗接种一针人次
        [NameInMap("vaccine_first")]
        [Validation(Required=true)]
        public long? VaccineFirst { get; set; }

        // 疫苗接种两针人次
        [NameInMap("vaccine_second")]
        [Validation(Required=true)]
        public long? VaccineSecond { get; set; }

        // 疫苗接种三针人次
        [NameInMap("vaccine_third")]
        [Validation(Required=true)]
        public long? VaccineThird { get; set; }

        // 疫苗未查询人次
        [NameInMap("vaccine_unknown")]
        [Validation(Required=true)]
        public long? VaccineUnknown { get; set; }

        // 核酸有效期24h人次
        [NameInMap("nucleic_acid24h")]
        [Validation(Required=true)]
        public long? NucleicAcid24h { get; set; }

        // 核酸有效期48h人次
        [NameInMap("nucleic_acid48h")]
        [Validation(Required=true)]
        public long? NucleicAcid48h { get; set; }

        // 核酸有效期72h人次
        [NameInMap("nucleic_acid72h")]
        [Validation(Required=true)]
        public long? NucleicAcid72h { get; set; }

        // 核酸有效期7d人次
        [NameInMap("nucleic_acid7d")]
        [Validation(Required=true)]
        public long? NucleicAcid7d { get; set; }

        // 超过7D或无核酸人次
        [NameInMap("nucleic_acid_other")]
        [Validation(Required=true)]
        public long? NucleicAcidOther { get; set; }

        // 体温小于35.5人次
        [NameInMap("temperature_a")]
        [Validation(Required=true)]
        public long? TemperatureA { get; set; }

        // 体温35.5-36度人次
        [NameInMap("temperature_b")]
        [Validation(Required=true)]
        public long? TemperatureB { get; set; }

        // 体温36.1-36.3度人次
        [NameInMap("temperature_c")]
        [Validation(Required=true)]
        public long? TemperatureC { get; set; }

        // 体温36.4-36.7度人次
        [NameInMap("temperature_d")]
        [Validation(Required=true)]
        public long? TemperatureD { get; set; }

        // 体温36.8-37度人次
        [NameInMap("temperature_e")]
        [Validation(Required=true)]
        public long? TemperatureE { get; set; }

        // 体温37.1-37.5度人次
        [NameInMap("temperature_f")]
        [Validation(Required=true)]
        public long? TemperatureF { get; set; }

        // 体温37.6-38度人次
        [NameInMap("temperature_g")]
        [Validation(Required=true)]
        public long? TemperatureG { get; set; }

        // 体温38.1-38.5度人次
        [NameInMap("temperature_h")]
        [Validation(Required=true)]
        public long? TemperatureH { get; set; }

        // 体温38.6-39度人次
        [NameInMap("temperature_i")]
        [Validation(Required=true)]
        public long? TemperatureI { get; set; }

        // 体温大于39人次
        [NameInMap("temperature_j")]
        [Validation(Required=true)]
        public long? TemperatureJ { get; set; }

        // 体温未获取人次
        [NameInMap("temperature_k")]
        [Validation(Required=true)]
        public long? TemperatureK { get; set; }

        // 户籍所在省分布
        [NameInMap("identity_distributed_list")]
        [Validation(Required=true)]
        public List<IdentityDistributed> IdentityDistributedList { get; set; }

        // 扩展统计字段
        [NameInMap("extend_arg_list")]
        [Validation(Required=true)]
        public List<StatisticsExtendArg> ExtendArgList { get; set; }

    }

}
