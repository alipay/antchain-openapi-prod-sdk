// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 规则推送结果
    public class PushRuleResult : TeaModel {
        // site名字
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // site描述
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

        // 推送成功的zone
        [NameInMap("succeed_list")]
        [Validation(Required=false)]
        public List<string> SucceedList { get; set; }

        // 推送失败的zone
        [NameInMap("failed_list")]
        [Validation(Required=false)]
        public List<string> FailedList { get; set; }

        // 失败信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
