// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 实际售卖的商品信息
    public class IPOrderGoods : TeaModel {
        // 订单ID
        [NameInMap("ip_order_id")]
        [Validation(Required=false)]
        public string IpOrderId { get; set; }

        // 数据渠道类型：0 手动录入，1 淘宝开放平台
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public long? DataType { get; set; }

        // ID类型
        [NameInMap("id_type")]
        [Validation(Required=true)]
        public long? IdType { get; set; }

        // 商品ID
        [NameInMap("goods_id")]
        [Validation(Required=true)]
        public string GoodsId { get; set; }

        // 商品名称
        [NameInMap("goods_name")]
        [Validation(Required=true)]
        public string GoodsName { get; set; }

        // 商家昵称
        [NameInMap("nick")]
        [Validation(Required=false)]
        public string Nick { get; set; }

    }

}
