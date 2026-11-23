// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    // 素材模版数据
    public class MaterialTemplateData : TeaModel {
        // prompt
        /// <summary>
        /// <b>Example:</b>
        /// <para>参考 @{商品图,ref-01}，先拍全景，再切近景</para>
        /// </summary>
        [NameInMap("prompt")]
        [Validation(Required=true)]
        public string Prompt { get; set; }

        // 生图模型id
        /// <summary>
        /// <b>Example:</b>
        /// <para>image-model-demo</para>
        /// </summary>
        [NameInMap("image_model_id")]
        [Validation(Required=false)]
        public string ImageModelId { get; set; }

        // 生视频模型id
        /// <summary>
        /// <b>Example:</b>
        /// <para>video-model-demo</para>
        /// </summary>
        [NameInMap("video_model_id")]
        [Validation(Required=false)]
        public string VideoModelId { get; set; }

        // 参考图片列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("image_refs")]
        [Validation(Required=false)]
        public List<CreativeTemplateAssetRef> ImageRefs { get; set; }

        // 参考音频列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("voice_refs")]
        [Validation(Required=false)]
        public List<CreativeTemplateAssetRef> VoiceRefs { get; set; }

        // 参考视频列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("video_refs")]
        [Validation(Required=false)]
        public List<CreativeTemplateAssetRef> VideoRefs { get; set; }

    }

}
