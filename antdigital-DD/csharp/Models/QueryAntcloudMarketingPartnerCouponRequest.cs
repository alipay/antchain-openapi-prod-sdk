// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    public class QueryAntcloudMarketingPartnerCouponRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 目标租户2088 ID，查询发放给该租户的优惠券
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 商品规格Code列表
        [NameInMap("product_codes")]
        [Validation(Required=true)]
        public List<string> ProductCodes { get; set; }

        // 币种，目前仅支持CNY、USD
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 优惠券类型；不传或空列表表示全部类型
        [NameInMap("coupon_type")]
        [Validation(Required=false)]
        public List<string> CouponType { get; set; }

        // 优惠券状态；不传或空列表表示全部状态.
        // AVAILABLE正常/可用状态
        // EXHAUSTED 已使用完
        // ABANDONED 已作废
        // EXPIRED 已过期
        [NameInMap("coupon_status")]
        [Validation(Required=false)]
        public List<string> CouponStatus { get; set; }

        // 查询区间开始时间
        [NameInMap("start_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 查询区间结束时间
        [NameInMap("end_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // 页码，从1开始
        [NameInMap("page_no")]
        [Validation(Required=true)]
        public long? PageNo { get; set; }

        // 每页记录数，范围1～100
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
