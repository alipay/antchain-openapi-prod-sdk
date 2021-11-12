// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 授权订单的逐条销售数据
    public class IPSalesEvery : TeaModel {
        // 电商系统订单编号
        [NameInMap("out_order_id")]
        [Validation(Required=true)]
        public string OutOrderId { get; set; }

        // 数据渠道类型：0 手动录入，1 淘宝开放平台
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public long? DataType { get; set; }

        // 实际销售渠道
        [NameInMap("sales_channel")]
        [Validation(Required=false)]
        public string SalesChannel { get; set; }

        // 订单创建时间
        [NameInMap("order_create_time")]
        [Validation(Required=true)]
        public long? OrderCreateTime { get; set; }

        // 订单完成时间
        [NameInMap("order_finish_time")]
        [Validation(Required=true)]
        public long? OrderFinishTime { get; set; }

        // 本订单销售金额，单位元
        [NameInMap("sales")]
        [Validation(Required=true)]
        public string Sales { get; set; }

        // 本订单退款金额，单位元
        [NameInMap("refund_sales")]
        [Validation(Required=false)]
        public string RefundSales { get; set; }

        // 店铺名称
        [NameInMap("shop_name")]
        [Validation(Required=true)]
        public string ShopName { get; set; }

        // 商品ID/SKUID/商品编码
        [NameInMap("goods_id")]
        [Validation(Required=true)]
        public string GoodsId { get; set; }

        // 商品名称
        [NameInMap("goods_name")]
        [Validation(Required=true)]
        public string GoodsName { get; set; }

        // 商品规格
        [NameInMap("goods_specification")]
        [Validation(Required=true)]
        public string GoodsSpecification { get; set; }

        // 本订单卖出的商品数量
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 备注信息
        [NameInMap("memo")]
        [Validation(Required=false)]
        public string Memo { get; set; }

    }

}
