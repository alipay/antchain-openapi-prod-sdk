// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SDS.Models
{
    // 过滤条件
    public class FilterCondition : TeaModel {
        // 过滤列
        /// <summary>
        /// <b>Example:</b>
        /// <para>biz_date</para>
        /// </summary>
        [NameInMap("filter_column")]
        [Validation(Required=true)]
        public string FilterColumn { get; set; }

        // 过滤方式
        /// <summary>
        /// <b>Example:</b>
        /// <para>BETWEEN</para>
        /// </summary>
        [NameInMap("filter_type")]
        [Validation(Required=false)]
        public string FilterType { get; set; }

        // 值列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>[&quot;20240303&quot;, &quot;20250303&quot;]</para>
        /// </summary>
        [NameInMap("value_list")]
        [Validation(Required=true)]
        public List<string> ValueList { get; set; }

    }

}
