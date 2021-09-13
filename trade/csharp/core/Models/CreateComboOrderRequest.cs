// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    public class CreateComboOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 场景接入码，中台分配
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 业务流水号，用于幂等
        [NameInMap("biz_no")]
        [Validation(Required=true)]
        public string BizNo { get; set; }

        // 套餐编码
        [NameInMap("combo_code")]
        [Validation(Required=true)]
        public string ComboCode { get; set; }

        // 租户ID，和租户名二选一必填
        // 
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 8位租户名，和租户ID二选一必填
        // 
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // 操作人ID，为空则等于当前租户ID
        [NameInMap("operator_id")]
        [Validation(Required=false)]
        public string OperatorId { get; set; }

        // 订购周期，当套餐中包含包周期型的商品，必填
        [NameInMap("duration")]
        [Validation(Required=false)]
        public OrderDuration Duration { get; set; }

        // 优惠券ID
        [NameInMap("coupon_id")]
        [Validation(Required=false)]
        public string CouponId { get; set; }

        // [{"instance_key":"isvId","instance_value":"邀请码},{"instance_key":"policyId","instance_value":"政策id}]
        [NameInMap("instance_labels")]
        [Validation(Required=false)]
        public List<InstanceLabel> InstanceLabels { get; set; }

    }

}
