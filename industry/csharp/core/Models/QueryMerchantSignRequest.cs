// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INDUSTRY.Models
{
    public class QueryMerchantSignRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // source, 由中台为业务方分配, 标识业务来源
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 申请单id, 跟merchant_user_id不能同时为空
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 平台方下的用户id, 保持唯一，跟order_id不能同时为空; 如果只传该字段, 获取该用户id的最新一次进件结果
        [NameInMap("merchant_user_id")]
        [Validation(Required=false)]
        public string MerchantUserId { get; set; }

    }

}
