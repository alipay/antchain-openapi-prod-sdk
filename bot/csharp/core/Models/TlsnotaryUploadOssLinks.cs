// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // tlsnotary文件认证成功后上传到oss的文件链接列表
    public class TlsnotaryUploadOssLinks : TeaModel {
        // 证书链摘要文件的oss链接
        [NameInMap("cert_chain_digest_link")]
        [Validation(Required=true)]
        public string CertChainDigestLink { get; set; }

        // 邮件eml文件的oss链接
        [NameInMap("eml_file_link")]
        [Validation(Required=true)]
        public string EmlFileLink { get; set; }

    }

}
