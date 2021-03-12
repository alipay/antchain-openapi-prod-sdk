// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // doc删除service
    public class DidDeleteService : TeaModel {
        // 修改前did doc版本
        [NameInMap("previous_version")]
        [Validation(Required=true)]
        public long? PreviousVersion { get; set; }

        // 指定服务的id
        [NameInMap("service_id")]
        [Validation(Required=true)]
        public string ServiceId { get; set; }

    }

}
