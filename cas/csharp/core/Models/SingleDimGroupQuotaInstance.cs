// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 单维度实例的配额信息
    public class SingleDimGroupQuotaInstance : TeaModel {
        // 配额实例所属的 配额id
        [NameInMap("quota_id")]
        [Validation(Required=true)]
        public string QuotaId { get; set; }

        // 配额实例id
        [NameInMap("quota_ins_id")]
        [Validation(Required=true)]
        public string QuotaInsId { get; set; }

        // 维度实例组合id
        [NameInMap("dim_ins_group_id")]
        [Validation(Required=false)]
        public string DimInsGroupId { get; set; }

        // 维度标识
        [NameInMap("dim_identity")]
        [Validation(Required=false)]
        public string DimIdentity { get; set; }

        // 维度实例的值，比如某个具体的workspace_id
        [NameInMap("dim_ins_value")]
        [Validation(Required=false)]
        public string DimInsValue { get; set; }

        // resource
        [NameInMap("resource")]
        [Validation(Required=true)]
        public string Resource { get; set; }

        // 表示是无限大还是无限小
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 限额值
        [NameInMap("hard_limit")]
        [Validation(Required=true)]
        public long? HardLimit { get; set; }

        // 已经使用的额度
        [NameInMap("in_use")]
        [Validation(Required=true)]
        public long? InUse { get; set; }

        // 预分配的额度
        [NameInMap("reserved")]
        [Validation(Required=false)]
        public long? Reserved { get; set; }

        // 保留额度
        [NameInMap("remain")]
        [Validation(Required=false)]
        public long? Remain { get; set; }

        // utc_create
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcCreate { get; set; }

        // utc_modified
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcModified { get; set; }

        // quota乘数因子，用以解决k8s资源可以用小数表示的问题。由于OP不支持浮点数，请用字符串表示
        [NameInMap("quota_factor")]
        [Validation(Required=true)]
        public string QuotaFactor { get; set; }

    }

}
