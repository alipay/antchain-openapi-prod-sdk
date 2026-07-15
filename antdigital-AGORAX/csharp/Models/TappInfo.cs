// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // C3S可信计算服务TAPP应用信息
    public class TappInfo : TeaModel {
        // C3S可信计算TAPP应用标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>fafafafaf</para>
        /// </summary>
        [NameInMap("taap_id")]
        [Validation(Required=true)]
        public string TaapId { get; set; }

        // C3S可信计算TAPP版本
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("tapp_version")]
        [Validation(Required=true)]
        public long? TappVersion { get; set; }

    }

}
