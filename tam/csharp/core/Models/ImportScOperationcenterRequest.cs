// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAM.Models
{
    public class ImportScOperationcenterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 提交表单入参
        [NameInMap("submit_request")]
        [Validation(Required=true)]
        public SubmitRequest SubmitRequest { get; set; }

        // 站位
        [NameInMap("flag_id")]
        [Validation(Required=false)]
        public string FlagId { get; set; }

    }

}
