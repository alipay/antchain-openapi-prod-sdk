// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class ApplyStubCertificateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 流程id
        [NameInMap("flow_id")]
        [Validation(Required=true)]
        public string FlowId { get; set; }

        // 证书类型，AntchainCertification（蚂蚁链存证证明）、OrgCertification（公证处存证证明），目前支持公证处
        [NameInMap("certification_type")]
        [Validation(Required=true)]
        public string CertificationType { get; set; }

        // 公证处ID，OrgCertification（公证处存证证明）选填，不填则为默认公证处
        [NameInMap("org_id")]
        [Validation(Required=false)]
        public string OrgId { get; set; }

        // 是否需要legal码，默认为false即不需要，true表示需要
        [NameInMap("need_legal_code")]
        [Validation(Required=false)]
        public bool? NeedLegalCode { get; set; }

    }

}
