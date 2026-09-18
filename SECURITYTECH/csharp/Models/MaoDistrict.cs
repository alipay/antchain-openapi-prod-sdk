// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 商户入驻-区
    public class MaoDistrict : TeaModel {
        // 区编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>区编码</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 区名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>区名称</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
