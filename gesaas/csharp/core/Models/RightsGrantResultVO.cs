// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    // 权益发放结果
    public class RightsGrantResultVO : TeaModel {
        // 过期时间
        [NameInMap("expire_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ExpireTime { get; set; }

        // 生效时间
        [NameInMap("effect_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EffectTime { get; set; }

        // 发放状态：
        // GRANTING：发放处理中 GRANT_SUCCESS：发放成功 GRANT_FAIL：发放失败
        [NameInMap("grant_status")]
        [Validation(Required=true)]
        public string GrantStatus { get; set; }

        // 订单详情列表
        [NameInMap("order_details")]
        [Validation(Required=false)]
        public List<OrderDetail> OrderDetails { get; set; }

    }

}
