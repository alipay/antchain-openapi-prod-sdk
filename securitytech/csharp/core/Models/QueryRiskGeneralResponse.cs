// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class QueryRiskGeneralResponse : TeaModel {
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

        // 是否计费
        [NameInMap("meter")]
        [Validation(Required=false)]
        public bool? Meter { get; set; }

        // 批量调用情况下的计费数量
        [NameInMap("meter_count")]
        [Validation(Required=false)]
        public long? MeterCount { get; set; }

        // 风险咨询结果的批量查询结果
        [NameInMap("result_list")]
        [Validation(Required=false)]
        public List<ResultList> ResultList { get; set; }

        // 拓展输出字段
        [NameInMap("ext_data")]
        [Validation(Required=false)]
        public string ExtData { get; set; }

    }

}
