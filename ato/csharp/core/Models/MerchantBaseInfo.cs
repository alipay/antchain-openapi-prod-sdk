// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 智能体二期-用户基础信息
    public class MerchantBaseInfo : TeaModel {
        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 品牌名称
        [NameInMap("brand_name")]
        [Validation(Required=false)]
        public string BrandName { get; set; }

        // 品牌logo
        [NameInMap("brand_logo")]
        [Validation(Required=false)]
        public string BrandLogo { get; set; }

        // 商家小程序链接
        [NameInMap("merchant_app_link")]
        [Validation(Required=false)]
        public string MerchantAppLink { get; set; }

        // 商家更新电话
        [NameInMap("merchant_phone")]
        [Validation(Required=false)]
        public string MerchantPhone { get; set; }

        // 提交时间
        [NameInMap("submit_time")]
        [Validation(Required=false)]
        public string SubmitTime { get; set; }

        // 审核状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 品牌名称-审核中
        [NameInMap("brand_name_snapshot")]
        [Validation(Required=false)]
        public string BrandNameSnapshot { get; set; }

        // 品牌logo-审核中
        [NameInMap("brand_logo_snapshot")]
        [Validation(Required=false)]
        public string BrandLogoSnapshot { get; set; }

        // 商家小程序链接_审核中
        [NameInMap("merchant_app_link_snapshot")]
        [Validation(Required=false)]
        public string MerchantAppLinkSnapshot { get; set; }

        // 商家电话_审核中
        [NameInMap("merchant_phone_snapshot")]
        [Validation(Required=false)]
        public string MerchantPhoneSnapshot { get; set; }

        // 更新时间_审核中
        [NameInMap("submit_time_snapshot")]
        [Validation(Required=false)]
        public string SubmitTimeSnapshot { get; set; }

        // 驳回原因_审核中
        [NameInMap("refuse_reason_snapshot")]
        [Validation(Required=false)]
        public string RefuseReasonSnapshot { get; set; }

    }

}
