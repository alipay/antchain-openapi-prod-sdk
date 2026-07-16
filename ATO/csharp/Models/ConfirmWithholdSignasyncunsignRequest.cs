// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class ConfirmWithholdSignasyncunsignRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrderId { get; set; }

        // 操作动作
        // 同意：AGREE
        // 拒绝：REFUSE
        [NameInMap("operate")]
        [Validation(Required=true, MaxLength=16)]
        public string Operate { get; set; }

        // 拒绝原因码,商户拒绝时必填。
        // USER_OWE_MONEY：用户账户存在欠费订单
        // USER_IN_SERVICE：用户有进行的订单
        [NameInMap("refuse_reason_code")]
        [Validation(Required=false, MaxLength=16)]
        public string RefuseReasonCode { get; set; }

        // 用户欠款金额，单位为分
        // refuse_reason_code=USER_OWE_MONEY时必填
        [NameInMap("user_owe_money")]
        [Validation(Required=false)]
        public long? UserOweMoney { get; set; }

        // 用户进行中的服务
        // refuse_reason_code=USER_IN_SERVICE时必填
        [NameInMap("user_in_service")]
        [Validation(Required=false, MaxLength=128)]
        public string UserInService { get; set; }

    }

}
