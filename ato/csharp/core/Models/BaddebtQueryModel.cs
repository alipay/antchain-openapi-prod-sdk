// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 行业履约风险识别入参模型
    public class BaddebtQueryModel : TeaModel {
        // 服务分类，服务二级分类
        [NameInMap("service_category")]
        [Validation(Required=false, MaxLength=128)]
        public string ServiceCategory { get; set; }

        // 总金额，用户购买或使用服务时产生的具体金额
        [NameInMap("total_amount")]
        [Validation(Required=false)]
        public long? TotalAmount { get; set; }

        // 商品数量，用户购买或使用服务时产生的具体商品数量
        [NameInMap("total_quantity")]
        [Validation(Required=false)]
        public long? TotalQuantity { get; set; }

        // 用户姓名
        [NameInMap("user_name")]
        [Validation(Required=false, MaxLength=128)]
        public string UserName { get; set; }

        // 服务商 pid
        [NameInMap("isv_pid")]
        [Validation(Required=false, MaxLength=128)]
        public string IsvPid { get; set; }

        // 终端唯一标识
        [NameInMap("apdid")]
        [Validation(Required=false, MaxLength=128)]
        public string Apdid { get; set; }

    }

}
