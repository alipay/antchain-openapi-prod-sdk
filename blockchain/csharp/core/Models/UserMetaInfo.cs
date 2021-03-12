// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 用户身份信息
    public class UserMetaInfo : TeaModel {
        // 用户身份信息类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 用户身份信息
        [NameInMap("data")]
        [Validation(Required=true)]
        public List<KeyValuePair> Data { get; set; }

    }

}
