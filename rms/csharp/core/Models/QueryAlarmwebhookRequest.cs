// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryAlarmwebhookRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // createOrModifyByMe
        [NameInMap("create_or_modify_by_me")]
        [Validation(Required=true)]
        public bool? CreateOrModifyByMe { get; set; }

        // 当前页
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 页面大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // webhook名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 修改人
        [NameInMap("modifier")]
        [Validation(Required=false)]
        public string Modifier { get; set; }

        // ID列表
        [NameInMap("ids")]
        [Validation(Required=false)]
        public List<long?> Ids { get; set; }

        // 是否只查询当前操作者的
        [NameInMap("only_current_staff")]
        [Validation(Required=false)]
        public bool? OnlyCurrentStaff { get; set; }

    }

}
