// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class UploadSignTemplateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单所属商户的统一社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 合同类型
        [NameInMap("contract_type")]
        [Validation(Required=false)]
        public string ContractType { get; set; }

        // 模板类型
        [NameInMap("agreement_type")]
        [Validation(Required=false)]
        public string AgreementType { get; set; }

        // 签署区坐标配置
        [NameInMap("pos_conf")]
        [Validation(Required=true)]
        public string PosConf { get; set; }

        // 模板参数
        [NameInMap("template_args")]
        [Validation(Required=false)]
        public string TemplateArgs { get; set; }

        // 上传的pdf文件，需要以.pdf后缀结尾
        /// <summary>
        /// 待上传文件
        /// </summary>
        [NameInMap("fileObject")]
        [Validation(Required=false)]
        public Stream FileObject { get; set; }

        /// <summary>
        /// 待上传文件名
        /// </summary>
        [NameInMap("fileObjectName")]
        [Validation(Required=false)]
        public string FileObjectName { get; set; }

        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 资方统一社会信用代码，默认为空
        [NameInMap("fund_id")]
        [Validation(Required=false)]
        public string FundId { get; set; }

        // 是否需要资方签署，默认为否
        [NameInMap("fund_sign")]
        [Validation(Required=false)]
        public bool? FundSign { get; set; }

        // 资方签署区坐标，默认为空
        [NameInMap("fund_pos_conf")]
        [Validation(Required=false)]
        public string FundPosConf { get; set; }

    }

}
