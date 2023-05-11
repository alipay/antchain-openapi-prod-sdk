// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_68b3ee3230284cddaa19740dcaf251d8.Models
{
    public class QueryAntchainSaasFoundationProtobufRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 产品码
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // api code列表信息
        [NameInMap("api_code_list")]
        [Validation(Required=true)]
        public List<string> ApiCodeList { get; set; }

    }

}
