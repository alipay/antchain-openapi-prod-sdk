// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryMypointsMerchantbalanceResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 积分库可用余额
        [NameInMap("budget_available_balance")]
        [Validation(Required=false)]
        public long? BudgetAvailableBalance { get; set; }

        // 预算库余额
        [NameInMap("budget_balance")]
        [Validation(Required=false)]
        public long? BudgetBalance { get; set; }

        // 预算库代码
        [NameInMap("budget_code")]
        [Validation(Required=false)]
        public string BudgetCode { get; set; }

        // 商户的支付宝商家ID
        [NameInMap("pid")]
        [Validation(Required=false)]
        public string Pid { get; set; }

        // 积分库余额
        [NameInMap("point_lib_balance")]
        [Validation(Required=false)]
        public long? PointLibBalance { get; set; }

        // 积分库代码
        [NameInMap("point_lib_code")]
        [Validation(Required=false)]
        public string PointLibCode { get; set; }

        // 商户的金融云租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

    }

}
