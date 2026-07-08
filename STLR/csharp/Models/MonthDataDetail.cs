// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 月度明细列表
    public class MonthDataDetail : TeaModel {
        // 发生月份，格式 yyyy-MM
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("occur_date")]
        [Validation(Required=true)]
        public string OccurDate { get; set; }

        // 产量数据
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

        // 产量单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("dosage_unit")]
        [Validation(Required=true)]
        public string DosageUnit { get; set; }

    }

}
