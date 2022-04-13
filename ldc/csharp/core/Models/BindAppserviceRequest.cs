// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class BindAppserviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用名称
        [NameInMap("application_name")]
        [Validation(Required=true)]
        public string ApplicationName { get; set; }

        // 应用服务名称
        [NameInMap("app_service_name")]
        [Validation(Required=true)]
        public string AppServiceName { get; set; }

        // 部署单元名称列表。 n代表第n个应用的名称，n从1开始，最大100。每个部署单元名称最大60个UTF-8字符。如果要输入多个部署单元，使用如下形式：cell_ids.1=RZ01A&cell_ids.2=RZ02B
        [NameInMap("cell_ids")]
        [Validation(Required=true)]
        public List<string> CellIds { get; set; }

        // 工作空间名称
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

    }

}
