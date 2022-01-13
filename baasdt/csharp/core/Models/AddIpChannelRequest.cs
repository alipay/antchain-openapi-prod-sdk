// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class AddIpChannelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础字段
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // ip的链上id
        [NameInMap("ip_id")]
        [Validation(Required=true)]
        public string IpId { get; set; }

        // 渠道信息
        [NameInMap("channel_name")]
        [Validation(Required=true)]
        public string ChannelName { get; set; }

        // 商品授权 0普通授权/1独家授权,本期只支持0
        [NameInMap("authorization_model")]
        [Validation(Required=false)]
        public long? AuthorizationModel { get; set; }

        // 新授权模式，0普通授权，1独家授权，支持多选
        [NameInMap("new_authorization_model")]
        [Validation(Required=false)]
        public List<long?> NewAuthorizationModel { get; set; }

        // 授权类型，衍生品授权；营销授权；商标授权；数字虚拟授权；其他
        [NameInMap("authorization_type")]
        [Validation(Required=false)]
        public List<string> AuthorizationType { get; set; }

        // 计费模式 0:按量 1:按金额
        [NameInMap("pay_mode")]
        [Validation(Required=false)]
        public long? PayMode { get; set; }

        // ip等级  0:经典IP/1:流量IP/2:设计IP
        [NameInMap("ip_level")]
        [Validation(Required=false)]
        public long? IpLevel { get; set; }

        // 交易是否需要确认，默认需要确认
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
