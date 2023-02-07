// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateQuotaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 维度标记
        [NameInMap("dim_identity")]
        [Validation(Required=true)]
        public string DimIdentity { get; set; }

        // resource
        [NameInMap("resource")]
        [Validation(Required=true)]
        public string Resource { get; set; }

        // 额度值，实际值还需要乘上quota_factor
        [NameInMap("hard_limit")]
        [Validation(Required=true)]
        public long? HardLimit { get; set; }

        // 同步资源用
        [NameInMap("sync_interface")]
        [Validation(Required=false)]
        public string SyncInterface { get; set; }

        // 关于配额的描述信息
        [NameInMap("quota_desc")]
        [Validation(Required=false)]
        public string QuotaDesc { get; set; }

        // 由于OP不支持浮点数，请用字符串表示浮点数，比如”0.1“-带双引号
        [NameInMap("quota_factor")]
        [Validation(Required=false)]
        public string QuotaFactor { get; set; }

    }

}
