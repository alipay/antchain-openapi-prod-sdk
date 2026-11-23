// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    public class PushAntcloudMarketingagentCreativeMaterialRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // string
        /// <summary>
        /// <para>待上传文件</para>
        /// </summary>
        [NameInMap("fileObject")]
        [Validation(Required=false)]
        public Stream FileObject { get; set; }

        /// <summary>
        /// <para>待上传文件名</para>
        /// </summary>
        [NameInMap("fileObjectName")]
        [Validation(Required=false)]
        public string FileObjectName { get; set; }

        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 产品类型
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 素材用途
        [NameInMap("material_usage")]
        [Validation(Required=true)]
        public string MaterialUsage { get; set; }

        // 素材形式（单个素材还是素材包）
        [NameInMap("material_form")]
        [Validation(Required=true)]
        public string MaterialForm { get; set; }

        // 素材文件格式
        [NameInMap("material_type")]
        [Validation(Required=true)]
        public string MaterialType { get; set; }

        // 素材空间类型（平台空间、企业空间、个人空间），不同空间下权限不一样
        [NameInMap("space_type")]
        [Validation(Required=true)]
        public string SpaceType { get; set; }

        // 后续要做 AI 解析就要传,单文件音视频时长
        [NameInMap("duration_seconds")]
        [Validation(Required=false)]
        public string DurationSeconds { get; set; }

        // 素材名， 不传用文件名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 使用场景编码
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

        // 行业编码
        [NameInMap("industry")]
        [Validation(Required=false)]
        public string Industry { get; set; }

        // 多个投放平台编码用英文逗号分隔
        [NameInMap("publish_platforms")]
        [Validation(Required=false)]
        public string PublishPlatforms { get; set; }

        // 生图模板复用时回填的提示词；仅 GENERATION_TEMPLATE 使用
        [NameInMap("prompt")]
        [Validation(Required=false)]
        public string Prompt { get; set; }

        // 单文件视频缩略图 AFTS fileId
        [NameInMap("thumbnail_fileid")]
        [Validation(Required=false)]
        public string ThumbnailFileid { get; set; }

        // 封面文件下标，从 0 开始；素材包默认 0
        [NameInMap("cover_index")]
        [Validation(Required=false)]
        public long? CoverIndex { get; set; }

        // 视频缩略图的受管 OSS 路径
        [NameInMap("thumbnail_oss_path")]
        [Validation(Required=false)]
        public string ThumbnailOssPath { get; set; }

        // 逐文件媒体信息，传 JSON 数组字符串；素材包的时长和缩略图从这里取
        [NameInMap("metadata")]
        [Validation(Required=false)]
        public string Metadata { get; set; }

        // 从生成结果保存时必传
        [NameInMap("source_message_id")]
        [Validation(Required=false)]
        public string SourceMessageId { get; set; }

        // 1，选第二个生成结果；默认 0
        [NameInMap("source_result_index")]
        [Validation(Required=false)]
        public long? SourceResultIndex { get; set; }

        // 来源消息保存时必传；普通上传选填
        [NameInMap("template_data")]
        [Validation(Required=false)]
        public MaterialTemplateData TemplateData { get; set; }

        // 模版json
        [NameInMap("item_templates_json")]
        [Validation(Required=false)]
        public string ItemTemplatesJson { get; set; }

    }

}
