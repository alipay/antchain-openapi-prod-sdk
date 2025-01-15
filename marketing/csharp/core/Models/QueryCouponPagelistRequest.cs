// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MARKETING.Models
{
    public class QueryCouponPagelistRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 租户ID	
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 商品code	
        // 可多选 多个产品间用 , 分隔  如
        // ABC,DEF,GHI
        [NameInMap("product_codes")]
        [Validation(Required=true)]
        public string ProductCodes { get; set; }

        // 优惠券类型:VOUCHER 抵用券, CERTAIN 满减券,DISCOUNT 折扣券	
        // 
        [NameInMap("coupon_type")]
        [Validation(Required=false)]
        public string CouponType { get; set; }

        // 当前页，默认第一页
        [NameInMap("page_no")]
        [Validation(Required=false)]
        public long? PageNo { get; set; }

        // 每页显示数量，默认10条	
        // 
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 币种，不传默认CNY人民币。
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

    }

}
