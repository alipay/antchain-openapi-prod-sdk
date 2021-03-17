// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    // 房产查询单
    public class HqOrder : TeaModel {
        // 房产链房产查询单号
        [NameInMap("house_query_order_no")]
        [Validation(Required=false)]
        public string HouseQueryOrderNo { get; set; }

        // 房产链房产查询单状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 房产查询场景,NO_AUTH_QUERY=无授权直查
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

        // 2334898983498394838C
        [NameInMap("out_biz_no")]
        [Validation(Required=false)]
        public string OutBizNo { get; set; }

        // 助贷平台
        [NameInMap("loan_assist_platform")]
        [Validation(Required=false)]
        public string LoanAssistPlatform { get; set; }

        // 房产链内部银行编号
        [NameInMap("bank_no")]
        [Validation(Required=false)]
        public string BankNo { get; set; }

        // 银行名称
        [NameInMap("bank_name")]
        [Validation(Required=false)]
        public string BankName { get; set; }

        // 房产链内部不动产中心编号
        [NameInMap("rtc_no")]
        [Validation(Required=false)]
        public string RtcNo { get; set; }

        // 不动产中心名称
        [NameInMap("rtc_name")]
        [Validation(Required=false)]
        public string RtcName { get; set; }

        // 房产权证类型
        [NameInMap("house_cert_type")]
        [Validation(Required=false)]
        public string HouseCertType { get; set; }

        // 权证编号(短号)
        [NameInMap("house_cert_no")]
        [Validation(Required=false)]
        public string HouseCertNo { get; set; }

        // 房产查询单生成时间
        [NameInMap("start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 房产查询单结束时间
        [NameInMap("end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // 房产查询失败原因，MF_REALTY_NOT_EXISTS=房产信息不存在
        [NameInMap("fail_code")]
        [Validation(Required=false)]
        public string FailCode { get; set; }

        // 房产查询失败描述
        [NameInMap("fail_desc")]
        [Validation(Required=false)]
        public string FailDesc { get; set; }

        // 业务办理分支行
        [NameInMap("branch_bank")]
        [Validation(Required=false)]
        public Bank BranchBank { get; set; }

        // 房产信息
        [NameInMap("house")]
        [Validation(Required=false)]
        public House House { get; set; }

    }

}
