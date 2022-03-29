// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class BatchcreateUnifiedalarmHistoryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // json格式上下文信息
        [NameInMap("context")]
        [Validation(Required=true)]
        public string Context { get; set; }

    }

}
