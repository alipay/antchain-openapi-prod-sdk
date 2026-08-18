// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    // 输出内容
    public class ContentInfoDto : TeaModel {
        // 视频地址 有效期为 24 小时
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://xxx.alipay.com/paths/xx.png">https://xxx.alipay.com/paths/xx.png</a></para>
        /// </summary>
        [NameInMap("video_url")]
        [Validation(Required=true)]
        public string VideoUrl { get; set; }

        // 尾帧图像 URL 有效期为 24 小时
        // 任务创建 returnLastFrame=true时返回
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://xxx.alipay.com/paths/xx.png">https://xxx.alipay.com/paths/xx.png</a></para>
        /// </summary>
        [NameInMap("last_frame_url")]
        [Validation(Required=false)]
        public string LastFrameUrl { get; set; }

    }

}
