// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeaseCreditpromiseRequest : TeaModel {
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

        // 融资租赁承诺额外字段
        [NameInMap("credit_promise_extra_info_list")]
        [Validation(Required=false)]
        public List<string> CreditPromiseExtraInfoList { get; set; }

        // 租赁平台金融科技id
        [NameInMap("lease_id")]
        [Validation(Required=true)]
        public string LeaseId { get; set; }

        // 订单id 长度不可超过50
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 垫付金额
        [NameInMap("pay_in_advance_money")]
        [Validation(Required=false)]
        public long? PayInAdvanceMoney { get; set; }

        // 垫付金额，精确到毫厘，即123400表示12.34元
        [NameInMap("pay_in_advance_money_list")]
        [Validation(Required=false)]
        public List<long?> PayInAdvanceMoneyList { get; set; }

        // 垫付日期
        [NameInMap("pay_in_advance_time")]
        [Validation(Required=false)]
        public string PayInAdvanceTime { get; set; }

        // 垫付日  格式为2019-8-31 12:00:00
        [NameInMap("pay_in_advance_time_list")]
        [Validation(Required=true)]
        public List<string> PayInAdvanceTimeList { get; set; }

        // 根据融资租赁合同及其补充协议哈希
        [NameInMap("promise_hash")]
        [Validation(Required=true)]
        public string PromiseHash { get; set; }

        // 根据融资租赁合同及其补充协议存证交易hash
        [NameInMap("promise_tx_hash")]
        [Validation(Required=true)]
        public string PromiseTxHash { get; set; }

        // 归还金额
        [NameInMap("return_money")]
        [Validation(Required=false)]
        public long? ReturnMoney { get; set; }

        // 还款金额，精确到毫厘，即123400表示12.34元
        [NameInMap("return_money_list")]
        [Validation(Required=true)]
        public List<long?> ReturnMoneyList { get; set; }

        // 还款比例，精确到小数点后四位 12.34% 表示为1234
        [NameInMap("return_rate")]
        [Validation(Required=false)]
        public long? ReturnRate { get; set; }

        // 归还日，格式为"2019-07-31 12:00:00"
        [NameInMap("return_time")]
        [Validation(Required=false)]
        public string ReturnTime { get; set; }

        // 归还日，格式为"2019-07-31 12:00:00"
        [NameInMap("return_time_list")]
        [Validation(Required=true)]
        public List<string> ReturnTimeList { get; set; }

        // 是否启动异步订单处理
        [NameInMap("async")]
        [Validation(Required=false)]
        public long? Async { get; set; }

    }

}
