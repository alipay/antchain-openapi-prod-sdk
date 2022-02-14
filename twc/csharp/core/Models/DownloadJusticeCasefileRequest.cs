// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class DownloadJusticeCasefileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 案件id
        [NameInMap("case_id")]
        [Validation(Required=true)]
        public string CaseId { get; set; }

        // 维权记录id
        [NameInMap("record_id")]
        [Validation(Required=true)]
        public string RecordId { get; set; }

    }

}
