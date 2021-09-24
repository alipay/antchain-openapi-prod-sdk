// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class UpdateIpChannelRequest : TeaModel {
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
        [Validation(Required=true)]
        public long? AuthorizationModel { get; set; }

        // 授权类型，衍生品授权；营销授权；商标授权；数字虚拟授权；其他
        [NameInMap("authorization_type")]
        [Validation(Required=false)]
        public List<string> AuthorizationType { get; set; }

        // 计费模式 0:按量 1:按金额
        [NameInMap("pay_mode")]
        [Validation(Required=true)]
        public long? PayMode { get; set; }

        // ip等级  0:经典IP/1:流量IP/3:设计IP
        [NameInMap("ip_level")]
        [Validation(Required=true)]
        public long? IpLevel { get; set; }

        // 交易是否需要确认，为空则不更新
        [NameInMap("trade_need_confirm")]
        [Validation(Required=false)]
        public bool? TradeNeedConfirm { get; set; }

    }

}
