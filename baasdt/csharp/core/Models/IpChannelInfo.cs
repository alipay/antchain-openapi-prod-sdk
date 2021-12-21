// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // ip的渠道信息
    public class IpChannelInfo : TeaModel {
        // 渠道名字
        [NameInMap("channel_name")]
        [Validation(Required=true)]
        public string ChannelName { get; set; }

        // 授权模式 商品授权 0普通授权/1独家授权  本期只有0
        [NameInMap("authorization_mode")]
        [Validation(Required=true)]
        public long? AuthorizationMode { get; set; }

        // 计费模式 0:按量 1:按金额
        [NameInMap("pay_mode")]
        [Validation(Required=true)]
        public long? PayMode { get; set; }

        // ip等级 （5位数字） 对应a，0:经典IP/1:流量IP/2:设计IP
        [NameInMap("ip_level")]
        [Validation(Required=true)]
        public long? IpLevel { get; set; }

        // 商品状态（0:待上架，1:上架，2:下架）
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 交易是否需要确认
        [NameInMap("trade_need_confirm")]
        [Validation(Required=false)]
        public bool? TradeNeedConfirm { get; set; }

        // 保底金区间，0：0；1：10万以下；2:10-30万；3:30-50万；4:50万以上
        [NameInMap("guarantee_range")]
        [Validation(Required=false)]
        public long? GuaranteeRange { get; set; }

        // 交易模式
        [NameInMap("ip_trade_mode")]
        [Validation(Required=false)]
        public IPTradeMode IpTradeMode { get; set; }

    }

}
