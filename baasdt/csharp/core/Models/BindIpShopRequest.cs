// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class BindIpShopRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // IP商家的链上账户Id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 淘宝卖家官方昵称
        [NameInMap("seller_nick")]
        [Validation(Required=true)]
        public string SellerNick { get; set; }

        // 授权渠道名称(1: 淘宝网)
        [NameInMap("channel_type")]
        [Validation(Required=true)]
        public long? ChannelType { get; set; }

        // 数据授权方式(1: 淘宝开放平台)
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public long? AuthType { get; set; }

    }

}
