// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 信物链存证请求结构体
    public class EvidenceStorageReq : TeaModel {
        // 业务数据，原文上链，或者加密（label若为CRYPTO）上链，上链后的业务数据，通过授权可被区块链其他业务方查询
        [NameInMap("biz_data")]
        [Validation(Required=false)]
        public string BizData { get; set; }

        // 不同上链方式
        // 空/"": 默认
        // "TTTS": 溯源
        // "IOTPAY": 支付
        // "CZ": 存证
        // "RAW":文本
        [NameInMap("category")]
        [Validation(Required=true)]
        public string Category { get; set; }

        // 上链实体id(设备/空间)
        // 不可和project_uid同时为空
        [NameInMap("iot_did")]
        [Validation(Required=false)]
        public string IotDid { get; set; }

        // 需要上链的证据的哈希值
        [NameInMap("hash")]
        [Validation(Required=false)]
        public string Hash { get; set; }

        // 上链的附属信息
        [NameInMap("meta_json")]
        [Validation(Required=false)]
        public string MetaJson { get; set; }

        // 上链的项目id,
        // 不可和iot_did同时为空
        [NameInMap("project_uid")]
        [Validation(Required=false)]
        public string ProjectUid { get; set; }

    }

}
