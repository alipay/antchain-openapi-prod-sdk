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
        /// <summary>
        /// <b>Example:</b>
        /// <para>81995a7fa2bfc132eb69cdc2028f0619.wav</para>
        /// </summary>
        [NameInMap("token")]
        [Validation(Required=false)]
        public string Token { get; set; }

        // 待认证的音频文件，base64编码格式
        /// <summary>
        /// <b>Example:</b>
        /// <para>/9j/238sn382l23f4 </para>
        /// </summary>
        [NameInMap("raw_data")]
        [Validation(Required=false)]
        public string RawData { get; set; }

        // 音频文件OSS地址
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://xxxxxx.oss-cn-shanghai.aliyuncs.com/12345.wav">https://xxxxxx.oss-cn-shanghai.aliyuncs.com/12345.wav</a></para>
        /// </summary>
        [NameInMap("audio_url")]
        [Validation(Required=false)]
        public string AudioUrl { get; set; }

    }

}
