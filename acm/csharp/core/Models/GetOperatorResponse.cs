// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class GetOperatorResponse : TeaModel {
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

        // 操作员创建时间，ISO8601格式
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // 操作员所在的企业
        [NameInMap("customer")]
        [Validation(Required=true)]
        public string Customer { get; set; }

        // 邮箱
        [NameInMap("email")]
        [Validation(Required=true)]
        public string Email { get; set; }

        // 外部对接系统操作员ID
        [NameInMap("external_id")]
        [Validation(Required=true)]
        public string ExternalId { get; set; }

        // 外部对接系统类型
        [NameInMap("external_system")]
        [Validation(Required=true)]
        public string ExternalSystem { get; set; }

        // 操作员ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 登录名
        [NameInMap("login_name")]
        [Validation(Required=true)]
        public string LoginName { get; set; }

        // 手机号
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 昵称
        [NameInMap("nickname")]
        [Validation(Required=true)]
        public string Nickname { get; set; }

        // 真实姓名
        [NameInMap("real_name")]
        [Validation(Required=true)]
        public string RealName { get; set; }

        // 操作员状态(INACTIVE：未激活，NORMAL：正常状态，FROZEN：冻结状态)
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 用户加入的租户列表
        [NameInMap("tenants")]
        [Validation(Required=true)]
        public List<string> Tenants { get; set; }

        // 操作员最近一次修改时间，ISO8601格式
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public string UpdateTime { get; set; }

        // 工号
        [NameInMap("work_no")]
        [Validation(Required=false)]
        public string WorkNo { get; set; }

        // 是否是主账号
        [NameInMap("is_master")]
        [Validation(Required=false)]
        public bool? IsMaster { get; set; }

        // 钉钉机器人 token
        [NameInMap("dd_robot")]
        [Validation(Required=false)]
        public string DdRobot { get; set; }

    }

}
