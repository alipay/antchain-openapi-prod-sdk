// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // ip的渠道信息带上sku信息
    public class IpChannelWithSku : TeaModel {
        // 渠道名字
        [NameInMap("channel_name")]
        [Validation(Required=true)]
        public string ChannelName { get; set; }

        // 授权模式 商品授权 0普通授权/1独家授权 本期只有0
        // 
        [NameInMap("authorization_mode")]
        [Validation(Required=true)]
        public long? AuthorizationMode { get; set; }

        // 计费模式 0:按量 1:按金额
        // 
        [NameInMap("pay_mode")]
        [Validation(Required=true)]
        public long? PayMode { get; set; }

        // ip等级  0:经典IP/1:流量IP/2:设计IP
        [NameInMap("ip_level")]
        [Validation(Required=true)]
        public long? IpLevel { get; set; }

        // sku信息
        [NameInMap("sku_info")]
        [Validation(Required=true)]
        public List<IpSkuInfo> SkuInfo { get; set; }

        // 商品状态（0:待上架，1:上架，2:下架）
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 交易是否需要确认
        [NameInMap("trade_need_confirm")]
        [Validation(Required=false)]
        public bool? TradeNeedConfirm { get; set; }

        // 授权类型
        [NameInMap("authorization_type")]
        [Validation(Required=false)]
        public List<string> AuthorizationType { get; set; }

    }

}
