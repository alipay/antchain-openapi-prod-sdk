// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 信物链查询实体身份请求结构体
    public class DidBaseQueryReq : TeaModel {
        // * "thingId"       原始ID
        // * "certText"      证书文本
        // * "certPublicKey"证书公钥
        // * "didPublicKey" DID公钥
        // * "didExtension"  DID扩展，设备/企业组织/仓库/空间的解析同thingsExtraParams
        // * "didUsername"   DID用户名
        // * "ownerDid"      所有者DID
        // * "userDid"       使用者DID
        // * "thingType"     实体类型，设备/企业组织/仓库/空间等
        // * "thingStatus"   实体状态
        // * "thingModelId" 实体物模型类型
        // * "thingAttribute"实体属性
        // * "thingVersion"  实体版本
        // * "spacesAttached"关联空间列表
        // * "thingsAttached"关联实体列表（例：库位关联设备）
        // * "authLevel"     授权等级
        // * "thingServiceEndpoint" 服务列表
        [NameInMap("data_filter")]
        [Validation(Required=true)]
        public List<string> DataFilter { get; set; }

        // 是否从链上查询，从链上查询将返回txHash值
        [NameInMap("on_chain")]
        [Validation(Required=true)]
        public bool? OnChain { get; set; }

        // 需要查询的实体Did列表，同一次查询的Did须为相同类型
        [NameInMap("things_did_list")]
        [Validation(Required=true)]
        public List<string> ThingsDidList { get; set; }

    }

}
