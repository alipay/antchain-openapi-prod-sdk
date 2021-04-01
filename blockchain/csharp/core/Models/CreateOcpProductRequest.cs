// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateOcpProductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 联盟Id
        [NameInMap("baas_alliance")]
        [Validation(Required=true)]
        public string BaasAlliance { get; set; }

        // 意义：链扩容字段，表示在默认空间大小基础上，新增空间大小，单位为G，默认值为0。
        // 仅链版本为企业版（enterpriseVer）时，才发挥作用。
        [NameInMap("baas_capacity")]
        [Validation(Required=false)]
        public string BaasCapacity { get; set; }

        // 区块链的名称
        [NameInMap("baas_name")]
        [Validation(Required=true)]
        public string BaasName { get; set; }

        // 意义：链新增节点数，表示在默认4个节点基础上，新增节点数，单位为个，默认值为0。
        //  仅链版本为企业版（enterpriseVer）时，才发挥作用。
        [NameInMap("baas_node")]
        [Validation(Required=false)]
        public string BaasNode { get; set; }

        // 意义：Tee链标志，表示创建Tee区块链，默认值为false。 
        // 注意：仅链版本为企业版（enterpriseVer）时，才发挥作用。
        [NameInMap("baas_tee")]
        [Validation(Required=false)]
        public bool? BaasTee { get; set; }

        // 基础版（basicVer）、企业版（enterpriseVer）
        [NameInMap("baas_ver")]
        [Validation(Required=true)]
        public string BaasVer { get; set; }

        // 业务组详细码
        [NameInMap("biz_code")]
        [Validation(Required=true)]
        public string BizCode { get; set; }

        // 业务组详细类型
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 业务组码
        [NameInMap("group_code")]
        [Validation(Required=true)]
        public string GroupCode { get; set; }

        // 产品码 全局唯一
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

    }

}
