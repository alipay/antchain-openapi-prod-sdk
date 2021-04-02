// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 租户项目创建请求结构体模型
    public class TenantProjectCreateReq : TeaModel {
        // 业务类型，默认空
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 可选的，项目关联的区块链类型，1/2/3代表存证/合约等类型
        [NameInMap("blockchain_type")]
        [Validation(Required=false)]
        public long? BlockchainType { get; set; }

        // 可选的，项目关联的区块链uid
        [NameInMap("blockchain_uid")]
        [Validation(Required=false)]
        public string BlockchainUid { get; set; }

        // 租户下唯一项目名称，用以标识项目聚合的存证等信息
        [NameInMap("project_name")]
        [Validation(Required=true)]
        public string ProjectName { get; set; }

    }

}
