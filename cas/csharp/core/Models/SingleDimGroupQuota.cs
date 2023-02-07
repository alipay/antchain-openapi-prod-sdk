// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 单维度配额信息
    public class SingleDimGroupQuota : TeaModel {
        // quota_id
        [NameInMap("quota_id")]
        [Validation(Required=true)]
        public string QuotaId { get; set; }

        // 后端用，前端无需关心
        [NameInMap("dim_group_id")]
        [Validation(Required=false)]
        public string DimGroupId { get; set; }

        // dim_identity
        [NameInMap("dim_identity")]
        [Validation(Required=true)]
        public string DimIdentity { get; set; }

        // resource_identity
        [NameInMap("resource_identity")]
        [Validation(Required=true)]
        public string ResourceIdentity { get; set; }

        // 配额最大值，注意:1. hardLimit为 -1时 表时无限大2. hardLimit为 -2时 表时无限小
        [NameInMap("hard_limit")]
        [Validation(Required=true)]
        public long? HardLimit { get; set; }

        // 后端用，前端无需关心
        [NameInMap("sync_interface")]
        [Validation(Required=false)]
        public string SyncInterface { get; set; }

        // 创建者
        [NameInMap("creator_name")]
        [Validation(Required=false)]
        public string CreatorName { get; set; }

        // utc_create
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcCreate { get; set; }

        // utc_modified
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcModified { get; set; }

        // 维度实例的值，比如某个workspace的ID
        [NameInMap("dim_ins_value")]
        [Validation(Required=true)]
        public string DimInsValue { get; set; }

        // 由于额度只支持整数，用这个浮点数factor表示乘数因子，
        [NameInMap("quota_factor")]
        [Validation(Required=false)]
        public string QuotaFactor { get; set; }

    }

}
