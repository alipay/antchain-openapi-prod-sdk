// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTTS.Models
{
    public class PagequeryDacDepositRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 查询第几页，从1开始
        [NameInMap("current")]
        [Validation(Required=true)]
        public long? Current { get; set; }

        // 每页展示多少条，默认10
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 外部用户唯一id
        [NameInMap("external_customer_id")]
        [Validation(Required=true)]
        public string ExternalCustomerId { get; set; }

    }

}
