// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SDS.Models
{
    // 维度
    public class Dimension : TeaModel {
        // 维度
        /// <summary>
        /// <b>Example:</b>
        /// <para>voucher_template_id</para>
        /// </summary>
        [NameInMap("dimension")]
        [Validation(Required=true)]
        public string Dimension_ { get; set; }

        // 维度值
        /// <summary>
        /// <b>Example:</b>
        /// <para>2025122400073001038200J7964H</para>
        /// </summary>
        [NameInMap("dimension_value")]
        [Validation(Required=true)]
        public string DimensionValue { get; set; }

    }

}
