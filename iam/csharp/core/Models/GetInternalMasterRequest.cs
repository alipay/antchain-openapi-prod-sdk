// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class GetInternalMasterRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 阿里云PK
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

        // 主账号ID
        [NameInMap("master_id")]
        [Validation(Required=false)]
        public string MasterId { get; set; }

        // 来源系统，例如MAYI，ALBABACLOUD
        [NameInMap("source_system")]
        [Validation(Required=false)]
        public string SourceSystem { get; set; }

    }

}
