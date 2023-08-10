// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_6c97b30e21b14c3b9197b138865c7988.Models
{
    public class QueryBaasPlusEnterpriseBusinessinfomationResponse : TeaModel {
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

        // 业务结果码  0:企业经营正常   1:企业异常经营  2:企业查询失败
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 业务结果说明
        [NameInMap("msg")]
        [Validation(Required=false)]
        public string Msg { get; set; }

        // 企业经营信息详情
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

    }

}
