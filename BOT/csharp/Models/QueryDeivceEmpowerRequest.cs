// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryDeivceEmpowerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

        // 统一社会信用代码与场景码不能同时为空
        [NameInMap("operator_id")]
        [Validation(Required=false)]
        public string OperatorId { get; set; }

        // 设备ID
        [NameInMap("device_id")]
        [Validation(Required=false)]
        public string DeviceId { get; set; }

        // 查询授权日期 YYYY-MM-DD
        [NameInMap("query_date")]
        [Validation(Required=true)]
        public string QueryDate { get; set; }

    }

}
