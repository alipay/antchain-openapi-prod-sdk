// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 用户线索根据-平台订单、派发和备注返回结果信息
    public class PlatformOrderLeadResultInfo : TeaModel {
        // 场景名称
        [NameInMap("scene_name")]
        [Validation(Required=false)]
        public string SceneName { get; set; }

        // 平台订单号
        [NameInMap("platform_order_id")]
        [Validation(Required=false)]
        public string PlatformOrderId { get; set; }

        // 平台订单派发id
        [NameInMap("delivery_id")]
        [Validation(Required=false)]
        public string DeliveryId { get; set; }

        // 商品名称
        [NameInMap("product_title")]
        [Validation(Required=false)]
        public string ProductTitle { get; set; }

        // 订单提交时间
        [NameInMap("order_create_time")]
        [Validation(Required=false)]
        public string OrderCreateTime { get; set; }

        // 用户姓名（脱敏）
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 用户手机号（脱敏）
        [NameInMap("user_phone")]
        [Validation(Required=false)]
        public string UserPhone { get; set; }

        // 商家品牌名称
        [NameInMap("merchant_brand_name")]
        [Validation(Required=false)]
        public string MerchantBrandName { get; set; }

        // 商家品牌logoUrl
        [NameInMap("merchant_brand_logo_url")]
        [Validation(Required=false)]
        public string MerchantBrandLogoUrl { get; set; }

        // 审核状态
        [NameInMap("approval_status")]
        [Validation(Required=false)]
        public string ApprovalStatus { get; set; }

        // 备注
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

    }

}
