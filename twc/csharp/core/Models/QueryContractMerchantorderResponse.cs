// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryContractMerchantorderResponse : TeaModel {
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

        // 申请单id
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 外部商户id
        [NameInMap("external_id")]
        [Validation(Required=false)]
        public string ExternalId { get; set; }

        // 进件时填写的商户名称
        [NameInMap("merchant_name")]
        [Validation(Required=false)]
        public string MerchantName { get; set; }

        // 申请总体状态。99:已完结;-1:失败;031:审核中
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 申请单创建时间
        [NameInMap("apply_time")]
        [Validation(Required=false)]
        public string ApplyTime { get; set; }

        // 风控审核状态。CREATE：已创建待审批、SKIP：跳过风控审批步骤、PASS：风控审核通过、REJECT：风控审批拒绝
        [NameInMap("fk_audit")]
        [Validation(Required=false)]
        public string FkAudit { get; set; }

        // 风控审批备注，如有则返回
        [NameInMap("fk_audit_memo")]
        [Validation(Required=false)]
        public string FkAuditMemo { get; set; }

        // 客资审核状态。CREATE：已创建待审批、SKIP：跳过客资审批步骤、PASS：客资审核通过、REJECT：客资审批拒绝
        [NameInMap("kz_audit")]
        [Validation(Required=false)]
        public string KzAudit { get; set; }

        // 客资审批备注，如有则返回
        [NameInMap("kz_audit_memo")]
        [Validation(Required=false)]
        public string KzAuditMemo { get; set; }

        // 二级商户确认状态。CREATE：已发起二级商户确认、SKIP：无需确认、FAIL：签约失败、NOT_CONFIRM：商户未确认、FINISH签约完成
        [NameInMap("sub_confirm")]
        [Validation(Required=false)]
        public string SubConfirm { get; set; }

        // 进件生成的卡编号，在发起结算时可以作为结算账号
        [NameInMap("card_alias_no")]
        [Validation(Required=false)]
        public string CardAliasNo { get; set; }

        // 二级商户id。当总体申请状态status为99时，smid才算进件完成
        [NameInMap("smid")]
        [Validation(Required=false)]
        public string Smid { get; set; }

        // 本申请单的请求类型。一般可选值包括ZHIFUTONG_CONSULT（直付通商户预校验）/ZHIFUTONG_CREATE（直付通商户创建）/ZHIFUTONG_MODIFY（直付通商户修改）
        [NameInMap("apply_type")]
        [Validation(Required=false)]
        public string ApplyType { get; set; }

        // 申请单处理失败时，通过此此段返回具体的失败理由；与kf_audit_memo和kz_audit_memo配合使用
        [NameInMap("reason")]
        [Validation(Required=false)]
        public string Reason { get; set; }

    }

}
