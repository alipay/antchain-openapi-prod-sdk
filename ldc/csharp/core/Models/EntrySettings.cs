// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 统一接入实例接入settings （vip, id, etc.)
    public class EntrySettings : TeaModel {
        // 是否自定义uai entry
        [NameInMap("customized")]
        [Validation(Required=false)]
        public bool? Customized { get; set; }

        // 统一接入实例每个datacenter的用户自定义入口负载均衡实例id列表
        [NameInMap("entry_ids")]
        [Validation(Required=false)]
        public List<MapStringToString> EntryIds { get; set; }

        // 统一接入实例每个datacenter用户自定义入口负载均衡实例的vip
        [NameInMap("entry_vips")]
        [Validation(Required=false)]
        public List<MapStringToString> EntryVips { get; set; }

    }

}
