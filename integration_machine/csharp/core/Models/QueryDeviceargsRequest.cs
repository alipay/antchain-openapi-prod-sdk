// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTEGRATION_MACHINE.Models
{
    public class QueryDeviceargsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备SN
        [NameInMap("serial_no")]
        [Validation(Required=true)]
        public string SerialNo { get; set; }

        // 设备厂商
        [NameInMap("corp_name")]
        [Validation(Required=true)]
        public string CorpName { get; set; }

    }

}
