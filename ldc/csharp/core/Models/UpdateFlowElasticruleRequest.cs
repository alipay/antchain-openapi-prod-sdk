// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class UpdateFlowElasticruleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 弹性规则 ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 弹性规则服务名称。
        // RPC：对应接口名，例如：com.alipay.cif.facade.AckCodeService:1.0:cif。
        // APP：对应应用名，例如：cif。
        // MSG或ANTQ：对应消息groupId，例如：S-UNIQUERY-SYNC。
        [NameInMap("service_name")]
        [Validation(Required=true)]
        public string ServiceName { get; set; }

        // 弹性规则状态，可选值 VALID("线上生效")，PRESS("仅压测生效")，INVALID("无效状态");
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

    }

}
