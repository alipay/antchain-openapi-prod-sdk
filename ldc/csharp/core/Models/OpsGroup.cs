// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 一个运维操作组
    public class OpsGroup : TeaModel {
        // 运维操作组当前状态。取值列表： INITED：初始化完成； EXECUTING：执行中； SUCCESS：执行成功； FAILED：执行失败； CANCELED：已取消； CONFIRM_WAITING：待确认
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 包含在此运维操作组中的运维单元列表
        [NameInMap("units")]
        [Validation(Required=false)]
        public List<OpsUnit> Units { get; set; }

        // 运维任务进度列表
        [NameInMap("progresses")]
        [Validation(Required=false)]
        public List<OpsGroupTaskProgress> Progresses { get; set; }

    }

}
