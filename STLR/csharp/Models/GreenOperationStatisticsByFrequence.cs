// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 按频率统计的绿色行为明细
    public class GreenOperationStatisticsByFrequence : TeaModel {
        // 绿色行为发生时期
        /// <summary>
        /// <b>Example:</b>
        /// <para>2021-09</para>
        /// </summary>
        [NameInMap("occurrence_period")]
        [Validation(Required=true)]
        public string OccurrencePeriod { get; set; }

        // 绿色行为产生的绿色能量值
        /// <summary>
        /// <b>Example:</b>
        /// <para>11212</para>
        /// </summary>
        [NameInMap("green_energy_amount")]
        [Validation(Required=true)]
        public long? GreenEnergyAmount { get; set; }

        // 时期内发生绿色行为的记录条数
        /// <summary>
        /// <b>Example:</b>
        /// <para>111</para>
        /// </summary>
        [NameInMap("green_operation_records")]
        [Validation(Required=true)]
        public long? GreenOperationRecords { get; set; }

    }

}
