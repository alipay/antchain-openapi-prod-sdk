// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 授权文件信息
    public class AgreementFile : TeaModel {
        // 授权文件名称
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 授权文件内容
        [NameInMap("file_content_base64_string")]
        [Validation(Required=true)]
        public string FileContentBase64String { get; set; }

    }

}
