// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class CancelClaimRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 报案单编号（蚂蚁内部）
        [NameInMap("claim_notification_form_no_inner")]
        [Validation(Required=true)]
        public string ClaimNotificationFormNoInner { get; set; }

        // 报案撤销附加内容
        [NameInMap("biz_info")]
        [Validation(Required=false)]
        public string BizInfo { get; set; }

    }

}
