// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 合同签署模板和渲染参数
    public class TemplateArgs : TeaModel {
        // 模板id
        /// <summary>
        /// <b>Example:</b>
        /// <para>T1762152216</para>
        /// </summary>
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        // 模板版本
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("template_version")]
        [Validation(Required=false)]
        public string TemplateVersion { get; set; }

        // 模板参数，JSON格式，其中key对应模板中的名称，value对应其要渲染的值
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;模板key&quot;:&quot;模板value&quot;}</para>
        /// </summary>
        [NameInMap("template_args")]
        [Validation(Required=false)]
        public string TemplateArgs_ { get; set; }

    }

}
