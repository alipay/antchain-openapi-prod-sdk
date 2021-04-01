// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class AddMydidcommunAssetDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据实际存储路径
        [NameInMap("data_path")]
        [Validation(Required=true)]
        public string DataPath { get; set; }

        // 请求发起人的did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 所注册的资产所有者DID，要注意资产所有者DID需与授权发起方DID相同
        [NameInMap("owner_did")]
        [Validation(Required=true)]
        public string OwnerDid { get; set; }

        // 数据所对应的业务类型
        [NameInMap("service_type")]
        [Validation(Required=true)]
        public string ServiceType { get; set; }

        // 临时字段，数据文件的md5哈希值，在隐私服务无法直接读取数据时，由用户提供
        [NameInMap("data_hash")]
        [Validation(Required=false)]
        public string DataHash { get; set; }

    }

}
