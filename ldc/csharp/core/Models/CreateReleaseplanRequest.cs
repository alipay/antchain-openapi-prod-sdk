// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class CreateReleaseplanRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 创建发布单需要的应用服务信息
        [NameInMap("app_services")]
        [Validation(Required=true)]
        public List<ReleasePlanSpecAppService> AppServices { get; set; }

        // 命名空间
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 是否自动执行
        [NameInMap("is_auto_execute")]
        [Validation(Required=false)]
        public bool? IsAutoExecute { get; set; }

        // 发布单标题
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 默认CLOUD_NATIVE_GROUP_RELEASE
        [NameInMap("ops_type")]
        [Validation(Required=false)]
        public string OpsType { get; set; }

    }

}
