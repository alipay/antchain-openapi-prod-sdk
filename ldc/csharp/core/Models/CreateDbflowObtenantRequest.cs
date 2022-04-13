// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class CreateDbflowObtenantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 描述信息
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 租户扩展属性，格式为序列化后的json字符串
        [NameInMap("extend_properties")]
        [Validation(Required=false)]
        public string ExtendProperties { get; set; }

        // OB租户名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 用于存放对应的业务库租户类型：单库类型或分片库
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 租户存放的uid段，用于存放对应业务分片库
        [NameInMap("uids")]
        [Validation(Required=false)]
        public List<long?> Uids { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

    }

}
