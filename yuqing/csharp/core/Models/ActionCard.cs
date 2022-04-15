// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    // 钉钉动作卡片
    public class ActionCard : TeaModel {
        // 标题
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 内容
        [NameInMap("text")]
        [Validation(Required=false)]
        public string Text { get; set; }

        // btn_orientation
        [NameInMap("btn_orientation")]
        [Validation(Required=false)]
        public string BtnOrientation { get; set; }

        // 简单标题
        [NameInMap("single_title")]
        [Validation(Required=false)]
        public string SingleTitle { get; set; }

        // 简单地址
        [NameInMap("single_url")]
        [Validation(Required=false)]
        public string SingleUrl { get; set; }

        // 点击
        [NameInMap("btns")]
        [Validation(Required=false)]
        public List<Btn> Btns { get; set; }

    }

}
