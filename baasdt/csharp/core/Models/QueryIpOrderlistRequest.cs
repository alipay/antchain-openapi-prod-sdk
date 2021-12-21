// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryIpOrderlistRequest : TeaModel {
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
        public BaseRequestInfo BaseRequest { get; set; }

        // 买方ID
        [NameInMap("buyer_id")]
        [Validation(Required=false)]
        public string BuyerId { get; set; }

        // 卖方ID
        [NameInMap("seller_id")]
        [Validation(Required=false)]
        public string SellerId { get; set; }

        // IP id
        [NameInMap("ip_id")]
        [Validation(Required=false)]
        public string IpId { get; set; }

        // 订单ID
        [NameInMap("ip_order_id")]
        [Validation(Required=false)]
        public string IpOrderId { get; set; }

        // 订单状态
        [NameInMap("order_status")]
        [Validation(Required=false)]
        public long? OrderStatus { get; set; }

        // 根据IP名称模糊查询
        [NameInMap("ip_name")]
        [Validation(Required=false)]
        public string IpName { get; set; }

        // 卖方名称，根据卖方名称模糊查询
        [NameInMap("seller_name")]
        [Validation(Required=false)]
        public string SellerName { get; set; }

        // 买方名称，根据卖方名称模糊查询
        [NameInMap("buyer_name")]
        [Validation(Required=false)]
        public string BuyerName { get; set; }

        // 交易类型：1 套餐交易， 2 定向授权
        [NameInMap("trade_type")]
        [Validation(Required=false)]
        public long? TradeType { get; set; }

        // 0 IP交易，1 增值服务交易
        [NameInMap("goods_type")]
        [Validation(Required=false)]
        public long? GoodsType { get; set; }

        // 收费模式：0 销售抽拥，1 按量计费
        [NameInMap("charge_type")]
        [Validation(Required=false)]
        public long? ChargeType { get; set; }

        // 查询订单授权开始时间
        [NameInMap("auth_start_time")]
        [Validation(Required=false)]
        public long? AuthStartTime { get; set; }

        // 查询订单授权结束时间
        [NameInMap("auth_end_time")]
        [Validation(Required=false)]
        public long? AuthEndTime { get; set; }

        // 订单创建时间开始范围
        [NameInMap("create_start_time")]
        [Validation(Required=false)]
        public long? CreateStartTime { get; set; }

        // 订单创建时间结束范围
        [NameInMap("create_end_time")]
        [Validation(Required=false)]
        public long? CreateEndTime { get; set; }

        // 排序字段
        [NameInMap("order_by")]
        [Validation(Required=true)]
        public string OrderBy { get; set; }

        // 数据排序顺序：正序还是倒序
        [NameInMap("order")]
        [Validation(Required=true)]
        public string Order { get; set; }

        // 页码
        [NameInMap("page_number")]
        [Validation(Required=true)]
        public long? PageNumber { get; set; }

        // 每页数据量大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 渠道名称
        [NameInMap("channel_name")]
        [Validation(Required=false)]
        public string ChannelName { get; set; }

        // 是否查询0授权费率的订单，true则查0费率订单，false则查非0费率订单
        [NameInMap("zero_auth_rate")]
        [Validation(Required=false)]
        public bool? ZeroAuthRate { get; set; }

    }

}
