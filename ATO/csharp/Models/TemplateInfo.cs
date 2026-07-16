// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 模板详情
    public class TemplateInfo : TeaModel {
        // 模板id
        /// <summary>
        /// <b>Example:</b>
        /// <para>T20240712134030001693</para>
        /// </summary>
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        // 模板版本，不传取最新模板
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("template_version")]
        [Validation(Required=false)]
        public long? TemplateVersion { get; set; }

        // 模板参数，JSON格式，其中key对应模板中的名称，value对应其要渲染的值
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;模板key&quot;:&quot;模板value&quot;}</para>
        /// </summary>
        [NameInMap("template_args")]
        [Validation(Required=false)]
        public string TemplateArgs { get; set; }

        // 模板所属商户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>91310101MA1FPCXA3G</para>
        /// </summary>
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

    }

}
