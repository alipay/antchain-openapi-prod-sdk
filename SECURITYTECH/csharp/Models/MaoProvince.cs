// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 商户入驻-省信息
    public class MaoProvince : TeaModel {
        // 省编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>TBJHF</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 省名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>省名称</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
