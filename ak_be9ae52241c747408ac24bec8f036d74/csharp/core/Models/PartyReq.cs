// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_be9ae52241c747408ac24bec8f036d74.Models
{
    // 创建项目时所有参与方的连接参数
    public class PartyReq : TeaModel {
        // 参与方类型，例如：{FATE, SAAS_FATE, KUSCIA, SAAS_KUSCIA}
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 参与方租户id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 远端节点的配置信息，本期仅支持一种类型：FATE，其配置参考FatePartyLocalConfigInfo结构体定义
        [NameInMap("remote_config")]
        [Validation(Required=true)]
        public string RemoteConfig { get; set; }

    }

}
