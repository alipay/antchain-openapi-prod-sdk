// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class DetailInnerAgreementterminateResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 订单ID
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 申请解约号
        [NameInMap("terminate_apply_id")]
        [Validation(Required=false)]
        public string TerminateApplyId { get; set; }

        // 订单创建时间
        [NameInMap("order_gmt_create")]
        [Validation(Required=false)]
        public string OrderGmtCreate { get; set; }

        // 用户解约申请时间
        [NameInMap("gmt_terminate_apply")]
        [Validation(Required=false)]
        public string GmtTerminateApply { get; set; }

        // 解约状态
        [NameInMap("terminate_status")]
        [Validation(Required=false)]
        public string TerminateStatus { get; set; }

        // 商家举证材料列表
        [NameInMap("merchant_support_evidence_list")]
        [Validation(Required=false)]
        public List<MerchantSupportEvidence> MerchantSupportEvidenceList { get; set; }

        // 用户申请解约材料
        [NameInMap("terminate_apply_evidence_list")]
        [Validation(Required=false)]
        public List<TerminateApplyEvidence> TerminateApplyEvidenceList { get; set; }

        // 代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
        [NameInMap("external_agreement_no")]
        [Validation(Required=false)]
        public string ExternalAgreementNo { get; set; }

        // 支付宝系统中用以唯一标识用户签约记录的编号
        [NameInMap("agreement_no")]
        [Validation(Required=false)]
        public string AgreementNo { get; set; }

        // 处理状态
        [NameInMap("handle_status")]
        [Validation(Required=false)]
        public string HandleStatus { get; set; }

    }

}
