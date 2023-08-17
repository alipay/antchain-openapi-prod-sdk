// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_bc907d13969a4eb68852866122b96ffd.Models
{
    // 防止客户端因bug而瞬间重复创建多个相同的任务
    public class BizInfo : TeaModel {
        // 业务码
        [NameInMap("bizcode")]
        [Validation(Required=false)]
        public string Bizcode { get; set; }

        // 可使用时间戳来防止重复
        [NameInMap("bizno")]
        [Validation(Required=false)]
        public long? Bizno { get; set; }

    }

}
