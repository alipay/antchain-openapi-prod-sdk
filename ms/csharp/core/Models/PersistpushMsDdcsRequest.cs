// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class PersistpushMsDdcsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用名称，长度50以内
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 属性名称，长度50以内
        [NameInMap("attribute_name")]
        [Validation(Required=true)]
        public string AttributeName { get; set; }

        // 实例标识，通常在中间件门户首页获取，长度50以内
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 操作人，可以定义为系统或者实际操作人，用于推送源追溯，长度50以内
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 机构名称，长度20以内
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // 配置类名称，长度150以内
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

        // 推送值，长度10240以内
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
