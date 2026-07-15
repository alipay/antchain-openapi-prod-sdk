// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    public class ExecBaasPromotionCouponRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务ID
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // openId
        [NameInMap("open_id")]
        [Validation(Required=true)]
        public string OpenId { get; set; }

        // appId
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // 活动ID，由运营线下通知分配
        [NameInMap("activity_id")]
        [Validation(Required=true)]
        public string ActivityId { get; set; }

        // 奖品ID，需要指定奖品抽奖时传入
        [NameInMap("prize_id")]
        [Validation(Required=false)]
        public string PrizeId { get; set; }

    }

}
