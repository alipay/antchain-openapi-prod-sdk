// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    public class QueryTransactionsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 业务id
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 业务码
        [NameInMap("business_type")]
        [Validation(Required=false)]
        public string BusinessType { get; set; }

        // 当前分页
        [NameInMap("current_page")]
        [Validation(Required=true)]
        public long? CurrentPage { get; set; }

        // 结束时间
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public long? EndTime { get; set; }

        // 环境唯一标识
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 开始时间
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public long? StartTime { get; set; }

        // 事务状态  默认传 all， 其他可选状态 Activity 、 Exception 、 Finish
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 事务id
        [NameInMap("tx_id")]
        [Validation(Required=false)]
        public string TxId { get; set; }

    }

}
