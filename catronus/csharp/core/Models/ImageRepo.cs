// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // 镜像仓库
    public class ImageRepo : TeaModel {
        // repo ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 镜像仓库名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 镜像仓库域名
        [NameInMap("domain")]
        [Validation(Required=true)]
        public string Domain { get; set; }

        // 用户名
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 密码
        [NameInMap("password")]
        [Validation(Required=true)]
        public string Password { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public bool? Status { get; set; }

        // 创建时间
        [NameInMap("create_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreateTime { get; set; }

        // 上次连接时间
        [NameInMap("last_connect_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string LastConnectTime { get; set; }

    }

}
