// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class CreateDisDidResponse : TeaModel {
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

        // 分布式数字身份did
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

        // 组织类型
        [NameInMap("organization_type")]
        [Validation(Required=false)]
        public string OrganizationType { get; set; }

        // 现阶段此did下的所有授予的角色
        [NameInMap("role_types")]
        [Validation(Required=false)]
        public List<string> RoleTypes { get; set; }

    }

}
