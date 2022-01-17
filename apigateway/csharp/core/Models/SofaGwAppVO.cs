// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // API分组 或 应用
    public class SofaGwAppVO : TeaModel {
        // 应用认证信息
        [NameInMap("authentications")]
        [Validation(Required=false)]
        public List<SofaGwAuthenticationVO> Authentications { get; set; }

        // 应用描述信息
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 实例标识
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 实例标识
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // services
        [NameInMap("services")]
        [Validation(Required=false)]
        public List<string> Services { get; set; }

        // api分组(服务提供方)用 PUBLISHER，应用(服务使用方)用 SUBSCRIBER
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
