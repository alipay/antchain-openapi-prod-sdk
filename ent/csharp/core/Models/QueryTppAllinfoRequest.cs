// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    public class QueryTppAllinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 支付宝UID
        [NameInMap("alipay_uid")]
        [Validation(Required=true)]
        public string AlipayUid { get; set; }

        // 排序方式，默认降序
        [NameInMap("order_by")]
        [Validation(Required=false)]
        public string OrderBy { get; set; }

        // 页码
        [NameInMap("page_id")]
        [Validation(Required=true)]
        public long? PageId { get; set; }

        // 页面大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
