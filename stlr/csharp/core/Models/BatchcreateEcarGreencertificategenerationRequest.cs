// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class BatchcreateEcarGreencertificategenerationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据发生时间
        [NameInMap("date")]
        [Validation(Required=true)]
        public string Date { get; set; }

        // 设备发电量列表
        [NameInMap("generation")]
        [Validation(Required=true)]
        public List<DeviceGeneration> Generation { get; set; }

    }

}
