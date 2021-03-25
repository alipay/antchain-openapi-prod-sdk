// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 应用参数配置管理-应用参数
    public class AppParam : TeaModel {
        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 创建时间
        [NameInMap("created_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string CreatedTime { get; set; }

        // 数据保密等级
        [NameInMap("data_level")]
        [Validation(Required=false)]
        public string DataLevel { get; set; }

        // 参数描述
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

        // 应用参数 id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 参数名
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // 修改时间
        [NameInMap("modified_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string ModifiedTime { get; set; }

        // 版本
        [NameInMap("param_version")]
        [Validation(Required=false)]
        public long? ParamVersion { get; set; }

        // 该参数属于哪个 scope
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // 该参数在该 scope 中的 id
        [NameInMap("scope_id")]
        [Validation(Required=false)]
        public string ScopeId { get; set; }

        // 租户 id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 参数类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 参数值
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
