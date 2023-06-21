// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MPAASFACEVERIFY.Models
{
    // 单据计费信息，包括单据号和是否计费
    public class ChargeInfo : TeaModel {
        // 认证单据号
        [NameInMap("certify_id")]
        [Validation(Required=true)]
        public string CertifyId { get; set; }

        // 计费类型，当前枚举支持：
        // FAIL_NOT_CHARGE：认证失败，该单据不计费
        // CHARGE：认证成功，该单据计费
        [NameInMap("charge_type")]
        [Validation(Required=true)]
        public string ChargeType { get; set; }

        // 错误码
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

    }

}
