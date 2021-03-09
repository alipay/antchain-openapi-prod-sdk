// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 应用等级
    public class AppLevel : TeaModel {
        // ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 应用等级名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 创建者
        [NameInMap("creator_id")]
        [Validation(Required=false)]
        public string CreatorId { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 创建时间
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcCreate { get; set; }

        // 最近修改时间
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcModified { get; set; }

    }

}
