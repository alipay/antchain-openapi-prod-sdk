// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AICONUMDECISION.Models
{
    public class ImportOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 投放任务ID
        [NameInMap("strategy_task_id")]
        [Validation(Required=true)]
        public long? StrategyTaskId { get; set; }

        // 客户请求流水号
        [NameInMap("request_no")]
        [Validation(Required=true)]
        public string RequestNo { get; set; }

        // 客户号码列表
        [NameInMap("customers")]
        [Validation(Required=true)]
        public List<CustomerItem> Customers { get; set; }

        // 手机号传入格式:PLAIN明文 / MD5 / SHA256，不填即为默认PLAIN
        [NameInMap("mobile_format")]
        [Validation(Required=false)]
        public string MobileFormat { get; set; }

    }

}
