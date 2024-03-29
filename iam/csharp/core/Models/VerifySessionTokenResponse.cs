// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class VerifySessionTokenResponse : TeaModel {
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

        // 用户所在企业的唯一标识
        [NameInMap("customer")]
        [Validation(Required=false)]
        public string Customer { get; set; }

        // 登录名
        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

        // 用户加入的租户ID列表
        [NameInMap("tenants")]
        [Validation(Required=false)]
        public List<string> Tenants { get; set; }

        // session关联的用户id
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 租户详情列表
        [NameInMap("tenant_details")]
        [Validation(Required=false)]
        public List<Tenant> TenantDetails { get; set; }

    }

}
