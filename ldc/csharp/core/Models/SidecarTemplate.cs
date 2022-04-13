// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // sidecar 模版
    public class SidecarTemplate : TeaModel {
        // sidecar模版id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // region_id
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // 	
        // 模板生效范围
        [NameInMap("scope")]
        [Validation(Required=true)]
        public string Scope { get; set; }

        // sidecar名称
        [NameInMap("sidecar_name")]
        [Validation(Required=true)]
        public string SidecarName { get; set; }

        // sidecar模版版本
        [NameInMap("sidecar_version")]
        [Validation(Required=true)]
        public string SidecarVersion { get; set; }

        // sidercar模版
        [NameInMap("template")]
        [Validation(Required=true)]
        public string Template { get; set; }

        // 这个字段是lhc专用，表示此模板的来源，META为sidecar元数据来源，XFLUSH为系统模板
        // 本结构体同时还暂时兼容了调用sidecar元数据openapi的使用，后期会只用于LHC用途，届时会去掉sidecar元数据接口的字段。
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // workspace_group_id
        [NameInMap("workspace_group_id")]
        [Validation(Required=false)]
        public string WorkspaceGroupId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

    }

}
