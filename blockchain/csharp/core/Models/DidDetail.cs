// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // did详情
    public class DidDetail : TeaModel {
        // 控制者的did描述符
        [NameInMap("controller")]
        [Validation(Required=true)]
        public string Controller { get; set; }

        // did描述符
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // did doc
        [NameInMap("did_doc")]
        [Validation(Required=true)]
        public string DidDoc { get; set; }

    }

}
