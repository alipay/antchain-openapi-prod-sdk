// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // 签约字段
    public class ContractSignField : TeaModel {
        // account_id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // file_id
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // signfield_id
        [NameInMap("signfield_id")]
        [Validation(Required=true)]
        public string SignfieldId { get; set; }

    }

}
