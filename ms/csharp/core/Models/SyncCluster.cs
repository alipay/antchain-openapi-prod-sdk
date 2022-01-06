// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 注册中心同步集群元信息
    public class SyncCluster : TeaModel {
        // 集群id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // [{   //扩展参数，比如涉及到鉴权
        //                   "key": "user",
        //                   "value": "xx"
        //                 }, {
        //                   "key": "password",
        //                   "value": "xx"
        //                 }]
        [NameInMap("extra_params")]
        [Validation(Required=true)]
        public List<KeyValueModel> ExtraParams { get; set; }

        // 集群描述信息
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 集群类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 集群所有的机器列表，；隔开
        [NameInMap("vip")]
        [Validation(Required=true)]
        public string Vip { get; set; }

    }

}
