// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // 文件描述
    public class FileDefine : TeaModel {
        // 调用方设定，保证文件唯一性。
        // 
        // 
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 文件名称
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 文件大小
        [NameInMap("size")]
        [Validation(Required=false)]
        public long? Size { get; set; }

        // 文件key
        [NameInMap("osskey")]
        [Validation(Required=true)]
        public string Osskey { get; set; }

        // 文件类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 预览链接
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

    }

}
