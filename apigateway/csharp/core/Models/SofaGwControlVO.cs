// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // 访问控制
    public class SofaGwControlVO : TeaModel {
        // 要添加的授权的app_name列表
        [NameInMap("add_items")]
        [Validation(Required=false)]
        public List<string> AddItems { get; set; }

        // 实例标识
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 授权的app_name列表
        [NameInMap("items")]
        [Validation(Required=false)]
        public List<string> Items { get; set; }

        // 固定值：app
        [NameInMap("match")]
        [Validation(Required=false)]
        public string Match { get; set; }

        // 要删除的授权的app_name列表
        [NameInMap("remove_items")]
        [Validation(Required=false)]
        public List<string> RemoveItems { get; set; }

        // service name
        [NameInMap("service_name")]
        [Validation(Required=false)]
        public string ServiceName { get; set; }

        // 子类型，固定值：whitelist
        [NameInMap("sub_type")]
        [Validation(Required=false)]
        public string SubType { get; set; }

        // 控制类型，固定值：access-control
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
