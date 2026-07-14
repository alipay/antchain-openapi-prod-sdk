// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class QueryActiveDataResponse : TeaModel {
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

        // 是否查询成功
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // 填报维度
        [NameInMap("data_dimension")]
        [Validation(Required=false)]
        public string DataDimension { get; set; }

        // 是否按照单元过程录入
        [NameInMap("input_by_process")]
        [Validation(Required=false)]
        public bool? InputByProcess { get; set; }

        // 过程模型列表
        [NameInMap("process_list")]
        [Validation(Required=false)]
        public List<GclLcaModel> ProcessList { get; set; }

    }

}
