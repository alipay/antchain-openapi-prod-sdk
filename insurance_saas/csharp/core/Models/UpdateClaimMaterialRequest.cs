// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class UpdateClaimMaterialRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 报案单号（蚂蚁内部）
        [NameInMap("claim_notification_form_no_inner")]
        [Validation(Required=true)]
        public string ClaimNotificationFormNoInner { get; set; }

        // 报案号（保司）
        [NameInMap("claim_notification_no")]
        [Validation(Required=true)]
        public string ClaimNotificationNo { get; set; }

        // 报案材料列表
        [NameInMap("material_list")]
        [Validation(Required=true)]
        public string MaterialList { get; set; }

        // 不传值，默认（1-已完毕）
        // 0：未完毕
        // 1：已完毕
        [NameInMap("is_finished")]
        [Validation(Required=false)]
        public string IsFinished { get; set; }

    }

}
