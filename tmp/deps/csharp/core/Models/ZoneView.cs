// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 机房视图
    public class ZoneView : TeaModel {
        // 显示名称
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // table id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 标识
        [NameInMap("identity")]
        [Validation(Required=false)]
        public string Identity { get; set; }

        // 状态
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

    }

}
