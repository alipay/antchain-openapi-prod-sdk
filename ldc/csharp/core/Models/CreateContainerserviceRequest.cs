// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class CreateContainerserviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 所属应用名称。
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 必填，且不能重复。保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。
        [NameInMap("client_token")]
        [Validation(Required=false)]
        public string ClientToken { get; set; }

        // 容器服务配置。
        [NameInMap("config")]
        [Validation(Required=true)]
        public ContainerServiceConfig Config { get; set; }

        // 容器服务描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 容器服务名称。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 所属命名空间名称。
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 操作人iam账号名，通过pop调用时该参数无效。
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // owner_id（废弃）
        [NameInMap("owner_id")]
        [Validation(Required=false)]
        public string OwnerId { get; set; }

        // owner_name（废弃）
        [NameInMap("owner_name")]
        [Validation(Required=false)]
        public string OwnerName { get; set; }

        // 所属工作空间组名称。
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 应用appid
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

    }

}
