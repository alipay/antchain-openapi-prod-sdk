// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // DomainSLS配置
    public class DomainSls : TeaModel {
        // 拉取sql
        /// <summary>
        /// <b>Example:</b>
        /// <para>select from</para>
        /// </summary>
        [NameInMap("sql")]
        [Validation(Required=false)]
        public string Sql { get; set; }

        // 拉取SLS间隔
        /// <summary>
        /// <b>Example:</b>
        /// <para>1_h</para>
        /// </summary>
        [NameInMap("interval")]
        [Validation(Required=false)]
        public string Interval { get; set; }

        // 属性项
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;code&quot;:&quot;code&quot;}</para>
        /// </summary>
        [NameInMap("memo")]
        [Validation(Required=false)]
        public string Memo { get; set; }

    }

}
