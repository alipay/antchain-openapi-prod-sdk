// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ed7107878c564eda98e507d7451aae75.Models
{
    // 数字人平台--气泡按钮信息
    public class AvatarBubbleInfo : TeaModel {
        // 气泡标题
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 气泡类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 知识点id
        [NameInMap("know_id")]
        [Validation(Required=false)]
        public string KnowId { get; set; }

        // 电话号码
        [NameInMap("tel")]
        [Validation(Required=false)]
        public string Tel { get; set; }

        // 外部链接
        [NameInMap("link")]
        [Validation(Required=false)]
        public string Link { get; set; }

    }

}
