// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // IP授权订单的销售数据
    public class IPSalesInfo : TeaModel {
        // 终端商品名称
        [NameInMap("goods_name")]
        [Validation(Required=true)]
        public string GoodsName { get; set; }

        // 终端商品图片
        [NameInMap("goods_image")]
        [Validation(Required=true)]
        public string GoodsImage { get; set; }

        // 终端销售渠道
        [NameInMap("sales_channel")]
        [Validation(Required=true)]
        public string SalesChannel { get; set; }

        // 终端商品链接
        [NameInMap("goods_url")]
        [Validation(Required=true)]
        public string GoodsUrl { get; set; }

        // 零售价
        [NameInMap("price")]
        [Validation(Required=true)]
        public string Price { get; set; }

        // 商品销售数量
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 销售金额
        [NameInMap("sales")]
        [Validation(Required=true)]
        public string Sales { get; set; }

        // 实付金额（授权交易）
        [NameInMap("payment")]
        [Validation(Required=true)]
        public string Payment { get; set; }

        // 统计周期开始时间（毫秒时间戳）
        [NameInMap("settlement_begin_time")]
        [Validation(Required=true)]
        public long? SettlementBeginTime { get; set; }

        // 统计周期结束时间（毫秒时间戳）
        [NameInMap("settlement_end_time")]
        [Validation(Required=true)]
        public long? SettlementEndTime { get; set; }

        // 备注信息
        [NameInMap("memo")]
        [Validation(Required=true)]
        public string Memo { get; set; }

        // 数据上传操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 销售数据上传操作时间（毫秒时间戳）
        [NameInMap("operate_time")]
        [Validation(Required=true)]
        public long? OperateTime { get; set; }

        // 商品信息
        [NameInMap("goods_info")]
        [Validation(Required=false)]
        public string GoodsInfo { get; set; }

    }

}
