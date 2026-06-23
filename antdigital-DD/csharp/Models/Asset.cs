// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 情报资产详情
    public class Asset : TeaModel {
        // 资产标识，作为幂等单号
        /// <summary>
        /// <b>Example:</b>
        /// <para>2024112900876318</para>
        /// </summary>
        [NameInMap("asset_id")]
        [Validation(Required=true)]
        public string AssetId { get; set; }

        // VALID - 生效；INVALID - 作废
        /// <summary>
        /// <b>Example:</b>
        /// <para>资产状态</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 资产详情，自定义展示
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;{&quot;company&quot;:&quot;alpha&quot;,&quot;name&quot;:&quot;beta&quot;,&quot;phone&quot;:&quot;18812345678&quot;,&quot;email&quot;:&quot;<a href="mailto:hello@example.com">hello@example.com</a>&quot;,&quot;position&quot;:&quot;gamma&quot;,&quot;industry&quot;:&quot;zeta&quot;,&quot;content&quot;:&quot;delta&quot;}&quot;</para>
        /// </summary>
        [NameInMap("asset_info")]
        [Validation(Required=true)]
        public string AssetInfo { get; set; }

    }

}
