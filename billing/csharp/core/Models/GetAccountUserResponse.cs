// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BILLING.Models
{
    public class GetAccountUserResponse : TeaModel {
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

        // 智能科技user_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 登录名
        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

        // 用户的真实姓名
        [NameInMap("real_name")]
        [Validation(Required=false)]
        public string RealName { get; set; }

        // 手机号
        [NameInMap("mobile_num")]
        [Validation(Required=false)]
        public string MobileNum { get; set; }

        // 公司名称
        [NameInMap("firm_name")]
        [Validation(Required=false)]
        public string FirmName { get; set; }

        // 帐号类型，企业或者是个人
        //  ENTERPRISE("1","企业类型账号"),
        //  INDIVIDUAL("2","个人类型账号")
        [NameInMap("user_type")]
        [Validation(Required=false)]
        public string UserType { get; set; }

    }

}
