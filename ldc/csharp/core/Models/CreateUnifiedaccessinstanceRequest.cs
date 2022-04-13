// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class CreateUnifiedaccessinstanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 关联的Spanner逻辑集群名称，一个逻辑集群由很多个local集群组成
        [NameInMap("spanner_cluster")]
        [Validation(Required=true)]
        public string SpannerCluster { get; set; }

        // https协议配置
        [NameInMap("unified_access_instance_https_entry")]
        [Validation(Required=false)]
        public HttpsEntry UnifiedAccessInstanceHttpsEntry { get; set; }

        // http协议配置
        [NameInMap("unified_access_instance_http_entry")]
        [Validation(Required=true)]
        public HttpEntry UnifiedAccessInstanceHttpEntry { get; set; }

        // 统一接入实例名称
        [NameInMap("unified_access_instance_name")]
        [Validation(Required=true)]
        public string UnifiedAccessInstanceName { get; set; }

        // 统一接入网络类型，内网（intranet），公网（internet）
        [NameInMap("unified_access_instance_type")]
        [Validation(Required=true)]
        public string UnifiedAccessInstanceType { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 用户自定义实例entry相关信息（vip/id），datacenter粒度
        [NameInMap("entry_settings")]
        [Validation(Required=false)]
        public EntrySettings EntrySettings { get; set; }

    }

}
