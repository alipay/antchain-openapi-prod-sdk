// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_be9ae52241c747408ac24bec8f036d74.Models
{
    public class CreateAntchainPdcpProjectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 项目名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 参与方节点信息列表，不同的节点类型参考不同结构体。一期节点类型仅支持FATE，其构造方式请参考FatePartyLocalConfigInfo
        [NameInMap("party_list")]
        [Validation(Required=true)]
        public List<PartyReq> PartyList { get; set; }

    }

}
