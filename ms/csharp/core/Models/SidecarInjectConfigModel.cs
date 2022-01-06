// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // sidecar注入配置模型
    public class SidecarInjectConfigModel : TeaModel {
        // sidecar类型 支持inject_all，clusters，namespaces，labels，annotations
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 字符串数组
        [NameInMap("strs")]
        [Validation(Required=false)]
        public List<string> Strs { get; set; }

        // kv键值对数组
        [NameInMap("kvs")]
        [Validation(Required=false)]
        public List<KV> Kvs { get; set; }

    }

}
