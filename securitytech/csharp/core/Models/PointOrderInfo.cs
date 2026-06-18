// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 积分商城订单信息
    public class PointOrderInfo : TeaModel {
        // 订单号（子）
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 商品名称
        [NameInMap("goods_name")]
        [Validation(Required=true)]
        public string GoodsName { get; set; }

        // 商品条码
        [NameInMap("goods_num")]
        [Validation(Required=true)]
        public string GoodsNum { get; set; }

        // 商品类型
        // 货物：GOODS
        // 服务：SERVICE
        [NameInMap("goods_type")]
        [Validation(Required=true)]
        public string GoodsType { get; set; }

        // 商品积分
        [NameInMap("goods_point")]
        [Validation(Required=true)]
        public string GoodsPoint { get; set; }

        // 商品供应方信息
        [NameInMap("supplier_info")]
        [Validation(Required=false)]
        public PointSupplierInfo SupplierInfo { get; set; }

    }

}
