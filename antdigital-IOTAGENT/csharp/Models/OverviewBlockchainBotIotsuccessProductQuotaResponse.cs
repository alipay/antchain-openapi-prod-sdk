// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class OverviewBlockchainBotIotsuccessProductQuotaResponse : TeaModel {
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

        // 枚举:LICENSE,INSTANCE
        [NameInMap("authorization_mode")]
        [Validation(Required=true)]
        public string AuthorizationMode { get; set; }

        // 枚举:LICENSES,INSTANCE_POOL
        [NameInMap("scope")]
        [Validation(Required=true)]
        public string Scope { get; set; }

        // 多产品关联同一实例池时为true，池消费不等于单产品独占消费
        [NameInMap("shared_pool")]
        [Validation(Required=true)]
        public bool? SharedPool { get; set; }

        // 枚举:AGENT_REQUEST
        [NameInMap("resource_type")]
        [Validation(Required=true)]
        public string ResourceType { get; set; }

        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

        [NameInMap("used")]
        [Validation(Required=true)]
        public long? Used { get; set; }

        // total-used，保留负值
        [NameInMap("remaining")]
        [Validation(Required=true)]
        public long? Remaining { get; set; }

        // 额度点，不是token或音频秒数；枚举:QUOTA_POINT
        [NameInMap("unit")]
        [Validation(Required=true)]
        public string Unit { get; set; }

        [NameInMap("as_of")]
        [Validation(Required=true)]
        public string AsOf { get; set; }

    }

}
