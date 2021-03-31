// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class UploadTransportReceiptRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 货主did，一般为合同甲方的链上数字身份
        [NameInMap("consignor_did")]
        [Validation(Required=true)]
        public string ConsignorDid { get; set; }

        // 请求蚂蚁影像上传接口上传文件获取的文件id和文件hash信息。影像文件格式：bmp,jpg,jpeg,gif,psd,png,tiff,tga,eps,pdf
        [NameInMap("file_info")]
        [Validation(Required=true)]
        public UploadFileInfo FileInfo { get; set; }

        // 回单id，客户编辑的唯一回单编码
        [NameInMap("receipt_id")]
        [Validation(Required=true)]
        public string ReceiptId { get; set; }

        // 客户系统内运单编号
        [NameInMap("tax_waybill_id")]
        [Validation(Required=true)]
        public string TaxWaybillId { get; set; }

        // 3plDid，一般为合同乙方的链上数字身份
        [NameInMap("third_party_logistics_did")]
        [Validation(Required=true)]
        public string ThirdPartyLogisticsDid { get; set; }

    }

}
