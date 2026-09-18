// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 商户入驻-省/市/区编码
    public class MaoDistrictCode : TeaModel {
        // 行政区划编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>行政区划编码</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 行政区划名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>行政区划名称</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
