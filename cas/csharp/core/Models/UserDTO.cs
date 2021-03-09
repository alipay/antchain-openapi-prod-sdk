// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // IAM用户信息
    public class UserDTO : TeaModel {
        // 用户ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 创建时间
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcCreate { get; set; }

        // 最近修改时间
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcModified { get; set; }

        // 客户ID
        [NameInMap("customer_id")]
        [Validation(Required=false)]
        public string CustomerId { get; set; }

        // 用户类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 用户显示名称
        [NameInMap("real_name")]
        [Validation(Required=false)]
        public string RealName { get; set; }

        // 用户名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
