// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_2abe765c32934341bd9bb6cc1c8ff589.Models
{
    // 订单商品信息
    public class GoodsInfo : TeaModel {
        // 订单 id
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrderId { get; set; }

        // 租赁机构自己的金融科技租户 id，如果是代理模式此处需要为被代理机构的金融科技租户 id
        [NameInMap("lease_id")]
        [Validation(Required=false, MaxLength=50)]
        public string LeaseId { get; set; }

        // 订单包含的商品信息列表
        [NameInMap("goods_list")]
        [Validation(Required=true)]
        public List<OrderGoodsModel> GoodsList { get; set; }

    }

}
