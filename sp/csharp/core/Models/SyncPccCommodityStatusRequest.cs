// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SP.Models
{
    public class SyncPccCommodityStatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("product_access_code")]
        [Validation(Required=false)]
        public string ProductAccessCode { get; set; }

        // 主商品编码
        [NameInMap("commodity_code")]
        [Validation(Required=true)]
        public string CommodityCode { get; set; }

        // 商品名称
        [NameInMap("commodity_name")]
        [Validation(Required=true)]
        public string CommodityName { get; set; }

        // 商品服务模式，PLATFORM-平台型
        [NameInMap("commodity_service_mode")]
        [Validation(Required=true)]
        public string CommodityServiceMode { get; set; }

        // 商品计费模式，PREPAY_BY_MONTH-包年包月 AFTER_PAY_BY_HOUR-按量付费
        [NameInMap("commodity_charge_type")]
        [Validation(Required=true)]
        public string CommodityChargeType { get; set; }

        // 商品状态，ONLINE-上架，OFFLINE-下架
        [NameInMap("commodity_status")]
        [Validation(Required=true)]
        public string CommodityStatus { get; set; }

        // 产品干系人
        [NameInMap("product_rel_uses")]
        [Validation(Required=true)]
        public List<RelUser> ProductRelUses { get; set; }

    }

}
