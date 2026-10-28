// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 预览文件信息
    public class PreviewFileInfo : TeaModel {
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        [NameInMap("expire_at")]
        [Validation(Required=true)]
        public long? ExpireAt { get; set; }

        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

    }

}
