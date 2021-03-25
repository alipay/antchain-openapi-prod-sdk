// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // sidecar发布版本
    public class SidecarReleaseVersion : TeaModel {
        // sidecar版本描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 创建时间
        [NameInMap("gmt_created")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string GmtCreated { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string GmtModified { get; set; }

        // release note
        [NameInMap("release_note")]
        [Validation(Required=false)]
        public string ReleaseNote { get; set; }

        // scope生效范围详情
        [NameInMap("scope_detail")]
        [Validation(Required=false)]
        public SidecarScopeDetail ScopeDetail { get; set; }

        // sidecar名称
        [NameInMap("sidecar_name")]
        [Validation(Required=false)]
        public string SidecarName { get; set; }

        // sidecar版本id
        [NameInMap("sidecar_release_version_id")]
        [Validation(Required=false)]
        public string SidecarReleaseVersionId { get; set; }

        // sidecar版本号
        [NameInMap("sidecar_version")]
        [Validation(Required=false)]
        public string SidecarVersion { get; set; }

        // 版本状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 发布、下线、废弃原因
        [NameInMap("status_reason")]
        [Validation(Required=false)]
        public string StatusReason { get; set; }

        // sidecar模板内容
        [NameInMap("template")]
        [Validation(Required=false)]
        public string Template { get; set; }

        // sidecar模板配置
        [NameInMap("template_configs")]
        [Validation(Required=false)]
        public List<SidecarTemplateConfig> TemplateConfigs { get; set; }

        // sidecar版本类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 版本周期：alpha/beta/release
        [NameInMap("version_period")]
        [Validation(Required=false)]
        public string VersionPeriod { get; set; }

    }

}
