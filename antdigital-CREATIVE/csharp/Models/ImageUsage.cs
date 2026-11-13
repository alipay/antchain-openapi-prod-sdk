// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    // 用量数组
    public class ImageUsage : TeaModel {
        // 用量类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>IMAGE_GENERATION</para>
        /// </summary>
        [NameInMap("usage_type")]
        [Validation(Required=false)]
        public string UsageType { get; set; }

        // 计量单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>IMAGE_COUNT</para>
        /// </summary>
        [NameInMap("unit")]
        [Validation(Required=false)]
        public string Unit { get; set; }

        // 图片张数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("image_count")]
        [Validation(Required=false)]
        public long? ImageCount { get; set; }

        // 本次图片生成的实际消耗金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.11</para>
        /// </summary>
        [NameInMap("original_price")]
        [Validation(Required=false)]
        public string OriginalPrice { get; set; }

        // 币种
        /// <summary>
        /// <b>Example:</b>
        /// <para>CNY</para>
        /// </summary>
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

    }

}
