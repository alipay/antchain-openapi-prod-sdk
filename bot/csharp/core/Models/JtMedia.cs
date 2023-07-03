// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 多媒体文件
    public class JtMedia : TeaModel {
        // 多媒体ID
        [NameInMap("media_id")]
        [Validation(Required=true)]
        public string MediaId { get; set; }

        // 文件名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 可访问的url
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // 上传时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // 多媒体类型枚举：IMAGE 图像；AUDIO 音频；VIDEO视频； UN_KNOW  未知；
        [NameInMap("media_type")]
        [Validation(Required=true)]
        public string MediaType { get; set; }

    }

}
