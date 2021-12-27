// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢系统Contact结构体
    public class Contact : TeaModel {
        // 联系人类型
        // 1配偶
        // 2父母
        // 3子女
        // 4兄弟
        // 5姐妹
        // 6朋友
        // 7其他
        [NameInMap("kind")]
        [Validation(Required=true)]
        public string Kind { get; set; }

        // 联系人姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 联系人手机号
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

    }

}
