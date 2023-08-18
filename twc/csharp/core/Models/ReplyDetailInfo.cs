// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 用户与商家之间的协商记录
    public class ReplyDetailInfo : TeaModel {
        // 回复人名称
        [NameInMap("replier_name")]
        [Validation(Required=true)]
        public string ReplierName { get; set; }

        // 回复人角色 用户：USER 商家：MERCHANT 系统：SYSTEM 审核小二：AUDITOR 政府单位：GOVERNMENT
        [NameInMap("replier_role")]
        [Validation(Required=true)]
        public string ReplierRole { get; set; }

        // 回复时间
        // 
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // 回复内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 回复图片
        [NameInMap("images")]
        [Validation(Required=true)]
        public List<string> Images { get; set; }

    }

}
