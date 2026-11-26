// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ListIotsuccessProductQuotaConsumptionResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

        [NameInMap("page_index")]
        [Validation(Required=true)]
        public long? PageIndex { get; set; }

        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 枚举:LICENSES,INSTANCE_POOL
        [NameInMap("scope")]
        [Validation(Required=true)]
        public string Scope { get; set; }

        [NameInMap("shared_pool")]
        [Validation(Required=true)]
        public bool? SharedPool { get; set; }

        // 枚举:AGENT_REQUEST
        [NameInMap("resource_type")]
        [Validation(Required=true)]
        public string ResourceType { get; set; }

        // 枚举:QUOTA_POINT
        [NameInMap("unit")]
        [Validation(Required=true)]
        public string Unit { get; set; }

        // 所有入口切换并完成在途处理和基准余额保存后的可靠覆盖起点；未知为null
        [NameInMap("coverage_from")]
        [Validation(Required=true)]
        public string CoverageFrom { get; set; }

        // 当前请求范围中所有周期均有已提交流水覆盖
        [NameInMap("complete")]
        [Validation(Required=true)]
        public bool? Complete { get; set; }

        // 本次强一致查询时点，不是完整结算水位或跨页快照
        [NameInMap("as_of")]
        [Validation(Required=true)]
        public string AsOf { get; set; }

        [NameInMap("items")]
        [Validation(Required=true)]
        public List<OpenApiQuotaConsumptionItem> Items { get; set; }

    }

}
