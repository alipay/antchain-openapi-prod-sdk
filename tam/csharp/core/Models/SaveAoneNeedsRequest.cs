// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAM.Models
{
    public class SaveAoneNeedsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 产品线
        [NameInMap("product_line")]
        [Validation(Required=true)]
        public string ProductLine { get; set; }

        // 产品名称
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 问题类型
        [NameInMap("issue_type")]
        [Validation(Required=true)]
        public string IssueType { get; set; }

        // 期望日期
        [NameInMap("expected_at")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ExpectedAt { get; set; }

        // 创建者的工号
        [NameInMap("author")]
        [Validation(Required=true)]
        public string Author { get; set; }

        // 解决者/指派者的工号
        [NameInMap("assigned_to")]
        [Validation(Required=true)]
        public string AssignedTo { get; set; }

        // 标题
        [NameInMap("subject")]
        [Validation(Required=true)]
        public string Subject { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 跟踪者的工号
        [NameInMap("watcher_users")]
        [Validation(Required=true)]
        public List<string> WatcherUsers { get; set; }

        // 优先级
        [NameInMap("priority_id")]
        [Validation(Required=true)]
        public long? PriorityId { get; set; }

        // 上传文件集合
        [NameInMap("uploadlist")]
        [Validation(Required=false)]
        public UploadRequestArray Uploadlist { get; set; }

    }

}
