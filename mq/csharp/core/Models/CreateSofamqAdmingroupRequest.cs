// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class CreateSofamqAdmingroupRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 集群名
        [NameInMap("cluster")]
        [Validation(Required=true)]
        public string Cluster { get; set; }

        // Group ID
        [NameInMap("group_id")]
        [Validation(Required=true)]
        public string GroupId { get; set; }

        // group协议类型
        [NameInMap("group_type")]
        [Validation(Required=false)]
        public string GroupType { get; set; }

        // 实例ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // Group ID 描述信息
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 生效范围，三板斧使用
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // Group 所属的应用名称，要求 app name 在 zappinfo 上可查
        [NameInMap("owner")]
        [Validation(Required=false)]
        public string Owner { get; set; }

    }

}
