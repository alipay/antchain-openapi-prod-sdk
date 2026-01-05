// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTTS.Models
{
    // 币种response
    public class QueryTokenSymbolResponse : TeaModel {
        // 链名称
        [NameInMap("blockchain")]
        [Validation(Required=true)]
        public string Blockchain { get; set; }

        // 币种
        [NameInMap("token_symbol")]
        [Validation(Required=true)]
        public string TokenSymbol { get; set; }

    }

}
