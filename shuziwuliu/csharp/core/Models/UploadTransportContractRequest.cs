// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class UploadTransportContractRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 合同甲方did，一般为合同甲方的链上数字身份
        [NameInMap("party_a_did")]
        [Validation(Required=true)]
        public string PartyADid { get; set; }

        // 运输合同生效日期，格式要求yyyy-MM-dd
        [NameInMap("contract_effective_date")]
        [Validation(Required=true)]
        public string ContractEffectiveDate { get; set; }

        // 运输合同到期日期，要求格式yyyy-MM-dd
        [NameInMap("contract_expires_date")]
        [Validation(Required=true)]
        public string ContractExpiresDate { get; set; }

        // 影像件文件信息列表，可以包含多个文件，每个文件需要有文件id和文件hash  (请求蚂蚁影像上传接口获取的文件id和文件hash)。影像文件格式要求：bmp,jpg,jpeg,gif,psd,png,tiff,tga,eps,pdf
        [NameInMap("file_infos")]
        [Validation(Required=true)]
        public List<UploadFileInfo> FileInfos { get; set; }

        // 合同乙方Did，一般为合同乙方的链上数字身份
        [NameInMap("party_b_did")]
        [Validation(Required=true)]
        public string PartyBDid { get; set; }

        // 运输合同编号
        [NameInMap("transport_contract_code")]
        [Validation(Required=true)]
        public string TransportContractCode { get; set; }

        // 所属平台did
        [NameInMap("platform_did")]
        [Validation(Required=true)]
        public string PlatformDid { get; set; }

    }

}
