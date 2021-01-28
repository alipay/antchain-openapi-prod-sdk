// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeaseVerifyinfoRequest : TeaModel {
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

        // 是否启动订单的异步处理
        [NameInMap("async")]
        [Validation(Required=false)]
        public long? Async { get; set; }

        // 放款账户
        [NameInMap("card_number")]
        [Validation(Required=false)]
        public string CardNumber { get; set; }

        // 授信终止时间，格式为"2019-07-31 12:00:00"
        [NameInMap("credit_end_time")]
        [Validation(Required=false)]
        public string CreditEndTime { get; set; }

        // 授信额度，精确到毫厘，即123400表示12.34元
        [NameInMap("credit_limit")]
        [Validation(Required=false)]
        public long? CreditLimit { get; set; }

        // 授信起始时间，格式为"2019-07-31 12:00:00"
        [NameInMap("credit_start_time")]
        [Validation(Required=false)]
        public string CreditStartTime { get; set; }

        // 融资租赁审贷信息额外字段
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 承租企业统一社会信用代码 长度不可超过50
        [NameInMap("lease_corp_id")]
        [Validation(Required=false)]
        public string LeaseCorpId { get; set; }

        // 承租企业名称 长度不可超过50
        [NameInMap("lease_corp_name")]
        [Validation(Required=false)]
        public string LeaseCorpName { get; set; }

        // 承租法定代表人姓名 长度不可超过50
        [NameInMap("lease_corp_owner_name")]
        [Validation(Required=false)]
        public string LeaseCorpOwnerName { get; set; }

        // 租赁服务平台id
        [NameInMap("lease_id")]
        [Validation(Required=true)]
        public string LeaseId { get; set; }

        // 放款流水单号
        [NameInMap("loan")]
        [Validation(Required=false)]
        public string Loan { get; set; }

        // 订单id 长度不可超过50
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 还款计划文件哈希
        [NameInMap("pay_back_hash")]
        [Validation(Required=false)]
        public string PayBackHash { get; set; }

        // 还款计划文件存证交易哈希
        [NameInMap("pay_back_tx_hash")]
        [Validation(Required=false)]
        public string PayBackTxHash { get; set; }

        // 承租人身份证
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 承租人姓名 长度不可超过10
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 承租人手机号
        [NameInMap("user_phone_number")]
        [Validation(Required=false)]
        public string UserPhoneNumber { get; set; }

        // 是否通过，0表示不通过，1表示通过
        [NameInMap("verify_result")]
        [Validation(Required=true)]
        public long? VerifyResult { get; set; }

        // 付款汇款凭证 民盛转账成功后上传
        [NameInMap("voucher")]
        [Validation(Required=false)]
        public string Voucher { get; set; }

        // 拒绝的理由
        [NameInMap("verify_refuse_desc")]
        [Validation(Required=false)]
        public string VerifyRefuseDesc { get; set; }

    }

}
