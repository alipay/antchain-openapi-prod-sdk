// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class SignIpContractRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础请求参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 订单合同文件OSS文件key
        [NameInMap("contract_file_url")]
        [Validation(Required=true)]
        public string ContractFileUrl { get; set; }

        // 签署区信息
        [NameInMap("sign_fields")]
        [Validation(Required=true)]
        public List<SignField> SignFields { get; set; }

    }

}
