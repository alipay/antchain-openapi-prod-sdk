// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryContractEsignuserResponse : TeaModel {
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

        // e签宝返回码
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // 业务描述信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 账号id
        [NameInMap("account_id")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

        // 用户名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 证件类型
        [NameInMap("id_type")]
        [Validation(Required=false)]
        public string IdType { get; set; }

        // 证件号码
        [NameInMap("id_number")]
        [Validation(Required=false)]
        public string IdNumber { get; set; }

        // 手机号
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 邮箱
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 第三方平台的用户ID
        [NameInMap("third_party_user_id")]
        [Validation(Required=false)]
        public string ThirdPartyUserId { get; set; }

    }

}
