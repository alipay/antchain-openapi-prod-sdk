// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 单元内的资源
    public class UnitResource : TeaModel {
        // 资源地址
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 环境标识
        [NameInMap("env_id")]
        [Validation(Required=true)]
        public string EnvId { get; set; }

        // 资源ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 资源名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 资源端口
        [NameInMap("port")]
        [Validation(Required=false)]
        public long? Port { get; set; }

        // 资源类型:CONTAINER,LB,DB,CACHE,APP,STORAGE
        [NameInMap("resource_type")]
        [Validation(Required=true)]
        public string ResourceType { get; set; }

        // zone标识
        [NameInMap("zone_id")]
        [Validation(Required=true)]
        public string ZoneId { get; set; }

    }

}
