// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 信物链实体查询返回的数据结构，对应数据表字段
    public class DidBaseQueryResp : TeaModel {
        // 授权水平，0-默认关联授权
        [NameInMap("auth_level")]
        [Validation(Required=false)]
        public long? AuthLevel { get; set; }

        // 证书公钥，特定实体可查询
        [NameInMap("cert_public_key")]
        [Validation(Required=false)]
        public string CertPublicKey { get; set; }

        // 证书文本，特定实体可以查询
        [NameInMap("cert_text")]
        [Validation(Required=false)]
        public string CertText { get; set; }

        // DID扩展，设备/企业组织/仓库/空间的解析同ThingExtraParams
        [NameInMap("did_extension")]
        [Validation(Required=false)]
        public string DidExtension { get; set; }

        // did公钥，特定w3c did实体可查询
        [NameInMap("did_public_key")]
        [Validation(Required=false)]
        public string DidPublicKey { get; set; }

        // DID用户名，w3c did实体可查询
        [NameInMap("did_username")]
        [Validation(Required=false)]
        public string DidUsername { get; set; }

        // 所有者DID
        [NameInMap("owner_did")]
        [Validation(Required=false)]
        public string OwnerDid { get; set; }

        // 实体附属空间列表，例如仓库下属库位，设备关联库位等
        [NameInMap("spaces_attached")]
        [Validation(Required=false)]
        public List<string> SpacesAttached { get; set; }

        // 实体附属实体列表，例如空间关联设备列表
        [NameInMap("things_attached")]
        [Validation(Required=false)]
        public List<string> ThingsAttached { get; set; }

        // 实体属性，在阿里云iot设备，对应三元组
        [NameInMap("thing_attribute")]
        [Validation(Required=false)]
        public string ThingAttribute { get; set; }

        // 原始ID
        [NameInMap("thing_id")]
        [Validation(Required=false)]
        public string ThingId { get; set; }

        // 实体物模型id
        [NameInMap("thing_model_id")]
        [Validation(Required=false)]
        public string ThingModelId { get; set; }

        // 服务端点，可实现w3c service endpoint
        [NameInMap("thing_service_endpoint")]
        [Validation(Required=false)]
        public string ThingServiceEndpoint { get; set; }

        // 设备状态需要是通过 updateStatus api更新，
        // 其他状态通过updateThingsDid api更新
        [NameInMap("thing_status")]
        [Validation(Required=false)]
        public string ThingStatus { get; set; }

        // 实体类型，注册时候的类型
        // 0: 阿里云设备
        // 1: 链机设备
        // 2: MCU设备
        // 3: INTEL设备
        // 16384:  默认设备
        // 65536: 组织身份
        // 131072: 仓库身份
        // 196608: 空间身份
        [NameInMap("thing_type")]
        [Validation(Required=false)]
        public long? ThingType { get; set; }

        // 实体版本
        [NameInMap("thing_version")]
        [Validation(Required=false)]
        public string ThingVersion { get; set; }

        // 使用者DID列表
        [NameInMap("user_did_list")]
        [Validation(Required=false)]
        public List<string> UserDidList { get; set; }

        // 查询的did
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

    }

}
