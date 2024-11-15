// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    public class QueryBusinessruleServicesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 提交人域账号
        [NameInMap("submitter_id")]
        [Validation(Required=true)]
        public string SubmitterId { get; set; }

    }

}
