// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAM.Models
{
    // 事件详情
    public class Emergency : TeaModel {
        // 标题
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 账号
        [NameInMap("account")]
        [Validation(Required=true)]
        public string Account { get; set; }

        // 姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 手机号
        [NameInMap("phone")]
        [Validation(Required=true)]
        public string Phone { get; set; }

        // 邮箱
        [NameInMap("email")]
        [Validation(Required=true)]
        public string Email { get; set; }

        // 钉钉群
        [NameInMap("group")]
        [Validation(Required=true)]
        public string Group { get; set; }

        // 当前记录状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
