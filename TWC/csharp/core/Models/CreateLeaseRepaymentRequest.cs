// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeaseRepaymentRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 融资租赁业务id，由资方控制台生成返回
        [NameInMap("application_id")]
        [Validation(Required=false)]
        public string ApplicationId { get; set; }

        // 融资租赁租户还款额外字段
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 是否最终订单还款结束
        [NameInMap("is_finish")]
        [Validation(Required=true)]
        public bool? IsFinish { get; set; }

        // 租赁平台商户Id 长度不可超过50
        [NameInMap("lease_id")]
        [Validation(Required=true)]
        public string LeaseId { get; set; }

        // 订单id 长度不可超过50
        // 
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 逾期天数,支用到期日开始计算
        [NameInMap("overdue_day")]
        [Validation(Required=false)]
        public long? OverdueDay { get; set; }

        // 逾期应还款总额,本金+利息+逾期利息,精确到毫厘，即123400表示12.34元
        [NameInMap("overdue_money")]
        [Validation(Required=false)]
        public long? OverdueMoney { get; set; }

        // 逾期利率（日利率）,精确到小数点后四位 12.34% 表示为1234
        [NameInMap("overdue_rate")]
        [Validation(Required=false)]
        public long? OverdueRate { get; set; }

        // 逾期状态,暂时都以0处理，目前不处理
        [NameInMap("overdue_status")]
        [Validation(Required=false)]
        public long? OverdueStatus { get; set; }

        // 剩余应还金额，精确到毫厘，即123400表示12.34元
        [NameInMap("remain_return_money")]
        [Validation(Required=true)]
        public long? RemainReturnMoney { get; set; }

        // 剩余应还期数
        // 
        [NameInMap("remain_return_term")]
        [Validation(Required=true)]
        public long? RemainReturnTerm { get; set; }

        // 每次还款流水凭证，需要融资方确认，id一样则不处理
        [NameInMap("repayment_unique_id")]
        [Validation(Required=true)]
        public string RepaymentUniqueId { get; set; }

        // 还款结果简要描述,长度不超过256
        [NameInMap("return_description")]
        [Validation(Required=true)]
        public string ReturnDescription { get; set; }

        // 还款批次
        // 
        [NameInMap("return_index")]
        [Validation(Required=true)]
        public long? ReturnIndex { get; set; }

        // 还款总额,本金+利息，精确到毫厘，即123400表示12.34元
        [NameInMap("return_money")]
        [Validation(Required=true)]
        public long? ReturnMoney { get; set; }

        // 还款结果状态,1.成功 2.失败
        [NameInMap("return_status")]
        [Validation(Required=true)]
        public long? ReturnStatus { get; set; }

        // 还款日期，格式为"2019-07-31 12:00:00"
        [NameInMap("return_time")]
        [Validation(Required=true)]
        public string ReturnTime { get; set; }

        // 还款来源,1.共管账号，2.网商清分
        [NameInMap("source")]
        [Validation(Required=true)]
        public long? Source { get; set; }

        // 逾期后还款状态,1未还款,2已还款
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 是否启动订单的异步处理
        [NameInMap("async")]
        [Validation(Required=false)]
        public long? Async { get; set; }

    }

}
