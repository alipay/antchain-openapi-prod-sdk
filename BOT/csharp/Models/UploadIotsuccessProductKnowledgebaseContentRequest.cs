// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class UploadIotsuccessProductKnowledgebaseContentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("kb_id")]
        [Validation(Required=true)]
        public string KbId { get; set; }

        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 解码不超过10MiB（评审初值），不得包含目录穿越
        [NameInMap("content_base64")]
        [Validation(Required=true)]
        public string ContentBase64 { get; set; }

        // 枚举:TXT,MD,JSON,CSV,XLSX,XLS,DOCX,DOC,PDF
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

    }

}
