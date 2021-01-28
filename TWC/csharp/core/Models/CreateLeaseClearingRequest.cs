// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeaseClearingRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 融资租赁业务id，由资方控制台创建返回
        [NameInMap("application_id")]
        [Validation(Required=false)]
        public string ApplicationId { get; set; }

        // 清分收款账号 长度不超过64
        [NameInMap("clearing_account")]
        [Validation(Required=true)]
        public string ClearingAccount { get; set; }

        // 清分金额,精确到毫厘，即123400表示12.34元
        [NameInMap("clearing_money")]
        [Validation(Required=true)]
        public long? ClearingMoney { get; set; }

        // 清分订单号 长度不超过128
        [NameInMap("clearing_order_ids")]
        [Validation(Required=true)]
        public List<string> ClearingOrderIds { get; set; }

        // 清分状态,1.足额2.部分3.零
        [NameInMap("clearing_state")]
        [Validation(Required=false)]
        public long? ClearingState { get; set; }

        // 结束时间，格式为"2019-07-31 12:00:00"
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public string EndTime { get; set; }

        // 融资租赁额外字段
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 租赁平台商户Id 长度不可超过50
        [NameInMap("lease_id")]
        [Validation(Required=true)]
        public string LeaseId { get; set; }

        // 订单id 长度不可超过50
        // 
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 还款批次
        [NameInMap("return_index")]
        [Validation(Required=true)]
        public long? ReturnIndex { get; set; }

        // 开始时间，格式为"2019-07-31 12:00:00"
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public string StartTime { get; set; }

        // 是否启动订单的异步处理
        [NameInMap("async")]
        [Validation(Required=false)]
        public long? Async { get; set; }

    }

}
