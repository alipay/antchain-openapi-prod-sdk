// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class GetRoleResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 角色所包含的操作点
        [NameInMap("actions")]
        [Validation(Required=false)]
        public List<Action> Actions { get; set; }

        // 创建时间,ISO8601格式
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // 角色描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 角色Id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 角色名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 角色归属租户
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

        // 角色类型，CUSTOM:自定义角色，COMMON:系统通用角色
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 更新时间,ISO8601格式
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public string UpdateTime { get; set; }

    }

}
