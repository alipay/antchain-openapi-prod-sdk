// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 链详情
    public class MyChainInfo : TeaModel {
        // 链id
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxid</para>
        /// </summary>
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 授权租户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>tenantID</para>
        /// </summary>
        [NameInMap("tenant")]
        [Validation(Required=true)]
        public string Tenant { get; set; }

    }

}
