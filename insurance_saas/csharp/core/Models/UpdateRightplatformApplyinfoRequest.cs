// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class UpdateRightplatformApplyinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 申请权益编号
        [NameInMap("right_apply_no")]
        [Validation(Required=true)]
        public string RightApplyNo { get; set; }

        // 申请额度
        [NameInMap("apply_limit_amount")]
        [Validation(Required=true)]
        public string ApplyLimitAmount { get; set; }

        // 申请额度状态
        [NameInMap("apply_status")]
        [Validation(Required=true)]
        public string ApplyStatus { get; set; }

        // 投保信息，json字符串
        [NameInMap("apply_info")]
        [Validation(Required=true)]
        public string ApplyInfo { get; set; }

        // 产品编码
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

    }

}
