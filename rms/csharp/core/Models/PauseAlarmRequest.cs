// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class PauseAlarmRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 告警暂停开始时间
        [NameInMap("start")]
        [Validation(Required=true)]
        public long? Start { get; set; }

        // 告警暂停结束时间
        [NameInMap("end")]
        [Validation(Required=true)]
        public long? End { get; set; }

        // 告警关闭原因
        [NameInMap("reason")]
        [Validation(Required=true)]
        public string Reason { get; set; }

        // 资源类型（取值范围：CUSTOM_PLUGIN(自定义监控)、FOLDER(文件夹)、UNIVERSAL_TABLE(用户应用)）
        [NameInMap("resource_type")]
        [Validation(Required=true)]
        public string ResourceType { get; set; }

        // 资源 ID
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

    }

}
