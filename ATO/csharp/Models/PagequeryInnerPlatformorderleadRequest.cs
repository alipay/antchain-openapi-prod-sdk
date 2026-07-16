// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class PagequeryInnerPlatformorderleadRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 服务商租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 场景名称
        [NameInMap("scene_name")]
        [Validation(Required=false)]
        public string SceneName { get; set; }

        // 商品名称
        [NameInMap("product_title")]
        [Validation(Required=false)]
        public string ProductTitle { get; set; }

        // 用户手机号
        [NameInMap("user_phone")]
        [Validation(Required=false)]
        public string UserPhone { get; set; }

        // 商家品牌名称
        [NameInMap("merchant_brand_name")]
        [Validation(Required=false)]
        public string MerchantBrandName { get; set; }

        // 订单提交开始时间
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public string StartTime { get; set; }

        // 订单提交结束时间
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public string EndTime { get; set; }

        // 审核状态
        [NameInMap("approval_status")]
        [Validation(Required=false)]
        public string ApprovalStatus { get; set; }

        // 分页参数
        [NameInMap("page_info")]
        [Validation(Required=false)]
        public PageQuery PageInfo { get; set; }

    }

}
