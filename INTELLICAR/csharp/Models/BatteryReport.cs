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
        /// <summary>
        /// <b>Example:</b>
        /// <para>202603031234567890</para>
        /// </summary>
        [NameInMap("start_charge_seq")]
        [Validation(Required=true)]
        public string StartChargeSeq { get; set; }

        // VIN，最大长度/规则：17位
        /// <summary>
        /// <b>Example:</b>
        /// <para>LFV3A2***3123456</para>
        /// </summary>
        [NameInMap("vin_code")]
        [Validation(Required=true)]
        public string VinCode { get; set; }

        // 公告号，最大长度/规则36
        /// <summary>
        /// <b>Example:</b>
        /// <para>BJ7000USD3-BEV</para>
        /// </summary>
        [NameInMap("publication_no")]
        [Validation(Required=false)]
        public string PublicationNo { get; set; }

        // 本次累积充电量，单位kWh；最大长度/规则：整数位<=10,小数位<=2
        /// <summary>
        /// <b>Example:</b>
        /// <para>25.30</para>
        /// </summary>
        [NameInMap("total_power")]
        [Validation(Required=false)]
        public string TotalPower { get; set; }

        // 本次累积充入SOC（%）；最大长度/规则：0-100,小数位<=2
        /// <summary>
        /// <b>Example:</b>
        /// <para>50.00</para>
        /// </summary>
        [NameInMap("total_charge_soc")]
        [Validation(Required=false)]
        public string TotalChargeSoc { get; set; }

        // 本次充电开始SOC(%)；最大长度/规则：0-100,小数位<=2
        /// <summary>
        /// <b>Example:</b>
        /// <para>25.00</para>
        /// </summary>
        [NameInMap("start_soc")]
        [Validation(Required=false)]
        public string StartSoc { get; set; }

        // 本次充电截止SOC(%)；最大长度/规则：0-100,小数位<=2
        /// <summary>
        /// <b>Example:</b>
        /// <para>75.00</para>
        /// </summary>
        [NameInMap("end_soc")]
        [Validation(Required=false)]
        public string EndSoc { get; set; }

        // 标称能量，单位kWh；最大长度/规则：0-1000,小数位<=2
        /// <summary>
        /// <b>Example:</b>
        /// <para>60.00</para>
        /// </summary>
        [NameInMap("nominal_energy")]
        [Validation(Required=false)]
        public string NominalEnergy { get; set; }

        // 充电城市ID；最大长度/规则：30
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("city_id")]
        [Validation(Required=false)]
        public string CityId { get; set; }

        // 注册日期；最大长度/规则：yyyy-MM-dd
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10</para>
        /// </summary>
        [NameInMap("register_date")]
        [Validation(Required=false)]
        public string RegisterDate { get; set; }

        // 保障服务标识
        // NONE：无保障
        // SEVEN_DAYS：7天保障
        // THIRTY_DAYS：30天保障
        /// <summary>
        /// <b>Example:</b>
        /// <para>NONE</para>
        /// </summary>
        [NameInMap("service_safeguard_type")]
        [Validation(Required=false)]
        public string ServiceSafeguardType { get; set; }

        // 保障码
        // 首次查询后接口返回，后续查询过程中，若该参数不为空且有效则生成复检报告；若不传保障码，则当做首检
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("guarantee_code")]
        [Validation(Required=false)]
        public string GuaranteeCode { get; set; }

    }

}
