// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryOpsCheckRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 当前页
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 	
        // 页面大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 应用名
        [NameInMap("app")]
        [Validation(Required=false)]
        public string App { get; set; }

        // 应用监控指标状态 0：异常 1：正常 不传：全部
        [NameInMap("app_status")]
        [Validation(Required=false)]
        public long? AppStatus { get; set; }

        // 自定义监控指标状态 0：异常 1：正常 不传：全部
        [NameInMap("custom_status")]
        [Validation(Required=false)]
        public long? CustomStatus { get; set; }

    }

}
