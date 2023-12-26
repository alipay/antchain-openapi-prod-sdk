// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 应用请求
    public class ApplicationQueryReq : TeaModel {
        // 应用程序ID
        [NameInMap("application_id")]
        [Validation(Required=true, MaxLength=64)]
        public string ApplicationId { get; set; }

    }

}
