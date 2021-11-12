// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 用户删除
    public class UserAuth : TeaModel {
        // 授权条件,  Local的授权条件使用正则规则, 其中 # 为特殊分隔符, 在权限比较时需要移除该符号
        [NameInMap("condition")]
        [Validation(Required=true)]
        public string Condition { get; set; }

        // YUNYOU_LOCAL_AUTH_KEY
        [NameInMap("condition_key")]
        [Validation(Required=true)]
        public string ConditionKey { get; set; }

        // 用户昵称, 如果是域内, 就是花名
        [NameInMap("nick_name")]
        [Validation(Required=false)]
        public string NickName { get; set; }

        // 是否为负责人
        [NameInMap("primary")]
        [Validation(Required=true)]
        public bool? Primary { get; set; }

        // 用户姓名
        [NameInMap("real_name")]
        [Validation(Required=true)]
        public string RealName { get; set; }

        // PROCESS_ENGINEER: 全局运维工程师
        // PROD_PROCESS_ENGINEER: 产品运维工程师
        // DELIVERY_ENGINEER: 交付工程师
        // ENV_MANAGER: 环境管理员
        // LOCAL_OBSERVER: 观察者
        // AKE_PROCESS_ENGINEER: AKE运维工程师
        [NameInMap("role")]
        [Validation(Required=true)]
        public string Role { get; set; }

        // ID来源, 该ID用于Global和Local进行信息同步使用, 因此该值就是域账号
        [NameInMap("source_id")]
        [Validation(Required=false)]
        public string SourceId { get; set; }

        // 授权状态,
        // WAIT_REGIST: 等待用户注册
        // ACTIVE: 授权已经生效
        // DELETED: 授权已经删除
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 用户ID, 该值为IAM上的User.ID属性
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

    }

}
