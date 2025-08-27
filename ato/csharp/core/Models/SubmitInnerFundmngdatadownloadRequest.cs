// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SubmitInnerFundmngdatadownloadRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资方租户id
        [NameInMap("fund_tenant_id")]
        [Validation(Required=true)]
        public string FundTenantId { get; set; }

        // 开始时间
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public string StartTime { get; set; }

        // 结束时间
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public string EndTime { get; set; }

        // 任务类型
        //  FINANCE_ORDER_TRADE_PROMISE_DETAIL：融资订单交易履约明细
        // FINANCE_ORDER_LOAN_DETAIL：融资订单放款信息
        // 
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
