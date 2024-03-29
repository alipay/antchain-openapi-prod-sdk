// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryIpGoodsupdateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础字段
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // ipid的列表，最多20个
        [NameInMap("ip_ids")]
        [Validation(Required=false)]
        public List<string> IpIds { get; set; }

        // 版权方账号id
        [NameInMap("account_id")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

    }

}
