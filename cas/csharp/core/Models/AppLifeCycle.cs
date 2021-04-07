// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 应用生命周期
    public class AppLifeCycle : TeaModel {
        // ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 应用ID
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // 工作空间ID
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // 应用状态
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // 最近运维单号
        [NameInMap("last_opsorder_id")]
        [Validation(Required=false)]
        public string LastOpsorderId { get; set; }

        // 上次发布版本
        [NameInMap("last_deploy_version")]
        [Validation(Required=true)]
        public string LastDeployVersion { get; set; }

        // 上次发布时间
        [NameInMap("last_deploy_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string LastDeployTime { get; set; }

        // 上线时间
        [NameInMap("online_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string OnlineTime { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 最近修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

    }

}
