// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 作品标签识别结果
    public class LabelRiskData : TeaModel {
        // 识别出的标签名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>识别出的标签名称</para>
        /// </summary>
        [NameInMap("label_name")]
        [Validation(Required=true)]
        public string LabelName { get; set; }

        // 识别出的标签是否与用户选择的标签匹配
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("is_match")]
        [Validation(Required=true)]
        public bool? IsMatch { get; set; }

        // 识别出的标签匹配度
        /// <summary>
        /// <b>Example:</b>
        /// <para>识别出的标签匹配度</para>
        /// </summary>
        [NameInMap("match_value")]
        [Validation(Required=true)]
        public string MatchValue { get; set; }

    }

}
