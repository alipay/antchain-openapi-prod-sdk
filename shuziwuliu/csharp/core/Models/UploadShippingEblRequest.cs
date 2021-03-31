// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class UploadShippingEblRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 船公司名称
        [NameInMap("carrier_name")]
        [Validation(Required=true)]
        public string CarrierName { get; set; }

        // 收货人did
        [NameInMap("consignee_did")]
        [Validation(Required=true)]
        public string ConsigneeDid { get; set; }

        // 电子提单类型
        [NameInMap("ebl_category")]
        [Validation(Required=true)]
        public string EblCategory { get; set; }

        // 电子提单copy文件hash
        [NameInMap("ebl_copy_pdf_file_hash")]
        [Validation(Required=true)]
        public string EblCopyPdfFileHash { get; set; }

        // copy电子提单pdf文件id
        [NameInMap("ebl_copy_pdf_file_id")]
        [Validation(Required=true)]
        public string EblCopyPdfFileId { get; set; }

        // 电子提单编号
        [NameInMap("ebl_no")]
        [Validation(Required=true)]
        public string EblNo { get; set; }

        // 电子甜的原文件hash
        [NameInMap("ebl_original_pdf_file_hash")]
        [Validation(Required=false)]
        public string EblOriginalPdfFileHash { get; set; }

        // 原电子提单pdf文件id
        [NameInMap("ebl_original_pdf_file_id")]
        [Validation(Required=false)]
        public string EblOriginalPdfFileId { get; set; }

        // 议付行did
        [NameInMap("negotiating_bank_did")]
        [Validation(Required=true)]
        public string NegotiatingBankDid { get; set; }

        // 托运人did
        [NameInMap("shipper_did")]
        [Validation(Required=true)]
        public string ShipperDid { get; set; }

    }

}
