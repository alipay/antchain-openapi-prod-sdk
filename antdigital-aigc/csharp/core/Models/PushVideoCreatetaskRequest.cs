// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AIGC.Models
{
    public class PushVideoCreatetaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 模型标识，如 seedance-01-pro / happyhorse-t2v / wanx-v1
        [NameInMap("model")]
        [Validation(Required=true)]
        public string Model { get; set; }

        // 文本提示词
        [NameInMap("prompt")]
        [Validation(Required=true)]
        public string Prompt { get; set; }

        // 图生视频时传入参考图片 URL
        [NameInMap("image_url")]
        [Validation(Required=false)]
        public string ImageUrl { get; set; }

        // 视频续写时传入参考视频 URL
        [NameInMap("video_url")]
        [Validation(Required=false)]
        public string VideoUrl { get; set; }

        // 参考音频 URL（预留）
        [NameInMap("audio_url")]
        [Validation(Required=false)]
        public string AudioUrl { get; set; }

        // 参考图片 URL（参考图生视频场景）
        [NameInMap("ref_image_url")]
        [Validation(Required=false)]
        public string RefImageUrl { get; set; }

        // 分辨率，如 1280x720
        [NameInMap("size")]
        [Validation(Required=false)]
        public string Size { get; set; }

        // 视频时长（秒）
        [NameInMap("duration")]
        [Validation(Required=false)]
        public string Duration { get; set; }

        // 请求追踪 ID，用于幂等去重
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        // MIST Token / API Key
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

        // 扩展JSON
        [NameInMap("ext")]
        [Validation(Required=false)]
        public string Ext { get; set; }

    }

}
