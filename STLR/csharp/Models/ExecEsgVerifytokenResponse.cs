// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class ExecEsgVerifytokenResponse : TeaModel {
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

        // 当前操作员全部去重后的角色编码
        [NameInMap("role_nos")]
        [Validation(Required=false)]
        public List<string> RoleNos { get; set; }

        // 当前碳矩阵操作员 ID。
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 当前碳矩阵登录账号名称。
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 操作员昵称
        [NameInMap("nick_name")]
        [Validation(Required=false)]
        public string NickName { get; set; }

        // 操作员真实姓名
        [NameInMap("real_name")]
        [Validation(Required=false)]
        public string RealName { get; set; }

        // 操作员手机号
        [NameInMap("phone_number")]
        [Validation(Required=false)]
        public string PhoneNumber { get; set; }

        // 企业编码
        [NameInMap("enterprise_no")]
        [Validation(Required=false)]
        public string EnterpriseNo { get; set; }

    }

}
