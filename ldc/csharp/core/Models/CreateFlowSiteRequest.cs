// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class CreateFlowSiteRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 推送接口类型，可选值（RPC，REST）
        [NameInMap("interface_type")]
        [Validation(Required=true)]
        public string InterfaceType { get; set; }

        // 推送接口 url
        [NameInMap("interface_urls")]
        [Validation(Required=true)]
        public List<string> InterfaceUrls { get; set; }

        // 站点名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 站点类型，可选值 MAIN（主站点）， ISOMERISM（异构机房）
        [NameInMap("site_type")]
        [Validation(Required=true)]
        public string SiteType { get; set; }

        // opssla uniqueId
        [NameInMap("unique_id")]
        [Validation(Required=false)]
        public string UniqueId { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

    }

}
