// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerSppdashboardtrafficResponse : TeaModel {
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

        // 流量转化看板，5 项流量指标 + 全链路转化率 + updateTime
        [NameInMap("conversion")]
        [Validation(Required=false)]
        public string Conversion { get; set; }

        // 收入结果看板，当日收入预估 + 平台收入 GAAP + updateTime
        [NameInMap("income")]
        [Validation(Required=false)]
        public string Income { get; set; }

    }

}
