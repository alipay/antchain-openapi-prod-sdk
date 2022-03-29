// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryTraceConfigResponse : TeaModel {
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

        // 链路配置
        [NameInMap("tags")]
        [Validation(Required=false)]
        public List<TraceSpanSearchTagConfig> Tags { get; set; }

        // 链路搜索的大类
        [NameInMap("categories")]
        [Validation(Required=false)]
        public List<string> Categories { get; set; }

        // 数据库配置
        [NameInMap("dbconfigs")]
        [Validation(Required=false)]
        public List<TraceSpanSearchDbConfig> Dbconfigs { get; set; }

        // 消息队列的kind取值范围
        [NameInMap("mqkinds")]
        [Validation(Required=false)]
        public List<string> Mqkinds { get; set; }

    }

}
