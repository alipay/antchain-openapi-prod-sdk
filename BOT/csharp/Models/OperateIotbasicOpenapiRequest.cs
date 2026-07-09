// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class OperateIotbasicOpenapiRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 操作类型
        [NameInMap("operate_type")]
        [Validation(Required=true)]
        public string OperateType { get; set; }

        // 参数签名
        [NameInMap("param_sign")]
        [Validation(Required=true)]
        public string ParamSign { get; set; }

        // 业务操作类型
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 操作人id
        [NameInMap("operator_id")]
        [Validation(Required=true)]
        public string OperatorId { get; set; }

        // 类名（实现类），首字母小写
        [NameInMap("interface_name")]
        [Validation(Required=true)]
        public string InterfaceName { get; set; }

        // 方法名
        [NameInMap("method_name")]
        [Validation(Required=true)]
        public string MethodName { get; set; }

        // 参数类路径
        [NameInMap("param_class")]
        [Validation(Required=true)]
        public string ParamClass { get; set; }

        // 参数数据
        [NameInMap("param_list")]
        [Validation(Required=true)]
        public string ParamList { get; set; }

    }

}
