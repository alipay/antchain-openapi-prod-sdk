// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTX.Models
{
    public class PagequeryNftCustomerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 当前页码
        [NameInMap("page")]
        [Validation(Required=true)]
        public long? Page { get; set; }

        // 页长
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 用户手机号或支付宝UID
        [NameInMap("id_no")]
        [Validation(Required=true)]
        public string IdNo { get; set; }

        // 用户ID类型，和id_no对应
        [NameInMap("id_type")]
        [Validation(Required=true)]
        public string IdType { get; set; }

    }

}
