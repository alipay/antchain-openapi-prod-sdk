// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    // 企业
    public class Customer : TeaModel {
        // 企业创建时间，ISO8601格式
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // 企业ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 企业名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 企业最近一次修改时间，ISO8601格式
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public string UpdateTime { get; set; }

    }

}
