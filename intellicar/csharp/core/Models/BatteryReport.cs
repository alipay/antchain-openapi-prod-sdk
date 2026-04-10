// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 充电报告查询
    public class BatteryReport : TeaModel {
        // 充电单号，最大长度/规则：32
        [NameInMap("start_charge_seq")]
        [Validation(Required=true)]
        public string StartChargeSeq { get; set; }

        // VIN，最大长度/规则：17位
        [NameInMap("vin_code")]
        [Validation(Required=true)]
        public string VinCode { get; set; }

        // 公告号，最大长度/规则36
        [NameInMap("publication_no")]
        [Validation(Required=false)]
        public string PublicationNo { get; set; }

        // 本次累积充电量，单位kWh；最大长度/规则：整数位<=10,小数位<=2
        [NameInMap("total_power")]
        [Validation(Required=false)]
        public string TotalPower { get; set; }

        // 本次累积充入SOC（%）；最大长度/规则：0-100,小数位<=2
        [NameInMap("total_charge_soc")]
        [Validation(Required=false)]
        public string TotalChargeSoc { get; set; }

        // 本次充电开始SOC(%)；最大长度/规则：0-100,小数位<=2
        [NameInMap("start_soc")]
        [Validation(Required=false)]
        public string StartSoc { get; set; }

        // 本次充电截止SOC(%)；最大长度/规则：0-100,小数位<=2
        [NameInMap("end_soc")]
        [Validation(Required=false)]
        public string EndSoc { get; set; }

        // 标称能量，单位kWh；最大长度/规则：0-1000,小数位<=2
        [NameInMap("nominal_energy")]
        [Validation(Required=false)]
        public string NominalEnergy { get; set; }

        // 充电城市ID；最大长度/规则：30
        [NameInMap("city_id")]
        [Validation(Required=false)]
        public string CityId { get; set; }

        // 注册日期；最大长度/规则：yyyy-MM-dd
        [NameInMap("register_date")]
        [Validation(Required=false)]
        public string RegisterDate { get; set; }

    }

}
