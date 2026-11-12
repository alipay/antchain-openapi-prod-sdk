// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CORLAB.Models
{
    public class QueryFeatureminingPlanResponse : TeaModel {
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

        // IV信息，包含每轮信息和特征挖掘报告下载链接
        [NameInMap("iv_info")]
        [Validation(Required=false)]
        public List<IvInfo> IvInfo { get; set; }

        // 最好模型效果报告
        [NameInMap("best_model_report")]
        [Validation(Required=false)]
        public BestModelReport BestModelReport { get; set; }

    }

}
