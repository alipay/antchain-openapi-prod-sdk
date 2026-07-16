// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerLoggerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务渠道：DINGDING
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // 钉钉群id
        // 租户id
        // 支付宝uuid
        [NameInMap("channel_account_id")]
        [Validation(Required=true)]
        public string ChannelAccountId { get; set; }

        // traceid
        [NameInMap("trace_id")]
        [Validation(Required=false)]
        public string TraceId { get; set; }

        // 开始时间
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public string StartTime { get; set; }

        // 结束时间
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public string EndTime { get; set; }

        // 分页
        [NameInMap("page_info")]
        [Validation(Required=false)]
        public PageQuery PageInfo { get; set; }

        // 额外查询参数
        [NameInMap("ext_query_param")]
        [Validation(Required=false)]
        public string ExtQueryParam { get; set; }

    }

}
