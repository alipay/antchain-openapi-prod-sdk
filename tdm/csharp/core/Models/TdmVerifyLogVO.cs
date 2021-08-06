// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    // 核身记录查询结果
    public class TdmVerifyLogVO : TeaModel {
        // 1:核身创建成功 2:核身验证通过 3:核身验证失败
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 核身结果描述信息
        [NameInMap("remark")]
        [Validation(Required=true)]
        public string Remark { get; set; }

    }

}
