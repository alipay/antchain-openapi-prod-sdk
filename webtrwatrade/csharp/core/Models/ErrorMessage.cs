// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 错误信息
    public class ErrorMessage : TeaModel {
        // 错误码
        [NameInMap("displayed_code")]
        [Validation(Required=false)]
        public string DisplayedCode { get; set; }

        // 错误描述
        [NameInMap("displayed_message")]
        [Validation(Required=false)]
        public string DisplayedMessage { get; set; }

    }

}
