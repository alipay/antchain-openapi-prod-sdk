// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryElectrocarDevicehistorypropertiesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // tuid
        [NameInMap("tuid")]
        [Validation(Required=true)]
        public string Tuid { get; set; }

        // 开始时间戳
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public long? StartTime { get; set; }

        // 结束时间戳
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public long? EndTime { get; set; }

        // 1
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 1
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
