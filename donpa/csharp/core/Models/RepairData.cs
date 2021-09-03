// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DONPA.Models
{
    // 修复数据
    public class RepairData : TeaModel {
        // 修复结果状态：“RPS001”: 不可外呼，”RPS002":可以 外呼
        [NameInMap("repair_status")]
        [Validation(Required=true)]
        public string RepairStatus { get; set; }

        // 身份证号
        [NameInMap("id_card")]
        [Validation(Required=true)]
        public string IdCard { get; set; }

        // 姓名：显示的姓名为修复请求的 待修复人名
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 案件编号，特定使用运营商页面平台产生
        [NameInMap("case_no")]
        [Validation(Required=false)]
        public string CaseNo { get; set; }

        // 修复号码数量
        [NameInMap("result_list_number")]
        [Validation(Required=true)]
        public long? ResultListNumber { get; set; }

    }

}
