// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class AddAntvipDomainRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间组名称
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 应用名称
        [NameInMap("application")]
        [Validation(Required=true)]
        public string Application { get; set; }

        // 要添加的部署单元名称列表
        [NameInMap("cells")]
        [Validation(Required=true)]
        public List<string> Cells { get; set; }

        // 健康检查类型，默认为TCP
        [NameInMap("health_check_type")]
        [Validation(Required=false)]
        public string HealthCheckType { get; set; }

        // 健康检查端口，非必填项
        [NameInMap("health_check_default_port")]
        [Validation(Required=false)]
        public long? HealthCheckDefaultPort { get; set; }

    }

}
