// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 代理信息
    public class ProxyData : TeaModel {
        // 金融云租户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088XXXXXX</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 租户名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>FJKDNESX</para>
        /// </summary>
        [NameInMap("tenant_name")]
        [Validation(Required=true)]
        public string TenantName { get; set; }

        // 是否计量
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("if_measure")]
        [Validation(Required=false)]
        public bool? IfMeasure { get; set; }

    }

}
