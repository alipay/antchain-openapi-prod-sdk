// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 经营分账信息
    public class OperateDivideInfo : TeaModel {
        // 当前用户履约的租期编号
        [NameInMap("period_num")]
        [Validation(Required=false)]
        public long? PeriodNum { get; set; }

        // 经营分账收入方结果信息
        [NameInMap("operation_divide_trans_in_list")]
        [Validation(Required=false)]
        public List<OperationDivideTransInDetailInfo> OperationDivideTransInList { get; set; }

    }

}
