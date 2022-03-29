// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class QueryStatsGroupRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 是否降序，默认为降序
        [NameInMap("desc")]
        [Validation(Required=false)]
        public bool? Desc { get; set; }

        // Group ID 过滤
        [NameInMap("group_id")]
        [Validation(Required=false)]
        public string GroupId { get; set; }

        // 实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 排序字段
        [NameInMap("order_index")]
        [Validation(Required=false)]
        public long? OrderIndex { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 每页显示条数
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // Unix 时间戳
        [NameInMap("timestamp_sec")]
        [Validation(Required=true)]
        public long? TimestampSec { get; set; }

        // Topic 过滤
        [NameInMap("topic")]
        [Validation(Required=false)]
        public string Topic { get; set; }

    }

}
