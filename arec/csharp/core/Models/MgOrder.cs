// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    // 抵押单
    public class MgOrder : TeaModel {
        // 已签署的合同列表
        [NameInMap("agreements")]
        [Validation(Required=false)]
        public List<Agreement> Agreements { get; set; }

        // 附件材料列表
        [NameInMap("archives")]
        [Validation(Required=false)]
        public List<Archive> Archives { get; set; }

        // 房屋授权查询合同签署任务
        [NameInMap("auth_ar_sign_task")]
        [Validation(Required=false)]
        public ArSignTask AuthArSignTask { get; set; }

        // 银行名称
        [NameInMap("bank_name")]
        [Validation(Required=false)]
        public string BankName { get; set; }

        // 银行编号
        [NameInMap("bank_no")]
        [Validation(Required=false)]
        public string BankNo { get; set; }

        // 借款人身份证号
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

        // 证件类型，比如：ID_CARD=身份证
        [NameInMap("cert_type")]
        [Validation(Required=false)]
        public string CertType { get; set; }

        // 借款人编号
        [NameInMap("cm_no")]
        [Validation(Required=false)]
        public string CmNo { get; set; }

        // 抵押登记结束日期
        [NameInMap("end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // 抵押登记失败类型，比如：MF_REALTY_NOT_EXISTS=房产信息不存在
        [NameInMap("fail_code")]
        [Validation(Required=false)]
        public string FailCode { get; set; }

        // 抵押登记错误信息描述
        [NameInMap("fail_desc")]
        [Validation(Required=false)]
        public string FailDesc { get; set; }

        // 不动产返回房产信息
        [NameInMap("house")]
        [Validation(Required=false)]
        public House House { get; set; }

        // 确认预抵押登记时的所有合同变量和值的结合,Map<Sting,String>的json格式
        [NameInMap("init_ar_var_value_json")]
        [Validation(Required=false)]
        public string InitArVarValueJson { get; set; }

        // 借款人婚姻状况，比如：MARRIED=已婚
        [NameInMap("marriage")]
        [Validation(Required=false)]
        public string Marriage { get; set; }

        // 抵押登记相关合同签署任务列表
        [NameInMap("mg_ar_sign_tasks")]
        [Validation(Required=false)]
        public List<ArSignTask> MgArSignTasks { get; set; }

        // 抵押登记回执
        [NameInMap("mg_cert")]
        [Validation(Required=false)]
        public MgCert MgCert { get; set; }

        // 抵押单号
        [NameInMap("mg_order_no")]
        [Validation(Required=false)]
        public string MgOrderNo { get; set; }

        // 借款人身份证
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 银行的业务编号
        [NameInMap("out_biz_no")]
        [Validation(Required=false)]
        public string OutBizNo { get; set; }

        // 抵押登记申请日期
        [NameInMap("reg_apply_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string RegApplyDate { get; set; }

        // 登记设立原因，比如：LOAN=借贷
        [NameInMap("reg_reason")]
        [Validation(Required=false)]
        public string RegReason { get; set; }

        // 登记设立原因描述
        [NameInMap("reg_reason_remark")]
        [Validation(Required=false)]
        public string RegReasonRemark { get; set; }

        // 登记权利,比如：MORTGAGE_RIGHTS=抵押权
        [NameInMap("reg_rights")]
        [Validation(Required=false)]
        public string RegRights { get; set; }

        // 登记类型，比如：FIRST_REG=首次登记
        [NameInMap("reg_type")]
        [Validation(Required=false)]
        public string RegType { get; set; }

        // 不动产中心的抵押登记号
        [NameInMap("rtc_mg_order_no")]
        [Validation(Required=false)]
        public string RtcMgOrderNo { get; set; }

        // 不动产登记中心名称
        [NameInMap("rtc_name")]
        [Validation(Required=false)]
        public string RtcName { get; set; }

        // 不动产登记中心编号
        [NameInMap("rtc_no")]
        [Validation(Required=false)]
        public string RtcNo { get; set; }

        // 借款人配偶客户编号
        [NameInMap("spouse_cm_no")]
        [Validation(Required=false)]
        public string SpouseCmNo { get; set; }

        // 发起抵押登记时的所有合同变量和值的结合,Map<Sting,String>的json格式
        [NameInMap("start_ar_var_value_json")]
        [Validation(Required=false)]
        public string StartArVarValueJson { get; set; }

        // 抵押登记发起日期
        [NameInMap("start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 抵押单状态 ，比如：MG_ING=抵押登记中
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 扩展字段
        [NameInMap("extend_json")]
        [Validation(Required=false)]
        public string ExtendJson { get; set; }

        // 助贷平台
        [NameInMap("loan_assist_platform")]
        [Validation(Required=false)]
        public string LoanAssistPlatform { get; set; }

        // 办理业务分支行
        [NameInMap("branch_bank")]
        [Validation(Required=false)]
        public Bank BranchBank { get; set; }

    }

}
