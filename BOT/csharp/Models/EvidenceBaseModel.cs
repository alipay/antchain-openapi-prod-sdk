// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 信物链证据基本组成结构体
    public class EvidenceBaseModel : TeaModel {
        // 业务数据
        /// <summary>
        /// <b>Example:</b>
        /// <para>[{&quot;content&quot;:&quot;{业务数据}&quot;,&quot;label&quot;:&quot;CRYPTO&quot;,&quot;timestamp&quot;:0}]</para>
        /// </summary>
        [NameInMap("biz_data")]
        [Validation(Required=false)]
        public string BizData { get; set; }

        // 证据哈希值
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;证据哈希值&quot;</para>
        /// </summary>
        [NameInMap("hash")]
        [Validation(Required=false)]
        public string Hash { get; set; }

        // 证据附属信息字段
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;证据附属信息&quot;</para>
        /// </summary>
        [NameInMap("meta_json")]
        [Validation(Required=false)]
        public string MetaJson { get; set; }

    }

}
