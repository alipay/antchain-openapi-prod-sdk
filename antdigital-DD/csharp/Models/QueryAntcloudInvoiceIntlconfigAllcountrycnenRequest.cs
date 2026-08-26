// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    public class QueryAntcloudInvoiceIntlconfigAllcountrycnenRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 国家英文名称
        [NameInMap("keyword")]
        [Validation(Required=false)]
        public string Keyword { get; set; }

    }

}
