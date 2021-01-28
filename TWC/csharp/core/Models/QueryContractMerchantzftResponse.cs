// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryContractMerchantzftResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 0表示成功，其他为失败
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // 商户入驻查询信息
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

        // 错误信息描述
        [NameInMap("err_message")]
        [Validation(Required=false)]
        public string ErrMessage { get; set; }

    }

}
