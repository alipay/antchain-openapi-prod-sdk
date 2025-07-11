// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class NotifyInterestSupplierpolicyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求流水号，每次推送需要唯一
        [NameInMap("request_no")]
        [Validation(Required=true)]
        public string RequestNo { get; set; }

        // 权益订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 保单信息 json字符串
        [NameInMap("policy_info")]
        [Validation(Required=true)]
        public string PolicyInfo { get; set; }

    }

}
