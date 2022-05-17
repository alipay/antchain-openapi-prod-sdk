// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Osp.Models
{
    // 每个instance的endpoint信息
    public class AksEndpoint : TeaModel {
        // access_key
        [NameInMap("access_key")]
        [Validation(Required=true)]
        public string AccessKey { get; set; }

        // access_secret
        [NameInMap("access_secret")]
        [Validation(Required=true)]
        public string AccessSecret { get; set; }

        // acvip的地址
        [NameInMap("endpoint")]
        [Validation(Required=true)]
        public string Endpoint { get; set; }

        // 产品id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 租户名
        [NameInMap("tenant")]
        [Validation(Required=true)]
        public string Tenant { get; set; }

        // 工作区
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

        // 表示mesh的配置信息, 用key/value的形式给出.
        [NameInMap("mesh")]
        [Validation(Required=true)]
        public List<KeyValuePair> Mesh { get; set; }

    }

}
