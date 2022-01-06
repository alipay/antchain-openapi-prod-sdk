// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class AddSgRouterrulegroupsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 服务id
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 下发版本
        [NameInMap("dispatch_version")]
        [Validation(Required=false)]
        public string DispatchVersion { get; set; }

        // 是否生效，1 生效，0 未生效。默认未生效
        [NameInMap("enabled")]
        [Validation(Required=false)]
        public long? Enabled { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 编辑人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // JSON格式：路由规则
        [NameInMap("rules")]
        [Validation(Required=true)]
        public string Rules { get; set; }

        // dataID的类型，应用/服务；默认为0，服务级
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 规则组名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
