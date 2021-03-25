// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 存证证明的证书信息
    public class CertificateInfo : TeaModel {
        // 存证证明的证书内容的SHA256哈希值
        [NameInMap("hash")]
        [Validation(Required=true)]
        public string Hash { get; set; }

        // 存证证明的证书文件名
        [NameInMap("resource_name")]
        [Validation(Required=true)]
        public string ResourceName { get; set; }

        // 存证证明的证书下载地址
        [NameInMap("resource_url")]
        [Validation(Required=true)]
        public string ResourceUrl { get; set; }

    }

}
