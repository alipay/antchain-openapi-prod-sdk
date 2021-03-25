// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryMerchantExchangeableequitylistRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链ID
        [NameInMap("chain_id")]
        [Validation(Required=true)]
        public string ChainId { get; set; }

        // 页码
        [NameInMap("page_number")]
        [Validation(Required=true)]
        public string PageNumber { get; set; }

        // 每页数量（不填默认返回50条数据）
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public string PageSize { get; set; }

    }

}
