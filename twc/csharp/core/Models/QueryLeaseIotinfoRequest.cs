// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryLeaseIotinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 查询截止时间
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public string EndTime { get; set; }

        // 设备唯一id imei id
        [NameInMap("product_imei_id")]
        [Validation(Required=true)]
        public string ProductImeiId { get; set; }

        // 查询开启时间
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public string StartTime { get; set; }

    }

}
