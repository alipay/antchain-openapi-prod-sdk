// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 订单电子合同信息对象
    public class OrderContractInfo : TeaModel {
        // 电子合同签署单号
        [NameInMap("sign_no")]
        [Validation(Required=false)]
        public string SignNo { get; set; }

        // 签署时间
        [NameInMap("sign_time")]
        [Validation(Required=false)]
        public string SignTime { get; set; }

        // 合同签署类型
        [NameInMap("contract_type")]
        [Validation(Required=false)]
        public string ContractType { get; set; }

        // 文件合同类型
        [NameInMap("agreement_type")]
        [Validation(Required=false)]
        public string AgreementType { get; set; }

        // 模板ID
        [NameInMap("template_id")]
        [Validation(Required=false)]
        public string TemplateId { get; set; }

        // 模板文件名称
        [NameInMap("file_name")]
        [Validation(Required=false)]
        public string FileName { get; set; }

        // 合同文件下载地址
        [NameInMap("download_url")]
        [Validation(Required=false)]
        public string DownloadUrl { get; set; }

    }

}
