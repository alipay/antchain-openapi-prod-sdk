// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MARKETING.Models
{
    // 用于传输附件链接
    public class Attachment : TeaModel {
        // 文件唯一标识，作为幂等字段
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 文件名称，用作展示
        [NameInMap("filename")]
        [Validation(Required=false)]
        public string Filename { get; set; }

        // 访问地址
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

    }

}
