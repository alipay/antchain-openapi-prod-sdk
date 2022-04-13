// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 运维操作中的应用
    public class OpsApplication : TeaModel {
        // 应用名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 应用发布版本（部分运维操作可能不包含版本信息，为null）
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // 应用（服务）当前运维状态。取值列表： INITING：初始化中； INIT_FAILED：初始化失败； INITED：初始化完成； EXECUTING：执行中； SUCCESS：执行成功； FAILED：执行失败； ROLLBACKED：已回滚； CANCELED：已取消
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
