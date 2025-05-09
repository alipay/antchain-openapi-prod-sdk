// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_9705ae7650f74f47b1e8158151cc122f.Models
{
    public class FinishBlockchainBccrDciRegistrationcertRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 登记号
        [NameInMap("reg_number")]
        [Validation(Required=true)]
        public string RegNumber { get; set; }

        // 数登证书地址
        [NameInMap("certificate_url")]
        [Validation(Required=false)]
        public string CertificateUrl { get; set; }

        // 数登样本地址
        [NameInMap("sample_url")]
        [Validation(Required=false)]
        public string SampleUrl { get; set; }

        // 客户端幂等token
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

    }

}
