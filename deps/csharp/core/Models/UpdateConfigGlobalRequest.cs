// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class UpdateConfigGlobalRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 数据保密等级
        [NameInMap("data_level")]
        [Validation(Required=false)]
        public string DataLevel { get; set; }

        // 参数描述
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

        // 全局参数 id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 参数名
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

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
