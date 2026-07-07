// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 监测提供商能力
    public class MonitorProviderCapability : TeaModel {
        // 供应商id
        /// <summary>
        /// <b>Example:</b>
        /// <para>GOODEYE</para>
        /// </summary>
        [NameInMap("provider_id")]
        [Validation(Required=true)]
        public string ProviderId { get; set; }

        // 供应商名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>千里眼</para>
        /// </summary>
        [NameInMap("provider_name")]
        [Validation(Required=true)]
        public string ProviderName { get; set; }

        // 供应商描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>描述</para>
        /// </summary>
        [NameInMap("provider_description")]
        [Validation(Required=true)]
        public string ProviderDescription { get; set; }

        // 是否推荐供应商
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("is_provided")]
        [Validation(Required=true)]
        public bool? IsProvided { get; set; }

    }

}
