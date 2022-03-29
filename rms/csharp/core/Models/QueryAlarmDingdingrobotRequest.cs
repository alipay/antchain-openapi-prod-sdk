// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryAlarmDingdingrobotRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作区名
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 只看当前用户创建的钉钉机器人
        [NameInMap("only_current_staff")]
        [Validation(Required=false)]
        public bool? OnlyCurrentStaff { get; set; }

        // 当前页
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 页面尺寸
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 机器人名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 根据token过滤
        [NameInMap("token")]
        [Validation(Required=false)]
        public string Token { get; set; }

    }

}
