// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // Did doc中的service info
    public class DidServiceInfo : TeaModel {
        // 服务的end point info
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://xxxxxx">http://xxxxxx</a></para>
        /// </summary>
        [NameInMap("end_point")]
        [Validation(Required=true)]
        public string EndPoint { get; set; }

        // 扩展字段信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;item1&quot;:&quot;&quot;}</para>
        /// </summary>
        [NameInMap("extension_info")]
        [Validation(Required=true)]
        public string ExtensionInfo { get; set; }

    }

}
