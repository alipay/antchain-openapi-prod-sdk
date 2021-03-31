// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class UploadCreditAuthorizationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 签署货主统一社会信用代码
        [NameInMap("consignor_cert_no")]
        [Validation(Required=true)]
        public string ConsignorCertNo { get; set; }

        // 签署货主did
        [NameInMap("consignor_did")]
        [Validation(Required=true)]
        public string ConsignorDid { get; set; }

        // 签署货主企业名称
        [NameInMap("consignor_name")]
        [Validation(Required=true)]
        public string ConsignorName { get; set; }

        // 授权的货主平台账号
        [NameInMap("consignor_platform_account")]
        [Validation(Required=true)]
        public string ConsignorPlatformAccount { get; set; }

        // 协议到期日
        [NameInMap("expire_date")]
        [Validation(Required=true)]
        public string ExpireDate { get; set; }

        // 集团平台did
        [NameInMap("group_platform_did")]
        [Validation(Required=true)]
        public string GroupPlatformDid { get; set; }

        // 是否包含账号授权条款
        [NameInMap("has_authorization_clause")]
        [Validation(Required=true)]
        public bool? HasAuthorizationClause { get; set; }

        // 签署子公司统一社会信用代码
        [NameInMap("platform_cert_no")]
        [Validation(Required=true)]
        public string PlatformCertNo { get; set; }

        // 签署子公司did
        [NameInMap("platform_did")]
        [Validation(Required=true)]
        public string PlatformDid { get; set; }

        // 签署子公司企业名称
        // 
        [NameInMap("platform_name")]
        [Validation(Required=true)]
        public string PlatformName { get; set; }

        // 线下协议影像件id与文件哈希, 多id以逗号分隔, 最多支持10个
        [NameInMap("protocol_img_id")]
        [Validation(Required=true)]
        public string ProtocolImgId { get; set; }

        // 协议名称
        [NameInMap("protocol_name")]
        [Validation(Required=true)]
        public string ProtocolName { get; set; }

        // 线下协议编号
        [NameInMap("protocol_no")]
        [Validation(Required=true)]
        public string ProtocolNo { get; set; }

        // 签署时间
        [NameInMap("sign_date")]
        [Validation(Required=true)]
        public string SignDate { get; set; }

        // 产品id
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

    }

}
