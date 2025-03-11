// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ed7107878c564eda98e507d7451aae75.Models
{
    // 数字人平台--自定义组件信息
    public class AvatarComponentInfo : TeaModel {
        // 组件标题
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 组件编码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 组件值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
