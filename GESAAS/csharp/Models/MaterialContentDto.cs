// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    // 素材内容
    public class MaterialContentDto : TeaModel {
        // 文本素材信息列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("text_info_dtos")]
        [Validation(Required=false)]
        public List<TextInfoDto> TextInfoDtos { get; set; }

        // 图片素材列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("image_info_dtos")]
        [Validation(Required=false)]
        public List<ImageInfoDto> ImageInfoDtos { get; set; }

        // 视频素材内容列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("video_info_dtos")]
        [Validation(Required=false)]
        public List<FileInfoDto> VideoInfoDtos { get; set; }

        // 音频素材内容列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("audio_info_dtos")]
        [Validation(Required=false)]
        public List<FileInfoDto> AudioInfoDtos { get; set; }

    }

}
