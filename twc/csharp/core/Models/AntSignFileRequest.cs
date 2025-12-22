// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 法务电子签待签署文件列表
    public class AntSignFileRequest : TeaModel {
        // 文件名称
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 文件httpUrl
        [NameInMap("file_http_url")]
        [Validation(Required=true)]
        public string FileHttpUrl { get; set; }

        // 单次请求文件唯一id，与CaSystemSignFileRequest中的fileId对应
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 文件类型（只支持pdf）
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

    }

}
