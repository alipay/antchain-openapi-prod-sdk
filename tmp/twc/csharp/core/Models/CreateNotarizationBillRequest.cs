// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateNotarizationBillRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 支付宝交易订单号
        [NameInMap("alipay_order_no")]
        [Validation(Required=false)]
        public string AlipayOrderNo { get; set; }

        // 支付宝用户ID
        [NameInMap("alipay_uid")]
        [Validation(Required=false)]
        public string AlipayUid { get; set; }

        // 申请者名称
        [NameInMap("cert_name")]
        [Validation(Required=false)]
        public string CertName { get; set; }

        // 申请者证件号码：身份证号码（个人用户）或企业统一社会信用代码（企业用户）
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

        // 电子公证书业务细项，如“200”对应出生公证
        [NameInMap("e_notarization_biz")]
        [Validation(Required=false)]
        public string ENotarizationBiz { get; set; }

        // 电子公证书下载地址
        [NameInMap("e_notarization_download_url")]
        [Validation(Required=false)]
        public string ENotarizationDownloadUrl { get; set; }

        // 电子公证书编号
        [NameInMap("e_notarization_no")]
        [Validation(Required=false)]
        public string ENotarizationNo { get; set; }

        // 电子公证书页数
        [NameInMap("e_notarization_page_no")]
        [Validation(Required=false)]
        public string ENotarizationPageNo { get; set; }

        // 电子公证书状态码
        [NameInMap("e_notarization_status")]
        [Validation(Required=false)]
        public string ENotarizationStatus { get; set; }

        // 电子公证书业务用途
        [NameInMap("e_notarization_usage")]
        [Validation(Required=false)]
        public string ENotarizationUsage { get; set; }

        // 电子公证书有效期
        [NameInMap("e_notarization_valid_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ENotarizationValidDate { get; set; }

        // 企业法人姓名（企业用户必填）
        [NameInMap("legal_person_name")]
        [Validation(Required=false)]
        public string LegalPersonName { get; set; }

        // 出证订单ID
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 出证机构ID
        [NameInMap("org_id")]
        [Validation(Required=false)]
        public string OrgId { get; set; }

        // 支付宝交易订单支付金额（人民币），单位为分
        [NameInMap("payment_amount")]
        [Validation(Required=false)]
        public long? PaymentAmount { get; set; }

        // 联系电话
        [NameInMap("phone")]
        [Validation(Required=false)]
        public string Phone { get; set; }

        // 场景枚举：E_NOTARIZATION（电子公证），NOTARY_CERTIFICATION（存证证明）
        [NameInMap("scenario")]
        [Validation(Required=true)]
        public string Scenario { get; set; }

        // 申请者身份类型，1个人，2企业
        [NameInMap("user_type")]
        [Validation(Required=false)]
        public long? UserType { get; set; }

        // 是否为酬金分润方式，是则按照订金额一定比例分润，否则直接支付订单金额
        [NameInMap("fee_splitting")]
        [Validation(Required=true)]
        public bool? FeeSplitting { get; set; }

    }

}
