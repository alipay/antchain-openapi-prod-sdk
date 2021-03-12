// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 证书详情
    public class BareClaim : TeaModel {
        // 下面的内容由调用者自己定义，建议只存放必要的声明信息，不要放置敏感数据
        [NameInMap("claim")]
        [Validation(Required=true)]
        public string Claim { get; set; }

        // 证书类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
