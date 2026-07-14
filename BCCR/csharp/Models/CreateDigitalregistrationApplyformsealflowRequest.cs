// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class CreateDigitalregistrationApplyformsealflowRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数登ID
        [NameInMap("digital_register_id")]
        [Validation(Required=true)]
        public string DigitalRegisterId { get; set; }

        // ewrwrwerwr
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

        // 签章经办人身份证号（数登申请人是企业的场景下必填）
        [NameInMap("agent_cert_no")]
        [Validation(Required=false)]
        public string AgentCertNo { get; set; }

        // 签章经办人姓名（数登申请人是企业的场景下必填）
        [NameInMap("agent_cert_name")]
        [Validation(Required=false)]
        public string AgentCertName { get; set; }

    }

}
