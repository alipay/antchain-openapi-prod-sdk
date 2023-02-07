// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryQuotaInstanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // quota类的ID，请使用Quota API查询获取
        [NameInMap("quota_id")]
        [Validation(Required=false)]
        public string QuotaId { get; set; }

        // 接入配额的时候,在配额中注册的资源标识
        [NameInMap("resource_identity")]
        [Validation(Required=false)]
        public string ResourceIdentity { get; set; }

        // 当状态为INFINITE,即无限大.当状态为INFINITESIMAL时,即为无限小
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 上限值
        [NameInMap("hard_limit")]
        [Validation(Required=false)]
        public long? HardLimit { get; set; }

        // in_use
        [NameInMap("in_use")]
        [Validation(Required=false)]
        public long? InUse { get; set; }

        // 维度实例组合ID
        [NameInMap("dim_instance_group_id")]
        [Validation(Required=false)]
        public string DimInstanceGroupId { get; set; }

        // page_number
        [NameInMap("page_number")]
        [Validation(Required=true)]
        public long? PageNumber { get; set; }

        // page_size
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 维度标记
        [NameInMap("dim_identity")]
        [Validation(Required=false)]
        public string DimIdentity { get; set; }

        // 维度的值
        [NameInMap("dim_ins_value")]
        [Validation(Required=false)]
        public string DimInsValue { get; set; }

    }

}
