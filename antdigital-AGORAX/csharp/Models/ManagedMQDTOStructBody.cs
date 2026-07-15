// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 托管数据库ManagedMQDTO结构体
    public class ManagedMQDTOStructBody : TeaModel {
        // id
        /// <summary>
        /// <b>Example:</b>
        /// <para>5</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 实例
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;MQ_INST_1287126353308684_BXYEnC3u&quot;</para>
        /// </summary>
        [NameInMap("instance")]
        [Validation(Required=false)]
        public string Instance { get; set; }

        // 主题
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;tfx4lb3m0qh3emact73tln8t8qkygb65&quot;</para>
        /// </summary>
        [NameInMap("topic")]
        [Validation(Required=false)]
        public string Topic { get; set; }

        // 类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;basic&quot;</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
