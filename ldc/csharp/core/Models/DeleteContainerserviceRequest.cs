// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class DeleteContainerserviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 最近一次草稿版本。
        [NameInMap("drafted_revision")]
        [Validation(Required=false)]
        public string DraftedRevision { get; set; }

        // 最近一次草稿时间
        [NameInMap("drafted_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DraftedTime { get; set; }

        // 容器应用服务名称。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 当前命名空间名称。
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 提交人。
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 所属工作空间组名称
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

    }

}
