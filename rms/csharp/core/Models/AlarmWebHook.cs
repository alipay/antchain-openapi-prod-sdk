// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // WebHook结构体
    public class AlarmWebHook : TeaModel {
        // 主键 ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // url
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // method (POST, GET等)
        [NameInMap("method")]
        [Validation(Required=true)]
        public string Method { get; set; }

        // headers
        [NameInMap("headers")]
        [Validation(Required=false)]
        public List<KeySet> Headers { get; set; }

        // params
        [NameInMap("params")]
        [Validation(Required=false)]
        public List<KeySet> Params { get; set; }

        // config
        [NameInMap("config")]
        [Validation(Required=false)]
        public List<KeySet> Config { get; set; }

        // body_template
        [NameInMap("body_template")]
        [Validation(Required=false)]
        public string BodyTemplate { get; set; }

        // 是否该 scope 内全局
        [NameInMap("scope_global")]
        [Validation(Required=false)]
        public bool? ScopeGlobal { get; set; }

        // creator
        [NameInMap("creator")]
        [Validation(Required=false)]
        public string Creator { get; set; }

        // modifier
        [NameInMap("modifier")]
        [Validation(Required=false)]
        public string Modifier { get; set; }

        // gmtCreate
        [NameInMap("gmt_create")]
        [Validation(Required=false)]
        public long? GmtCreate { get; set; }

        // gmtModified
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public long? GmtModified { get; set; }

        // webhook订阅的规则数量
        [NameInMap("subscribe_count")]
        [Validation(Required=false)]
        public long? SubscribeCount { get; set; }

        // 当前租户有效还是当前workspace有效
        [NameInMap("valid_scope")]
        [Validation(Required=false)]
        public long? ValidScope { get; set; }

    }

}
