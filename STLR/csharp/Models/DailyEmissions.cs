// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 每日碳排放量
    public class DailyEmissions : TeaModel {
        // 日期
        /// <summary>
        /// <b>Example:</b>
        /// <para>2021-07-21</para>
        /// </summary>
        [NameInMap("date")]
        [Validation(Required=true)]
        public string Date { get; set; }

        // 排放量值
        /// <summary>
        /// <b>Example:</b>
        /// <para>11.22</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=true)]
        public long? Value { get; set; }

    }

}
