// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 发布单|应用执行进度，按状态区分
    public class ExecuteProgress : TeaModel {
        // 阻塞个数
        [NameInMap("blocked")]
        [Validation(Required=true)]
        public long? Blocked { get; set; }

        // 执行中个数
        [NameInMap("executing")]
        [Validation(Required=true)]
        public long? Executing { get; set; }

        // 失败个数
        [NameInMap("failed")]
        [Validation(Required=true)]
        public long? Failed { get; set; }

        // 执行对象ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 初始化机器个数
        [NameInMap("inited")]
        [Validation(Required=true)]
        public long? Inited { get; set; }

        // 执行对象状态
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 成功个数
        [NameInMap("success")]
        [Validation(Required=true)]
        public long? Success { get; set; }

        // 总计
        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

        // 等待中个数
        [NameInMap("waiting")]
        [Validation(Required=true)]
        public long? Waiting { get; set; }

    }

}
