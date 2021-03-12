// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // C3S可信计算服务TAPP应用信息
    public class TappInfo : TeaModel {
        // C3S可信计算TAPP应用标识
        [NameInMap("taap_id")]
        [Validation(Required=true)]
        public string TaapId { get; set; }

        // C3S可信计算TAPP版本
        [NameInMap("tapp_version")]
        [Validation(Required=true)]
        public long? TappVersion { get; set; }

    }

}
