// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_6f72e7df0c87441c84120631f5b37b12.Models
{
    // 阿里云蚂蚁链相关下载链接
    public class ALiYunDownloadPath : TeaModel {
        // ca_crt_url
        [NameInMap("ca_crt_url")]
        [Validation(Required=false)]
        public string CaCrtUrl { get; set; }

        // client_crt_url
        [NameInMap("client_crt_url")]
        [Validation(Required=false)]
        public string ClientCrtUrl { get; set; }

        // sdk_url
        [NameInMap("sdk_url")]
        [Validation(Required=false)]
        public string SdkUrl { get; set; }

        // trust_ca_url
        [NameInMap("trust_ca_url")]
        [Validation(Required=false)]
        public string TrustCaUrl { get; set; }

    }

}
