// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class SetConsumecardGoodscustompriceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

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

        // 设置一客一价的目标账户id
        [NameInMap("open_account_id")]
        [Validation(Required=true)]
        public string OpenAccountId { get; set; }

        // 设置的价格(单位:元,精确到分)
        [NameInMap("price")]
        [Validation(Required=true)]
        public string Price { get; set; }

    }

}
