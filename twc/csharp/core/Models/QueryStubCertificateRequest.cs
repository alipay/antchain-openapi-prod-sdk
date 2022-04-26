// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryStubCertificateRequest : TeaModel {
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

        // 通过twc.notary.stub.certificate.apply(数字票根全流程出证申请)获取到的订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

    }

}
