// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 二级商户入驻结果
    public class SubMerchantOrder : TeaModel {
        // 是否开通线上预授权，
        // TRUE/FALSE
        [NameInMap("app_pre_auth")]
        [Validation(Required=false)]
        public string AppPreAuth { get; set; }

        // 申请单创建时间
        [NameInMap("apply_time")]
        [Validation(Required=true)]
        public string ApplyTime { get; set; }

        // 本申请单的请求类型，
        // 商户预校验: ZHIFUTONG_CONSULT
        // 商户创建: ZHIFUTONG_CREATE
        // 商户修改: ZHIFUTONG_MODIFY
        // 
        [NameInMap("apply_type")]
        [Validation(Required=true)]
        public string ApplyType { get; set; }

        // 进件生成的卡编号，在发起结算时可以作为结算账号
        [NameInMap("card_alias_no")]
        [Validation(Required=false)]
        public string CardAliasNo { get; set; }

        // 外部商户id
        [NameInMap("external_id")]
        [Validation(Required=true)]
        public string ExternalId { get; set; }

        // 是否开通线下预授权，
        // TRUE/FALSE
        [NameInMap("face_pre_auth")]
        [Validation(Required=false)]
        public string FacePreAuth { get; set; }

        // 风控审核状态，
        // CREATE: 已创建待审批
        // SKIP: 跳过风控审批步骤
        // PASS: 风控审核通过
        // REJECT: 风控审批拒绝
        // 
        [NameInMap("fk_audit")]
        [Validation(Required=false)]
        public string FkAudit { get; set; }

        // 风控审批备注
        [NameInMap("fk_audit_memo")]
        [Validation(Required=false)]
        public string FkAuditMemo { get; set; }

        // 判断个人当面付权限版本，
        // TRUE: 表示是标准版
        // FALSE: 表示受限版
        // 
        [NameInMap("is_face_limit")]
        [Validation(Required=false)]
        public string IsFaceLimit { get; set; }

        // 客资审核状态，
        // CREATE: 已创建待审批
        // SKIP: 跳过客资审批步骤
        // PASS: 客资审核通过
        // REJECT: 客资审批拒绝
        [NameInMap("kz_audit")]
        [Validation(Required=false)]
        public string KzAudit { get; set; }

        // 客资审批备注
        [NameInMap("kz_audit_memo")]
        [Validation(Required=false)]
        public string KzAuditMemo { get; set; }

        // 进件时填写的商户名称
        [NameInMap("merchant_name")]
        [Validation(Required=false)]
        public string MerchantName { get; set; }

        // 入驻申请单号
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 申请单处理失败时，通过此此段返回具体的失败理由，
        // 与kf_audit_memo和kz_audit_memo配合使用
        [NameInMap("reason")]
        [Validation(Required=false)]
        public string Reason { get; set; }

        // 签约支付宝账号（脱敏）
        [NameInMap("safe_binding_logon_id")]
        [Validation(Required=false)]
        public string SafeBindingLogonId { get; set; }

        // 二级商户id，当总体申请状态status为99时，smid才算进件完成
        [NameInMap("smid")]
        [Validation(Required=false)]
        public string Smid { get; set; }

        // 申请总体状态，
        // 99: 已完结
        // -1: 失败
        // 031: 审核中
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 二级商户确认状态，
        // CREATE: 已发起二级商户确认
        // SKIP: 无需确认
        // FAIL: 签约失败
        // NOT_CONFIRM: 商户未确认
        // FINISH: 签约完成
        [NameInMap("sub_confirm")]
        [Validation(Required=false)]
        public string SubConfirm { get; set; }

    }

}
