// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 商户入驻-市
    public class MaoCity : TeaModel {
        // 市编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>市编码</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 市名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>市名称</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
