// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CORLAB.Models
{
    // 产品信息
    public class ProductContext : TeaModel {
        // 产品code
        /// <summary>
        /// <b>Example:</b>
        /// <para>aft_v4</para>
        /// </summary>
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 模版code
        /// <summary>
        /// <b>Example:</b>
        /// <para>tb-default</para>
        /// </summary>
        [NameInMap("template_code")]
        [Validation(Required=true)]
        public string TemplateCode { get; set; }

        // 模版内容,数组
        [NameInMap("template_context")]
        [Validation(Required=true)]
        public List<TemplateContext> TemplateContext { get; set; }

        // 产品模型结果字段
        /// <summary>
        /// <b>Example:</b>
        /// <para>[&quot;aft_v3_score&quot;,&quot;aft_v4_score&quot;]</para>
        /// </summary>
        [NameInMap("score_fields")]
        [Validation(Required=true)]
        public List<string> ScoreFields { get; set; }

    }

}
