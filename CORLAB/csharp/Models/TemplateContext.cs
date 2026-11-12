// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CORLAB.Models
{
    // 产品对应模版字段
    public class TemplateContext : TeaModel {
        // 模版header头
        /// <summary>
        /// <b>Example:</b>
        /// <para>bizCode</para>
        /// </summary>
        [NameInMap("head_name")]
        [Validation(Required=true)]
        public string HeadName { get; set; }

        // 字段描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>加密身份id</para>
        /// </summary>
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 是否为必填:REQUIRED,ONE_OF
        /// <summary>
        /// <b>Example:</b>
        /// <para>ONE_OF</para>
        /// </summary>
        [NameInMap("require_type")]
        [Validation(Required=true)]
        public string RequireType { get; set; }

    }

}
