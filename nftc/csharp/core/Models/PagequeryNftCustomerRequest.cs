// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTC.Models
{
    public class PagequeryNftCustomerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 页码
        [NameInMap("page")]
        [Validation(Required=true)]
        public long? Page { get; set; }

        // 分页大小-上限10
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 用户标识
        [NameInMap("id_no")]
        [Validation(Required=true)]
        public string IdNo { get; set; }

        // 用户id类型
        [NameInMap("id_type")]
        [Validation(Required=true)]
        public string IdType { get; set; }

    }

}
