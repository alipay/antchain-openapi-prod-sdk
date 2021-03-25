// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CheckEpidentityThreemetaResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 企业状态。
        [NameInMap("enterprise_status")]
        [Validation(Required=false)]
        public string EnterpriseStatus { get; set; }

        // 营业期限。
        [NameInMap("open_time")]
        [Validation(Required=false)]
        public string OpenTime { get; set; }

        // 核验是否通过。
        [NameInMap("passed")]
        [Validation(Required=false)]
        public bool? Passed { get; set; }

        // 0:核验成功 1:企业信息有误 2:企业非正常营业
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

    }

}
