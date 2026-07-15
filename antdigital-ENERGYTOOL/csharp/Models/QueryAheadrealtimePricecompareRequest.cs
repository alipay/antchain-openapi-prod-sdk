// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    public class QueryAheadrealtimePricecompareRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 运行日，格式：yyyy-mm-dd
        [NameInMap("run_date")]
        [Validation(Required=true)]
        public string RunDate { get; set; }

        // 省地区编码，目前仅支持江苏省
        [NameInMap("province")]
        [Validation(Required=true)]
        public string Province { get; set; }

    }

}
