// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class BindCaasApplicationManageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用ID
        [NameInMap("application_id")]
        [Validation(Required=true)]
        public string ApplicationId { get; set; }

        // 合约服务标识集合
        [NameInMap("service_ids")]
        [Validation(Required=false)]
        public List<string> ServiceIds { get; set; }

    }

}
