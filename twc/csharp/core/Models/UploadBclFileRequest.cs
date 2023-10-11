// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class UploadBclFileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 文件名称
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 文件的Base64编码，需小于1M
        [NameInMap("file_content")]
        [Validation(Required=true)]
        public string FileContent { get; set; }

        // 文件类型
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

    }

}
