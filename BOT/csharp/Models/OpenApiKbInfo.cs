// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 知识库信息（I-0133）
    public class OpenApiKbInfo : TeaModel {
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("kb_id")]
        [Validation(Required=true)]
        public string KbId { get; set; }

        // 映射kbName
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 映射kbDescription
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 枚举:OFFICIAL,CUSTOM
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("provider")]
        [Validation(Required=true)]
        public string Provider { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("enable")]
        [Validation(Required=true)]
        public bool? Enable { get; set; }

        // 映射docCount
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("content_count")]
        [Validation(Required=true)]
        public long? ContentCount { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("paragraph_count")]
        [Validation(Required=true)]
        public long? ParagraphCount { get; set; }

        // 沿现有关联查询聚合；不新增版本账本
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("associated_product_keys")]
        [Validation(Required=true)]
        public List<string> AssociatedProductKeys { get; set; }

    }

}
