// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 描述分布的结构，目前主要包含date和value值
    public class Curve : TeaModel {
        // 分布以day为单位的日期
        /// <summary>
        /// <b>Example:</b>
        /// <para>2021-03-19</para>
        /// </summary>
        [NameInMap("date")]
        [Validation(Required=true)]
        public string Date { get; set; }

        // 以day为单位的一天凭证颁发的数据量统计。
        /// <summary>
        /// <b>Example:</b>
        /// <para>1001</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
