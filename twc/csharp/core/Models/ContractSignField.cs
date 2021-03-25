// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 电子合同签署盖章区
    public class ContractSignField : TeaModel {
        // 电子合同用户ID
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 电子合同文档ID
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 电子合同签署区id
        [NameInMap("signfield_id")]
        [Validation(Required=true)]
        public string SignfieldId { get; set; }

    }

}
