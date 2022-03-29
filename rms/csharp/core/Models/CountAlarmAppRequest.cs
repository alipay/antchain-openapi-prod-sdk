// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class CountAlarmAppRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 开始时间 - 时间戳
        [NameInMap("start")]
        [Validation(Required=true)]
        public long? Start { get; set; }

        // 结束时间 - 时间戳
        [NameInMap("end")]
        [Validation(Required=true)]
        public long? End { get; set; }

        // 应用名称模糊搜索
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

    }

}
