// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class AuthDasAuthresultResponse : TeaModel {
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

        // 被授权企业ID
        [NameInMap("be_authed_person_id")]
        [Validation(Required=false)]
        public string BeAuthedPersonId { get; set; }

        // 被授权企业接入应用ID
        [NameInMap("be_authed_person_app_id")]
        [Validation(Required=false)]
        public string BeAuthedPersonAppId { get; set; }

        // 授权实例ID
        [NameInMap("auth_instance_id")]
        [Validation(Required=false)]
        public string AuthInstanceId { get; set; }

        // 授权详情ID
        [NameInMap("auth_result_id")]
        [Validation(Required=false)]
        public string AuthResultId { get; set; }

        // VC 完整信息
        [NameInMap("vc")]
        [Validation(Required=false)]
        public string Vc { get; set; }

    }

}
