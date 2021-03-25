// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class OpenConsumecardGoodstocustomRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequest BaseRequest { get; set; }

        // 商品ID
        [NameInMap("goods_id")]
        [Validation(Required=true)]
        public string GoodsId { get; set; }

        // 开放权限的账户id
        [NameInMap("open_account_id")]
        [Validation(Required=true)]
        public string OpenAccountId { get; set; }

        // true授权，false解除授权
        [NameInMap("open")]
        [Validation(Required=true)]
        public bool? Open { get; set; }

    }

}
