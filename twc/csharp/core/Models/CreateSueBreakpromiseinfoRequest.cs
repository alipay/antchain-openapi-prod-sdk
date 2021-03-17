// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateSueBreakpromiseinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 合同唯一标识
        // 
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 当事人身份证号
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 当事人姓名
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 当事人手机号
        [NameInMap("phone_number")]
        [Validation(Required=true)]
        public string PhoneNumber { get; set; }

        // 当事人邮箱地址
        [NameInMap("email")]
        [Validation(Required=true)]
        public string Email { get; set; }

        // 诉前Id
        [NameInMap("pre_sue_id")]
        [Validation(Required=true)]
        public string PreSueId { get; set; }

        // 应履约日期，格式为"2019-07-31 12:00:00"
        [NameInMap("promise_date")]
        [Validation(Required=true)]
        public string PromiseDate { get; set; }

        // 宽限期(天数，从应履约日期到进行诉前违约惩戒的自然日数）
        [NameInMap("promise_limit")]
        [Validation(Required=true)]
        public long? PromiseLimit { get; set; }

        // 起诉期，格式为"2019-07-31 12:00:00"
        // 
        [NameInMap("sue_date")]
        [Validation(Required=true)]
        public string SueDate { get; set; }

        // 商户统一社会信用代码或个人身份证
        [NameInMap("initiator_id")]
        [Validation(Required=true)]
        public string InitiatorId { get; set; }

        // 商户或个人名称
        // 
        [NameInMap("initiator_name")]
        [Validation(Required=true)]
        public string InitiatorName { get; set; }

        // 管辖法院名称
        [NameInMap("court_name")]
        [Validation(Required=true)]
        public string CourtName { get; set; }

        // 法院唯一标识
        [NameInMap("court_id")]
        [Validation(Required=true)]
        public string CourtId { get; set; }

        // 违约金额，精确到毫厘，即123400表示12.34元
        [NameInMap("break_promise_money")]
        [Validation(Required=true)]
        public long? BreakPromiseMoney { get; set; }

        // 所属行业
        [NameInMap("business_class")]
        [Validation(Required=true)]
        public string BusinessClass { get; set; }

    }

}
