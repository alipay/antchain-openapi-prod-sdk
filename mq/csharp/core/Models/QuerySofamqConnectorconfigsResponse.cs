// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class QuerySofamqConnectorconfigsResponse : TeaModel {
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

        // 该任务 来源或去向的配置信息，包括是否可以修改，已经每个配置项如何修改的控件
        [NameInMap("configs")]
        [Validation(Required=false)]
        public List<UIControlModel> Configs { get; set; }

        // 错误报告
        [NameInMap("error_report")]
        [Validation(Required=false)]
        public ErrorReport ErrorReport { get; set; }

    }

}
