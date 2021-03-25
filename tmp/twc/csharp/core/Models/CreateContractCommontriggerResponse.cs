// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateContractCommontriggerResponse : TeaModel {
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

        // 错误码
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // 错误信息描述
        [NameInMap("err_message")]
        [Validation(Required=false)]
        public string ErrMessage { get; set; }

        // 合同id
        [NameInMap("flow_id")]
        [Validation(Required=false)]
        public string FlowId { get; set; }

        // 商户在智能合同平台id
        [NameInMap("platform_tuid")]
        [Validation(Required=false)]
        public string PlatformTuid { get; set; }

        // 用户在智能合同平台的id
        [NameInMap("user_tuid")]
        [Validation(Required=false)]
        public string UserTuid { get; set; }

    }

}
