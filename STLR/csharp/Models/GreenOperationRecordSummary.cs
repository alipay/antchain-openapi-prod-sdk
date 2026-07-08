// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 绿色行为数据摘要
    public class GreenOperationRecordSummary : TeaModel {
        // 绿色行为记录编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>20220702111231231212</para>
        /// </summary>
        [NameInMap("green_operation_no")]
        [Validation(Required=true)]
        public string GreenOperationNo { get; set; }

        // 绿色行为类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>ElectronicInvoice</para>
        /// </summary>
        [NameInMap("green_operation_type")]
        [Validation(Required=true)]
        public string GreenOperationType { get; set; }

        // 绿色行为类型名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>电子发票</para>
        /// </summary>
        [NameInMap("green_operation_type_name")]
        [Validation(Required=true)]
        public string GreenOperationTypeName { get; set; }

        // 发生绿色行为的相关业务单号
        /// <summary>
        /// <b>Example:</b>
        /// <para>202211131212</para>
        /// </summary>
        [NameInMap("enterprise_biz_no")]
        [Validation(Required=true)]
        public string EnterpriseBizNo { get; set; }

        // 绿色行为发生时间，格式应如：2021-07-21 12:11:11
        /// <summary>
        /// <b>Example:</b>
        /// <para>2021-08-09 12:22:11</para>
        /// </summary>
        [NameInMap("occurrence_time")]
        [Validation(Required=true)]
        public string OccurrenceTime { get; set; }

        // 绿色行为的绿色能量值
        /// <summary>
        /// <b>Example:</b>
        /// <para>1111</para>
        /// </summary>
        [NameInMap("green_energy_amount")]
        [Validation(Required=true)]
        public long? GreenEnergyAmount { get; set; }

    }

}
