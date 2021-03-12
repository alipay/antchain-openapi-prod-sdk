// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryApiDwhAccountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 账户hash ，如果根据账户hash查询账户信息可以填写该字段
        [NameInMap("account_hash")]
        [Validation(Required=false)]
        public string AccountHash { get; set; }

        // 链id
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 结束时间，如果查询时间段创建的账户，可以填写该字段
        [NameInMap("end_timestamp")]
        [Validation(Required=false)]
        public long? EndTimestamp { get; set; }

        // 页数，分页使用，从1开始
        [NameInMap("page_no")]
        [Validation(Required=false)]
        public long? PageNo { get; set; }

        // 分页大小，取值不能超过100，默认100
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 开始时间，如果查询时间段创建的账户，可以填写该字段
        [NameInMap("start_timestamp")]
        [Validation(Required=false)]
        public long? StartTimestamp { get; set; }

    }

}
