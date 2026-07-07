// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class CreateCertificateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 版权登记id
        [NameInMap("register_id")]
        [Validation(Required=true)]
        public string RegisterId { get; set; }

        // 证书类型
        [NameInMap("certificate_type")]
        [Validation(Required=true)]
        public string CertificateType { get; set; }

        // 功能类型
        [NameInMap("features_type")]
        [Validation(Required=true)]
        public string FeaturesType { get; set; }

        // 公证处id
        [NameInMap("org_id")]
        [Validation(Required=false)]
        public string OrgId { get; set; }

        // 代理信息
        [NameInMap("proxy_info")]
        [Validation(Required=false)]
        public ProxyData ProxyInfo { get; set; }

    }

}
