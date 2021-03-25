// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class RemoveConsumecardBillingcontractRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础请求对象
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequest BaseRequest { get; set; }

        // 认证平台ID 本期支付宝用户ID
        [NameInMap("certification_id")]
        [Validation(Required=true)]
        public string CertificationId { get; set; }

    }

}
