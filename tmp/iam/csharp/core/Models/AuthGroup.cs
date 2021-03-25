// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    // 授权组
    public class AuthGroup : TeaModel {
        // 创建时间，ISO8601格式
        [NameInMap("creation_time")]
        [Validation(Required=false)]
        public string CreationTime { get; set; }

        // 授权组ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 授权组名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 更新时间，ISO8601格式
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public string UpdateTime { get; set; }

    }

}
