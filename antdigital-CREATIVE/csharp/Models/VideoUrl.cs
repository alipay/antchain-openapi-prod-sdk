// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    // 视频 URL（成功时返回）
    public class VideoUrl : TeaModel {
        // 视频 URL（成功时返回）
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://example.com/output.mp4">https://example.com/output.mp4</a></para>
        /// </summary>
        [NameInMap("video_url")]
        [Validation(Required=false)]
        public string VideoUrl_ { get; set; }

    }

}
