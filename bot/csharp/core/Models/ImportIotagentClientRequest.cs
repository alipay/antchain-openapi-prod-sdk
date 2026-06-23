// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ImportIotagentClientRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备标识列表
        [NameInMap("uid_list")]
        [Validation(Required=true)]
        public List<string> UidList { get; set; }

        // 设备pk
        [NameInMap("product_key")]
        [Validation(Required=true)]
        public string ProductKey { get; set; }

    }

}
