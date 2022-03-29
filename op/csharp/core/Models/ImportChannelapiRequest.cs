// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    public class ImportChannelapiRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 渠道API列表
        [NameInMap("api_list")]
        [Validation(Required=true)]
        public List<ChannelApi> ApiList { get; set; }

    }

}
