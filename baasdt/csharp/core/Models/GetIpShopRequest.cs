// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class GetIpShopRequest : TeaModel {
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

        // 宝贝Id(可以是ItemId, 也可以是SkuId或其他Id)
        [NameInMap("good_id")]
        [Validation(Required=true)]
        public string GoodId { get; set; }

        // 类型(1: ItemId)
        [NameInMap("id_type")]
        [Validation(Required=true)]
        public long? IdType { get; set; }

        // 淘宝卖家的官方昵称
        [NameInMap("seller_nick")]
        [Validation(Required=true)]
        public string SellerNick { get; set; }

    }

}
