// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class CreateDeploymentRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用列表
        [NameInMap("applications")]
        [Validation(Required=false)]
        public List<Application> Applications { get; set; }

        // 是否启用自动运维，默认为**False**
        [NameInMap("auto_execute")]
        [Validation(Required=false)]
        public bool? AutoExecute { get; set; }

        // 部署维度，有两种取值：APPLICATION和APP_SERVICE。设置为APPLICATION，表示在尚未引入应用服务环境中对整个应用都执行部署操作; APP_SERVICE表示在引入应用服务的环境中对应用服务执行部署操作。
        [NameInMap("deploy_dimension")]
        [Validation(Required=false)]
        public string DeployDimension { get; set; }

        // 执行部署操作的目标租户
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

        // 部署单标题。长度不超过50个UTF-8字符
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 执行部署操作的目标工作空间
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
