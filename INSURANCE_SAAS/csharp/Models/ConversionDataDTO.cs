// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    // 转化数据条目
    public class ConversionDataDTO : TeaModel {
        // 转化目标类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>FORMBOOK</para>
        /// </summary>
        [NameInMap("conversion_type")]
        [Validation(Required=true)]
        public string ConversionType { get; set; }

        // 目标转化量
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("conversion_count")]
        [Validation(Required=true)]
        public long? ConversionCount { get; set; }

    }

}
