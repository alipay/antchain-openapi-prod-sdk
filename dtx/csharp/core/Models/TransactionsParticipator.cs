// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 事务详情 参与者信息
    public class TransactionsParticipator : TeaModel {
        // app_name
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // method_name
        [NameInMap("method_name")]
        [Validation(Required=true)]
        public string MethodName { get; set; }

        // method_type
        [NameInMap("method_type")]
        [Validation(Required=true)]
        public string MethodType { get; set; }

        // rsDesc
        [NameInMap("rs_desc")]
        [Validation(Required=true)]
        public string RsDesc { get; set; }

        // rs_type
        [NameInMap("rs_type")]
        [Validation(Required=true)]
        public string RsType { get; set; }

    }

}
