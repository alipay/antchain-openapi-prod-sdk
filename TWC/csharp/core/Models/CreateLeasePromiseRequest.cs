// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeasePromiseRequest : TeaModel {
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

        // 审核方式,0为系统自动审核，1为人工审核
        [NameInMap("audit_mode")]
        [Validation(Required=true)]
        public long? AuditMode { get; set; }

        // 清分机构金融科技租户ID
        [NameInMap("clearing_org")]
        [Validation(Required=true)]
        public string ClearingOrg { get; set; }

        // 放款机构金融科技租户ID
        [NameInMap("credit_org")]
        [Validation(Required=true)]
        public string CreditOrg { get; set; }

        // 第一次还款时的日期
        [NameInMap("first_pay_date")]
        [Validation(Required=false)]
        public string FirstPayDate { get; set; }

        // 融资机构的阿里uid
        [NameInMap("lease_alipay_uid")]
        [Validation(Required=true)]
        public string LeaseAlipayUid { get; set; }

        // 宽限期，精确到毫秒
        [NameInMap("limit")]
        [Validation(Required=true)]
        public long? Limit { get; set; }

        // 订单id 长度不可超过50
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 应付租金，精确到毫厘，即123400表示12.34元
        [NameInMap("pay_date_list")]
        [Validation(Required=true)]
        public List<string> PayDateList { get; set; }

        // 租赁方承诺额外字段
        [NameInMap("pay_extra_info_list")]
        [Validation(Required=false)]
        public List<string> PayExtraInfoList { get; set; }

        // 应付租金 精确到毫厘，即123400表示12.34元	
        // 
        [NameInMap("pay_money")]
        [Validation(Required=false)]
        public long? PayMoney { get; set; }

        // 应付租金 精确到毫厘，即123400表示12.34元
        [NameInMap("pay_money_list")]
        [Validation(Required=true)]
        public List<long?> PayMoneyList { get; set; }

        // 应付租金的期数
        [NameInMap("pay_period")]
        [Validation(Required=true)]
        public long? PayPeriod { get; set; }

        // 是否启动异步订单处理
        [NameInMap("async")]
        [Validation(Required=false)]
        public long? Async { get; set; }

    }

}
