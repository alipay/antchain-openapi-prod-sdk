// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 租赁宝plus保单详情
    public class InsuranceRecordInfo : TeaModel {
        // bcl订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 保险单号
        [NameInMap("bcl_insurance_record_id")]
        [Validation(Required=true)]
        public string BclInsuranceRecordId { get; set; }

        // 投保人信息
        [NameInMap("holder")]
        [Validation(Required=true)]
        public BclInsuranceUserInfo Holder { get; set; }

        // 被保人信息
        [NameInMap("insured")]
        [Validation(Required=true)]
        public BclInsuranceUserInfo Insured { get; set; }

        // 保司信息
        [NameInMap("insurancer")]
        [Validation(Required=true)]
        public BclInsuranceUserInfo Insurancer { get; set; }

        // 保单状态
        // RECORD_INSURE_INIT: 投保流程初始化
        // RECORD_INSURE_TOBE: 待投保
        // RECORD_INSURE_EXCHANGE_SUCC: 投保申请成功
        // RECORD_INSURE_EXCHANGE_FAIL: 投保申请失败
        // RECORD_INSURE_SUCC: 投保成功
        // RECORD_INSURE_FAIL: 投保失败
        // RECORD_CANCEL_INIT: 退保初始
        // RECORD_CANCEL_SUCC: 退保成功
        // RECORD_CANCEL_FAIL: 退保失败
        [NameInMap("insurance_status")]
        [Validation(Required=true)]
        public string InsuranceStatus { get; set; }

        // 起保时间
        // 格式: yyyy-MM-dd HH:mm:ss
        [NameInMap("insurance_start_time")]
        [Validation(Required=false)]
        public string InsuranceStartTime { get; set; }

        // 终保时间
        // 格式: yyyy-MM-dd HH:mm:ss
        [NameInMap("insurance_end_time")]
        [Validation(Required=false)]
        public string InsuranceEndTime { get; set; }

        // 保额 单位分
        [NameInMap("insurance_amount")]
        [Validation(Required=false)]
        public long? InsuranceAmount { get; set; }

        // 保费 单位分
        [NameInMap("premium")]
        [Validation(Required=false)]
        public long? Premium { get; set; }

        // riskGo分数
        [NameInMap("riskgo_score")]
        [Validation(Required=false)]
        public long? RiskgoScore { get; set; }

        // 保险详情地址
        [NameInMap("insurance_url")]
        [Validation(Required=false)]
        public string InsuranceUrl { get; set; }

        // 投保失败的具体原因, 投保失败时返回
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 退保详情
        [NameInMap("insurance_cancel_record_info_list")]
        [Validation(Required=false)]
        public List<InsuranceCancelRecordInfo> InsuranceCancelRecordInfoList { get; set; }

    }

}
