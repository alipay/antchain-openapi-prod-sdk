// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class SetIpCodeinfoRequest : TeaModel {
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

        // 正版码对应的订单上版权方的账户链上ID
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 订单ID
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 正版码商品信息配置列表
        [NameInMap("goods_info_list")]
        [Validation(Required=false)]
        public List<IPCodeGoodsInfo> GoodsInfoList { get; set; }

        // 正版码资源位配置信息列表
        [NameInMap("ad_info_list")]
        [Validation(Required=false)]
        public List<IPCodeAdvertisingInfo> AdInfoList { get; set; }

    }

}
