// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    // 视频多模态参考素材。source_type 支持 MATERIAL/AFTS/URL；URL 时 path 为外部可访问地址。entity_id 与 prompt 中 @{名称,entityId} 绑定。
    public class CreativeVideoAssetRef : TeaModel {
        // prompt 中 @{名称,entityId} 对应的实体 ID；同一实体可跨图片、音频、视频复用。
        /// <summary>
        /// <b>Example:</b>
        /// <para>e-44b6e1086a08</para>
        /// </summary>
        [NameInMap("entity_id")]
        [Validation(Required=true)]
        public string EntityId { get; set; }

        // 素材类型：IMAGE、AUDIO、VIDEO。
        /// <summary>
        /// <b>Example:</b>
        /// <para>VIDEO</para>
        /// </summary>
        [NameInMap("material_type")]
        [Validation(Required=true)]
        public string MaterialType { get; set; }

        // 素材来源：MATERIAL（素材库）、AFTS（本地上传）、URL（外部可访问地址）。OpenAPI 支持 URL，与 input_elements 一致；后端需解析/转存后再交算法。
        /// <summary>
        /// <b>Example:</b>
        /// <para>URL</para>
        /// </summary>
        [NameInMap("source_type")]
        [Validation(Required=true)]
        public string SourceType { get; set; }

        // 由 source_type 决定：MATERIAL 传 materialId；AFTS 传 /creative/file/upload 返回的 fileId；URL 传外部可访问的绝对 http/https URL。
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://example.com/ref.mp4">https://example.com/ref.mp4</a></para>
        /// </summary>
        [NameInMap("path")]
        [Validation(Required=true)]
        public string Path { get; set; }

        // 前端展示名称，不作为生成校验依据。
        /// <summary>
        /// <b>Example:</b>
        /// <para>小王</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 文件大小快照，单位字节；AFTS 来源必填，由前端传入。
        /// <summary>
        /// <b>Example:</b>
        /// <para>1048576</para>
        /// </summary>
        [NameInMap("size_bytes")]
        [Validation(Required=false)]
        public long? SizeBytes { get; set; }

        // 音视频时长快照，单位秒；AFTS 音频、视频必填。
        /// <summary>
        /// <b>Example:</b>
        /// <para>5.06</para>
        /// </summary>
        [NameInMap("duration_seconds")]
        [Validation(Required=false)]
        public long? DurationSeconds { get; set; }

        // 视频缩略图 AFTS 文件 ID，可由 /creative/file/upload 返回的 fileId 提供。
        /// <summary>
        /// <b>Example:</b>
        /// <para>thumb-file-id</para>
        /// </summary>
        [NameInMap("thumbnail_file_id")]
        [Validation(Required=false)]
        public string ThumbnailFileId { get; set; }

    }

}
