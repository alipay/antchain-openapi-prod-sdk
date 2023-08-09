// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SAAS.Models
{
    // sdk的maven依赖信息
    public class SdkMavenDependencyInfo : TeaModel {
        // client端maven依赖，包含蚂蚁链版本和金融云版本依赖信息
        [NameInMap("reference_client")]
        [Validation(Required=true)]
        public string ReferenceClient { get; set; }

        // 客户端server端依赖，产品api基于技术产品纬度使用技术客户端sdk构建，此处依赖基本使用不到
        [NameInMap("referenc_server")]
        [Validation(Required=false)]
        public string ReferencServer { get; set; }

        // client端maven仓库地址
        [NameInMap("maven_link_client")]
        [Validation(Required=true)]
        public string MavenLinkClient { get; set; }

        // server端maven仓库地址
        [NameInMap("maven_link_server")]
        [Validation(Required=false)]
        public string MavenLinkServer { get; set; }

    }

}
