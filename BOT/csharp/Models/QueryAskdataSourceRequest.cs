// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryAskdataSourceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据源类型
        [NameInMap("config_type")]
        [Validation(Required=true)]
        public string ConfigType { get; set; }

        // 数据源别称
        [NameInMap("alias")]
        [Validation(Required=true)]
        public string Alias { get; set; }

    }

}
