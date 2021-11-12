// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // IP淘宝店铺信息
    public class IPShopInfo : TeaModel {
        // 授权申请的内部编码
        [NameInMap("item_code")]
        [Validation(Required=true)]
        public string ItemCode { get; set; }

        // 淘宝卖家的官方昵称
        [NameInMap("seller_nick")]
        [Validation(Required=true)]
        public string SellerNick { get; set; }

        // 授权渠道名称
        [NameInMap("channel_name")]
        [Validation(Required=true)]
        public string ChannelName { get; set; }

        // 数据授权方式
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

        // 授权启始时间戳(unix毫秒)
        [NameInMap("auth_start")]
        [Validation(Required=true)]
        public long? AuthStart { get; set; }

        // 授权终止时间戳(unix毫秒)
        [NameInMap("auth_end")]
        [Validation(Required=true)]
        public long? AuthEnd { get; set; }

        // 授权状态(1: Init, 2: Success, 3: Expired)
        [NameInMap("auth_status")]
        [Validation(Required=true)]
        public long? AuthStatus { get; set; }

        // 授权链接
        [NameInMap("auth_url")]
        [Validation(Required=true)]
        public string AuthUrl { get; set; }

    }

}
