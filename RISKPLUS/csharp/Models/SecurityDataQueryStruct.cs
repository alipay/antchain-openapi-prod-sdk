// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 安全数据服务请求参数
    public class SecurityDataQueryStruct : TeaModel {
        // 请求数据参数
        /// <summary>
        /// <b>Example:</b>
        /// <para>{}</para>
        /// </summary>
        [NameInMap("params")]
        [Validation(Required=true)]
        public string Params { get; set; }

        // 请求数据类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>IP</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 请求数据版本
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.0</para>
        /// </summary>
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

    }

}
