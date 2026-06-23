// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryDeviceEmpowerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码 场景码与科技所属人-统一社会信用代码（technology_owner_id）不能同时为空
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

        // 科技所属人-统一社会信用代码  与场景码（scene）不能同时为空
        [NameInMap("technology_owner_id")]
        [Validation(Required=false)]
        public string TechnologyOwnerId { get; set; }

        // 设备ID
        [NameInMap("device_id")]
        [Validation(Required=false)]
        public string DeviceId { get; set; }

        // 授权日期 yyyy-MM-dd 格式
        [NameInMap("query_date")]
        [Validation(Required=true)]
        public string QueryDate { get; set; }

    }

}
