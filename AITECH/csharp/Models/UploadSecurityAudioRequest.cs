// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class UploadSecurityAudioRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 音频文件 URL
        [NameInMap("file_url")]
        [Validation(Required=true)]
        public string FileUrl { get; set; }

        // 须 audio 前缀
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 租户标识
        [NameInMap("business_id")]
        [Validation(Required=true)]
        public string BusinessId { get; set; }

        // 降噪开关
        [NameInMap("denoise")]
        [Validation(Required=false)]
        public string Denoise { get; set; }

        // 音频格式
        [NameInMap("audio_format")]
        [Validation(Required=false)]
        public string AudioFormat { get; set; }

        // 消息 ID
        [NameInMap("message_id")]
        [Validation(Required=false)]
        public string MessageId { get; set; }

    }

}
