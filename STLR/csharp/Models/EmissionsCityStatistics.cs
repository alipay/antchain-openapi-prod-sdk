// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 碳排放分城市统计总量
    public class EmissionsCityStatistics : TeaModel {
        // 城市编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>637401</para>
        /// </summary>
        [NameInMap("city_no")]
        [Validation(Required=true)]
        public string CityNo { get; set; }

        // 城市名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>南充市</para>
        /// </summary>
        [NameInMap("city_name")]
        [Validation(Required=true)]
        public string CityName { get; set; }

        // 累计排放量
        /// <summary>
        /// <b>Example:</b>
        /// <para>222.22</para>
        /// </summary>
        [NameInMap("emission_amount")]
        [Validation(Required=true)]
        public string EmissionAmount { get; set; }

        // 今日新增碳排放量
        /// <summary>
        /// <b>Example:</b>
        /// <para>22.22</para>
        /// </summary>
        [NameInMap("emission_amount_today")]
        [Validation(Required=true)]
        public string EmissionAmountToday { get; set; }

        // 总减碳量
        /// <summary>
        /// <b>Example:</b>
        /// <para>21.11</para>
        /// </summary>
        [NameInMap("reduction_amount")]
        [Validation(Required=true)]
        public string ReductionAmount { get; set; }

        // 今日减碳量
        /// <summary>
        /// <b>Example:</b>
        /// <para>9.11</para>
        /// </summary>
        [NameInMap("reduction_amount_today")]
        [Validation(Required=true)]
        public string ReductionAmountToday { get; set; }

        // 总抵消量
        /// <summary>
        /// <b>Example:</b>
        /// <para>9.11</para>
        /// </summary>
        [NameInMap("counteraction_amount")]
        [Validation(Required=true)]
        public string CounteractionAmount { get; set; }

        // 今日抵消量
        /// <summary>
        /// <b>Example:</b>
        /// <para>2.11</para>
        /// </summary>
        [NameInMap("counteraction_amount_today")]
        [Validation(Required=true)]
        public string CounteractionAmountToday { get; set; }

        // 排放量单位，默认为：
        /// <summary>
        /// <b>Example:</b>
        /// <para>tCO2e</para>
        /// </summary>
        [NameInMap("data_unit")]
        [Validation(Required=true)]
        public string DataUnit { get; set; }

    }

}
