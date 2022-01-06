// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class QueryDdcsPushhistoryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 需要查询的 dataId，可不填。
        [NameInMap("data_id")]
        [Validation(Required=false)]
        public string DataId { get; set; }

        // 查询的推送记录的介绍时间，值为 1970到现在的毫秒数，用毫秒数为了避免时区问题
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public long? EndTime { get; set; }

        // instance id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 限时返回条数
        [NameInMap("size")]
        [Validation(Required=false)]
        public long? Size { get; set; }

        // 从哪个id开始查询，不建议使用
        [NameInMap("start_id")]
        [Validation(Required=false)]
        public long? StartId { get; set; }

        // 查询的开始时间，值为 1970到现在的毫秒数，用毫秒数为了避免时区问题
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public long? StartTime { get; set; }

    }

}
