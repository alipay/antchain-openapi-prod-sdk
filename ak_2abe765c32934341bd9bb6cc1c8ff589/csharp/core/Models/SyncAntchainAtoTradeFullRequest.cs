// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_2abe765c32934341bd9bb6cc1c8ff589.Models
{
    public class SyncAntchainAtoTradeFullRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 购买用户信息
        [NameInMap("user_info")]
        [Validation(Required=true)]
        public UserSyncInfo UserInfo { get; set; }

        // 主订单信息
        [NameInMap("order_info")]
        [Validation(Required=true)]
        public OrderInfo OrderInfo { get; set; }

        // 订单包含的商品信息列表
        [NameInMap("goods_info")]
        [Validation(Required=true)]
        public GoodsInfo GoodsInfo { get; set; }

        // 订单还款计划
        [NameInMap("promise_info")]
        [Validation(Required=true)]
        public PromiseInfo PromiseInfo { get; set; }

    }

}
