// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 应用参数配置管理-应用参数模板
    public class AppConfigTemplate : TeaModel {
        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 描述
        [NameInMap("comment")]
        [Validation(Required=false)]
        public string Comment { get; set; }

        // 应用参数模板 id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 操作人 id
        [NameInMap("operator_id")]
        [Validation(Required=false)]
        public string OperatorId { get; set; }

        // 参数定义列表
        [NameInMap("params")]
        [Validation(Required=false)]
        public List<TemplateParamDef> Params { get; set; }

        // 参数模板发布时间
        [NameInMap("release_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string ReleaseTime { get; set; }

        // 模板状态，DRAFT 草稿，RELEASE 已发布，发布后才会生成 version，否则为空
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // 租户 id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 模板版本
        [NameInMap("tpl_version")]
        [Validation(Required=false)]
        public string TplVersion { get; set; }

        // 创建时间
        [NameInMap("created_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string CreatedTime { get; set; }

        // 修改时间
        [NameInMap("modified_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string ModifiedTime { get; set; }

    }

}
