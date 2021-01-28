// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryContractAccountsealsRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 分页起始位置
        [NameInMap("offset")]
        [Validation(Required=true)]
        public long? Offset { get; set; }

        // 单页数量
        [NameInMap("size")]
        [Validation(Required=true)]
        public long? Size { get; set; }

    }

}
