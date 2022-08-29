// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryJusticeCaseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 案件Id,创建案件返回的id
        [NameInMap("case_id")]
        [Validation(Required=true)]
        public long? CaseId { get; set; }

        // 维权记录ID, 维权成功后,返回的对应的维权记录ID
        [NameInMap("record_id")]
        [Validation(Required=false)]
        public long? RecordId { get; set; }

    }

}
