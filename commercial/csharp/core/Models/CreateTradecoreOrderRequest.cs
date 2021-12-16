// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    public class CreateTradecoreOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // seller
        [NameInMap("seller")]
        [Validation(Required=true)]
        public string Seller { get; set; }

        // 开发环境可以用：0016010039
        [NameInMap("sp_id")]
        [Validation(Required=true)]
        public string SpId { get; set; }

        // product_name
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 开发环境可以用：3000.00  单位是元
        [NameInMap("amt")]
        [Validation(Required=true)]
        public string Amt { get; set; }

        // ccy
        [NameInMap("ccy")]
        [Validation(Required=false)]
        public string Ccy { get; set; }

        // 固定填写OFFICIAL_SITE
        [NameInMap("order_origin")]
        [Validation(Required=true)]
        public string OrderOrigin { get; set; }

        // LICENSE(软件许可),RENEW(软件许可更新和技术支持),SUBSCRIBE(软件订阅),PRE(包年包月),POST(按量付费),SERVICE(服务型)
        [NameInMap("pay_method")]
        [Validation(Required=true)]
        public string PayMethod { get; set; }

        // order_duration
        [NameInMap("order_duration")]
        [Validation(Required=true)]
        public string OrderDuration { get; set; }

        // commodity_name
        [NameInMap("commodity_name")]
        [Validation(Required=true)]
        public string CommodityName { get; set; }

        // 开发环境可以用：10007
        [NameInMap("spec_code")]
        [Validation(Required=true)]
        public string SpecCode { get; set; }

        // spec_name
        [NameInMap("spec_name")]
        [Validation(Required=true)]
        public string SpecName { get; set; }

        // spec_desc
        [NameInMap("spec_desc")]
        [Validation(Required=false)]
        public string SpecDesc { get; set; }

        // order_detail
        [NameInMap("order_detail")]
        [Validation(Required=false)]
        public string OrderDetail { get; set; }

        // spec_props
        [NameInMap("spec_props")]
        [Validation(Required=true)]
        public List<Pair> SpecProps { get; set; }

        // ext_params
        [NameInMap("ext_params")]
        [Validation(Required=false)]
        public List<Pair> ExtParams { get; set; }

    }

}
