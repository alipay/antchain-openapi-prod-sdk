// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class FinishClaimSettleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 报案单编号（蚂蚁内部）
        [NameInMap("claim_notification_form_no_inner")]
        [Validation(Required=true)]
        public string ClaimNotificationFormNoInner { get; set; }

        // 报案号（保司）
        [NameInMap("claim_notification_no")]
        [Validation(Required=false)]
        public string ClaimNotificationNo { get; set; }

        // 赔付受理结果：01--受理、02--拒赔
        [NameInMap("accept_result")]
        [Validation(Required=true)]
        public string AcceptResult { get; set; }

        // 受理结论
        [NameInMap("accept_note")]
        [Validation(Required=false)]
        public string AcceptNote { get; set; }

        // 支付信息
        [NameInMap("trade_info")]
        [Validation(Required=false)]
        public string TradeInfo { get; set; }

    }

}
