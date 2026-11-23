// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    // 模版引用
    public class CreativeTemplateAssetRef : TeaModel {
        // 与 prompt 里的 @{商品图,ref-01} 对应
        /// <summary>
        /// <b>Example:</b>
        /// <para>ref-01</para>
        /// </summary>
        [NameInMap("entity_id")]
        [Validation(Required=true)]
        public string EntityId { get; set; }

        // 对应列表类型：`IMAGE`、`AUDIO` 或 VIDEO
        /// <summary>
        /// <b>Example:</b>
        /// <para>IMAGE</para>
        /// </summary>
        [NameInMap("material_type")]
        [Validation(Required=true)]
        public string MaterialType { get; set; }

        // 来源类型：`MATERIAL`、`AFTS`、`OSS` 或 URL
        /// <summary>
        /// <b>Example:</b>
        /// <para>MATERIAL</para>
        /// </summary>
        [NameInMap("source_type")]
        [Validation(Required=true)]
        public string SourceType { get; set; }

        // 来源定位值；`sourceType=MATERIAL` 时填平台素材 ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>material-image-demo-001</para>
        /// </summary>
        [NameInMap("path")]
        [Validation(Required=true)]
        public string Path { get; set; }

        // 用途提示，可省略
        /// <summary>
        /// <b>Example:</b>
        /// <para>参考商品外观</para>
        /// </summary>
        [NameInMap("usage_hint")]
        [Validation(Required=false)]
        public string UsageHint { get; set; }

    }

}
