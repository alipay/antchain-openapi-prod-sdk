// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class OperateIotbasicPermissionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 操作人
        // 
        [NameInMap("operator_id")]
        [Validation(Required=true)]
        public string OperatorId { get; set; }

        // 角色
        [NameInMap("iot_role")]
        [Validation(Required=false)]
        public string IotRole { get; set; }

        // 待添加的权限集合
        [NameInMap("permission_list")]
        [Validation(Required=false)]
        public List<IotBasicPermissionData> PermissionList { get; set; }

        // 操作类型
        [NameInMap("action")]
        [Validation(Required=true)]
        public string Action { get; set; }

        // 绑定权限集合
        [NameInMap("bind_permision")]
        [Validation(Required=false)]
        public List<string> BindPermision { get; set; }

        // 参数签名校验
        [NameInMap("param_sign")]
        [Validation(Required=false)]
        public string ParamSign { get; set; }

    }

}
