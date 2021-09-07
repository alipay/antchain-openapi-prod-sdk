// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GOODSCHAIN.Models
{
    public class SendGoodsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商品id
        [NameInMap("goods_id")]
        [Validation(Required=true)]
        public string GoodsId { get; set; }

        // 接收人用户id
        [NameInMap("transferee_id")]
        [Validation(Required=true)]
        public string TransfereeId { get; set; }

        // 转让金额，单位分
        [NameInMap("amount")]
        [Validation(Required=false)]
        public long? Amount { get; set; }

    }

}
