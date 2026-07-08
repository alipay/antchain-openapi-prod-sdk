// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 按绿色行为类型统计的绿色行为明细
    public class GreenOperationStatisticsByType : TeaModel {
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

        // 绿色行为产生的绿色能量值
        /// <summary>
        /// <b>Example:</b>
        /// <para>11</para>
        /// </summary>
        [NameInMap("green_energy_amount")]
        [Validation(Required=true)]
        public long? GreenEnergyAmount { get; set; }

        // 相关类型的绿色行为记录数
        /// <summary>
        /// <b>Example:</b>
        /// <para>33</para>
        /// </summary>
        [NameInMap("green_operation_records")]
        [Validation(Required=true)]
        public long? GreenOperationRecords { get; set; }

    }

}
