// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class QueryPdcpDtraceResponse : TeaModel {
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

        // 存证数据类型名称
        [NameInMap("data_type")]
        [Validation(Required=false)]
        public string DataType { get; set; }

        // 存证数据ID
        [NameInMap("data_id")]
        [Validation(Required=false)]
        public string DataId { get; set; }

        // 存证数据版本列表
        [NameInMap("versions")]
        [Validation(Required=false)]
        public List<DataDepositInfo> Versions { get; set; }

    }

}
