// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryScfleaseEqpinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备识别号
        [NameInMap("device_no")]
        [Validation(Required=true)]
        public string DeviceNo { get; set; }

        // 运营日期
        [NameInMap("operation_date")]
        [Validation(Required=true)]
        public string OperationDate { get; set; }

    }

}
