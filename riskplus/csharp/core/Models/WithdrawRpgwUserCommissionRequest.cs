// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class WithdrawRpgwUserCommissionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 提现业务单号
        [NameInMap("order_number")]
        [Validation(Required=true)]
        public string OrderNumber { get; set; }

        // 任务单号
        [NameInMap("user_order_numbers")]
        [Validation(Required=true)]
        public string UserOrderNumbers { get; set; }

        // 提现人id
        [NameInMap("withdrawer_id")]
        [Validation(Required=true)]
        public string WithdrawerId { get; set; }

        // 提现人支付宝id
        [NameInMap("withdrawer_alipay_id")]
        [Validation(Required=true)]
        public string WithdrawerAlipayId { get; set; }

        // 提现人姓名
        [NameInMap("withdrawer_name")]
        [Validation(Required=true)]
        public string WithdrawerName { get; set; }

        // 提现人手机
        [NameInMap("withdrawer_phone_number")]
        [Validation(Required=false)]
        public string WithdrawerPhoneNumber { get; set; }

        // 提现人身份证
        [NameInMap("withdrawer_id_number")]
        [Validation(Required=true)]
        public string WithdrawerIdNumber { get; set; }

        // 提现金额
        [NameInMap("withdraw_amount")]
        [Validation(Required=true)]
        public string WithdrawAmount { get; set; }

        // 提现附言
        [NameInMap("order_title")]
        [Validation(Required=true)]
        public string OrderTitle { get; set; }

        // 业务备注
        [NameInMap("remark")]
        [Validation(Required=true)]
        public string Remark { get; set; }

    }

}
