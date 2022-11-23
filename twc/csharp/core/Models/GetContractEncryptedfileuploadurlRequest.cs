// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class GetContractEncryptedfileuploadurlRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 包含后缀的文件全名, 合同.pdf
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 是否已加密, 默认否
        [NameInMap("encrypted")]
        [Validation(Required=false)]
        public bool? Encrypted { get; set; }

        // 明文文件的md5码，用于完整性校验
        [NameInMap("md5")]
        [Validation(Required=true)]
        public string Md5 { get; set; }

    }

}
