// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云蚂蚁链相关下载链接
    public class ALiYunDownloadPath : TeaModel {
        // client_crt_url
        [NameInMap("client_crt_url")]
        [Validation(Required=false)]
        public string ClientCrtUrl { get; set; }

        // trust_ca_url
        [NameInMap("trust_ca_url")]
        [Validation(Required=false)]
        public string TrustCaUrl { get; set; }

        // ca_crt_url
        [NameInMap("ca_crt_url")]
        [Validation(Required=false)]
        public string CaCrtUrl { get; set; }

        // sdk_url
        [NameInMap("sdk_url")]
        [Validation(Required=false)]
        public string SdkUrl { get; set; }

    }

}
