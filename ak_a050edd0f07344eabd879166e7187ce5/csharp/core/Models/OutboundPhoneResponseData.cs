// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_a050edd0f07344eabd879166e7187ce5.Models
{
    // 收单返回结构体
    public class OutboundPhoneResponseData : TeaModel {
        // 通话唯一ID
        [NameInMap("acid")]
        [Validation(Required=false)]
        public string Acid { get; set; }

        // 是否同步
        [NameInMap("asyn")]
        [Validation(Required=false)]
        public bool? Asyn { get; set; }

        // 外呼ID
        [NameInMap("outcall_request_id")]
        [Validation(Required=false)]
        public string OutcallRequestId { get; set; }

        // 外呼DB的ID
        [NameInMap("asyn_db_id")]
        [Validation(Required=false)]
        public string AsynDbId { get; set; }

    }

}
