// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DUANKA.Models
{
    // BaseResult
    public class BaseResult : TeaModel {
        // success
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        // errorCode
        [NameInMap("error_code")]
        [Validation(Required=true)]
        public string ErrorCode { get; set; }

        // message
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        // tabledto
        [NameInMap("data")]
        [Validation(Required=true)]
        public TableDTO Data { get; set; }

    }

}
