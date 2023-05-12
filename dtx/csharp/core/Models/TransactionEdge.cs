// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // TransactionEdge
    public class TransactionEdge : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // source
        [NameInMap("source")]
        [Validation(Required=true)]
        public long? Source { get; set; }

        // target
        [NameInMap("target")]
        [Validation(Required=true)]
        public long? Target { get; set; }

        // type
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // content
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // isError
        [NameInMap("is_error")]
        [Validation(Required=true)]
        public bool? IsError { get; set; }

        // error_message
        [NameInMap("error_message")]
        [Validation(Required=true)]
        public string ErrorMessage { get; set; }

    }

}
