// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 税号信息
    public class IdentityInfo : TeaModel {
        // 需要打标的税号
        [NameInMap("identity_id")]
        [Validation(Required=true)]
        public string IdentityId { get; set; }

        // 授权编号
        [NameInMap("auth_code")]
        [Validation(Required=true)]
        public string AuthCode { get; set; }

        // 授权开始时间
        [NameInMap("auth_start_time")]
        [Validation(Required=false)]
        public string AuthStartTime { get; set; }

        // 授权截止时间
        [NameInMap("auth_end_time")]
        [Validation(Required=false)]
        public string AuthEndTime { get; set; }

        // 授权书url
        [NameInMap("auth_url")]
        [Validation(Required=false)]
        public string AuthUrl { get; set; }

    }

}
