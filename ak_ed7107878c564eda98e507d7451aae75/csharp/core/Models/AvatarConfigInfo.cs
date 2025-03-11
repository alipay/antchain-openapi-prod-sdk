// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ed7107878c564eda98e507d7451aae75.Models
{
    // 数字人平台--交互配置信息
    public class AvatarConfigInfo : TeaModel {
        // 交互配置id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 交互配置名
        [NameInMap("config_name")]
        [Validation(Required=true)]
        public string ConfigName { get; set; }

        // 交互配置编码
        [NameInMap("virtual_code")]
        [Validation(Required=true)]
        public string VirtualCode { get; set; }

        // 数字人角色id
        [NameInMap("human_id")]
        [Validation(Required=true)]
        public long? HumanId { get; set; }

    }

}
