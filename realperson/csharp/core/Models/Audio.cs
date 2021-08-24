// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    // 音频文件
    public class Audio : TeaModel {
        // 音频文件名称（单次请求保持唯一）
        [NameInMap("token")]
        [Validation(Required=false)]
        public string Token { get; set; }

        // 待认证的音频文件，base64编码格式
        [NameInMap("raw_data")]
        [Validation(Required=false)]
        public string RawData { get; set; }

        // 音频文件OSS地址
        [NameInMap("audio_url")]
        [Validation(Required=false)]
        public string AudioUrl { get; set; }

    }

}
