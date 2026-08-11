// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    // 参考样式素材引用
    public class CreativeAssetRef : TeaModel {
        // 素材来源
        /// <summary>
        /// <b>Example:</b>
        /// <para>URL</para>
        /// </summary>
        [NameInMap("source_type")]
        [Validation(Required=true)]
        public string SourceType { get; set; }

        // 素材ID，只有素材来源于creative的素材库中才需要填入
        /// <summary>
        /// <b>Example:</b>
        /// <para>5bf62f7dd73b4efa8dea7a2665cd2173</para>
        /// </summary>
        [NameInMap("material_id")]
        [Validation(Required=false)]
        public string MaterialId { get; set; }

        // 可公网访问的素材url地址
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://mdn.alipayobjects.com/wofi_creative/afts/file/80mwSruGUE4AAAAAAAAAAAAA-FZ4AQJr">https://mdn.alipayobjects.com/wofi_creative/afts/file/80mwSruGUE4AAAAAAAAAAAAA-FZ4AQJr</a></para>
        /// </summary>
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

        // 使用提示
        /// <summary>
        /// <b>Example:</b>
        /// <para>二维码保持清晰</para>
        /// </summary>
        [NameInMap("usage_hint")]
        [Validation(Required=false)]
        public string UsageHint { get; set; }

    }

}
