// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_be9ae52241c747408ac24bec8f036d74.Models
{
    // 项目内参与方节点信息
    public class Party : TeaModel {
        // 参与方节点id，创建项目时无需传入，由saas统一分配
        [NameInMap("party_id")]
        [Validation(Required=false)]
        public string PartyId { get; set; }

        // 所属方id，若为云上节点，则为云上租户ID，若为线下节点，则该参数为空
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 参与方节点类型，创建项目时无需填写，由local_config字段推导出节点参与方类型；
        // 一期支持两类，FATE为线下fate参与方节点，SAAS_FATE为云上fate参与方节点
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 参与方配置json，当type为FATE时，其结构为FatePartyConfigInfo，当type为SAAS_FATE时，其结构为List<FatePartyConfigInfo>
        [NameInMap("node_config")]
        [Validation(Required=false)]
        public string NodeConfig { get; set; }

    }

}
