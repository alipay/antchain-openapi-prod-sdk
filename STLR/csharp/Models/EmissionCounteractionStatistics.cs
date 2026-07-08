// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 碳抵消统计量
    public class EmissionCounteractionStatistics : TeaModel {
        // 碳抵消类别
        /// <summary>
        /// <b>Example:</b>
        /// <para>Quota</para>
        /// </summary>
        [NameInMap("assert_type")]
        [Validation(Required=true)]
        public string AssertType { get; set; }

        // 碳抵消类别名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>配额</para>
        /// </summary>
        [NameInMap("assert_type_name")]
        [Validation(Required=true)]
        public string AssertTypeName { get; set; }

        // 抵消量
        /// <summary>
        /// <b>Example:</b>
        /// <para>22.22</para>
        /// </summary>
        [NameInMap("counteraction_amount")]
        [Validation(Required=true)]
        public string CounteractionAmount { get; set; }

        // 排放量单位，默认为：tCO2e
        /// <summary>
        /// <b>Example:</b>
        /// <para>tCO2e</para>
        /// </summary>
        [NameInMap("data_unit")]
        [Validation(Required=true)]
        public string DataUnit { get; set; }

    }

}
