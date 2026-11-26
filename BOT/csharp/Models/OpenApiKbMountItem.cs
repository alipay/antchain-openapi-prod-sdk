// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // Agent挂载知识库项（IoTAgent kb.list 响应 items 元素）
    public class OpenApiKbMountItem : TeaModel {
        // 知识库ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>7470569204104081408</para>
        /// </summary>
        [NameInMap("kb_id")]
        [Validation(Required=true)]
        public string KbId { get; set; }

        // 映射kbName
        /// <summary>
        /// <b>Example:</b>
        /// <para>产品使用手册</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 映射kbDescription
        /// <summary>
        /// <b>Example:</b>
        /// <para>产品使用说明与FAQ</para>
        /// </summary>
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 枚举:OFFICIAL,CUSTOM
        /// <summary>
        /// <b>Example:</b>
        /// <para>OFFICIAL</para>
        /// </summary>
        [NameInMap("provider")]
        [Validation(Required=true)]
        public string Provider { get; set; }

    }

}
