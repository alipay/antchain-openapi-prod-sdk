// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CORLAB.Models
{
    // 产品拓展字段信息
    public class ProductExtContext : TeaModel {
        // 产品code
        /// <summary>
        /// <b>Example:</b>
        /// <para>MD-CpFJeF0DAAABl4MFvUs</para>
        /// </summary>
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 产品名
        /// <summary>
        /// <b>Example:</b>
        /// <para>小微分</para>
        /// </summary>
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

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

        // 返回样本模版文件下载url
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://oss">http://oss</a></para>
        /// </summary>
        [NameInMap("template_file_down_url")]
        [Validation(Required=true)]
        public string TemplateFileDownUrl { get; set; }

    }

}
