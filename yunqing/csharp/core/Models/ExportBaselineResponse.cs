// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class ExportBaselineResponse : TeaModel {
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

        // 回流数据箱
        [NameInMap("datas")]
        [Validation(Required=false)]
        public List<BoxData> Datas { get; set; }

        // 基线导出固定为BACK_FLOW
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 回流数据版本
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

    }

}
