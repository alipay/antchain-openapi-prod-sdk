// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 采购供应商初始化 
    public class SupplierInfo : TeaModel {
        // 供应商id
        [NameInMap("agent_supplier_id")]
        [Validation(Required=true)]
        public string AgentSupplierId { get; set; }

        // 被代理机构社会统一信用码
        [NameInMap("agent_supplier_corp_id")]
        [Validation(Required=true)]
        public string AgentSupplierCorpId { get; set; }

        // 被代理机构名称
        [NameInMap("agent_supplier_corp_name")]
        [Validation(Required=true)]
        public string AgentSupplierCorpName { get; set; }

        // 被代理供应商名称
        [NameInMap("agent_supplier_name")]
        [Validation(Required=true)]
        public string AgentSupplierName { get; set; }

        // 被代理机构的法人名称
        [NameInMap("agent_supplier_corp_owner_name")]
        [Validation(Required=true)]
        public string AgentSupplierCorpOwnerName { get; set; }

        // 额外信息
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

    }

}
