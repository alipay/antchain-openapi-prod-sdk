// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Osp.Models
{
    // AccessKey 实体信息
    public class AccessKey : TeaModel {
        // AK
        [NameInMap("accesskey")]
        [Validation(Required=true)]
        public string Accesskey { get; set; }

        // 实体创建者
        [NameInMap("creator")]
        [Validation(Required=true)]
        public string Creator { get; set; }

        // 创建时间
        [NameInMap("gmtcreate")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string Gmtcreate { get; set; }

        // 实体Id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 实例Id
        [NameInMap("instanceid")]
        [Validation(Required=true)]
        public string Instanceid { get; set; }

        // 是否加密
        [NameInMap("isencrypted")]
        [Validation(Required=true)]
        public bool? Isencrypted { get; set; }

        // 实体名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // SK
        [NameInMap("secretkey")]
        [Validation(Required=true)]
        public string Secretkey { get; set; }

    }

}
