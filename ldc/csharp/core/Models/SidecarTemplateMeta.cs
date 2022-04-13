// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 包含sidecar template表的主要元信息
    public class SidecarTemplateMeta : TeaModel {
        // 名称
        [NameInMap("sidecar_name")]
        [Validation(Required=true)]
        public string SidecarName { get; set; }

        // sidecar版本
        [NameInMap("sidecar_version")]
        [Validation(Required=true)]
        public string SidecarVersion { get; set; }

        // 具体的模板信息
        [NameInMap("template")]
        [Validation(Required=true)]
        public string Template { get; set; }

        // 工作空间
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

        // 工作空间组id
        [NameInMap("workspace_group_id")]
        [Validation(Required=true)]
        public string WorkspaceGroupId { get; set; }

        // 镜像地址
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

        // 保留扩展
        [NameInMap("extension")]
        [Validation(Required=true)]
        public string Extension { get; set; }

        // 基线所应用的scope范围
        [NameInMap("scope")]
        [Validation(Required=true)]
        public string Scope { get; set; }

    }

}
