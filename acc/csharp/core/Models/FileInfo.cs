// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // 财报信息
    public class FileInfo : TeaModel {
        // 业务id
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 财报文件，base64
        [NameInMap("file_str")]
        [Validation(Required=true)]
        public string FileStr { get; set; }

        // 文件名称（企业财报.jpg）
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 文件大小(byte长度)
        [NameInMap("file_size")]
        [Validation(Required=true)]
        public long? FileSize { get; set; }

        // 文件类型(jpg)
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

    }

}
