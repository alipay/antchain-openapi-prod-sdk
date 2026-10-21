// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGENT.Models
{
    public class ExtractschemaKmDocumentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 知识库ID
        [NameInMap("kb_id")]
        [Validation(Required=true)]
        public string KbId { get; set; }

        // OSS文件Key
        [NameInMap("file_key")]
        [Validation(Required=true)]
        public string FileKey { get; set; }

        // 文件类型
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

        // OSS提供方
        [NameInMap("oss_provider")]
        [Validation(Required=false)]
        public string OssProvider { get; set; }

        // 抽取目标描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

    }

}
