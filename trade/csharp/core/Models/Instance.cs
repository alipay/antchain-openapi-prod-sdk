// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    // 实例
    public class Instance : TeaModel {
        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 商品code
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 付费类型 PREPAY_BY_MONTH 预付 AFTER_PAY_BY_HOUR 后付 MIX_PAY 混合付
        [NameInMap("charge_type")]
        [Validation(Required=true)]
        public string ChargeType { get; set; }

        // 状态 CREATING 创建中 FAILED 创建失败  STARTED 运行中 STOPPED 已停服  RELEASED 已释放
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
