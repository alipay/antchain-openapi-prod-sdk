// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class NotifyInterestScenesubjectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求流水号，每次请求不一样
        [NameInMap("request_no")]
        [Validation(Required=true)]
        public string RequestNo { get; set; }

        // 权益流水号
        [NameInMap("interest_no")]
        [Validation(Required=true)]
        public string InterestNo { get; set; }

        // 产品编码
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 申请审批额度，单位元
        [NameInMap("apply_limit_amount")]
        [Validation(Required=false)]
        public string ApplyLimitAmount { get; set; }

        // 申请额度审批状态
        [NameInMap("apply_limit_status")]
        [Validation(Required=true)]
        public string ApplyLimitStatus { get; set; }

        // 权益标的信息,JSON字符串
        [NameInMap("interest_subject_info")]
        [Validation(Required=false)]
        public string InterestSubjectInfo { get; set; }

    }

}
