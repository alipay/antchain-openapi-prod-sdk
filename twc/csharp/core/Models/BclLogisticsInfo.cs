// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 物流信息
    public class BclLogisticsInfo : TeaModel {
        // 物流订单
        [NameInMap("logistics_order_id")]
        [Validation(Required=true)]
        public string LogisticsOrderId { get; set; }

        // 物流公司
        [NameInMap("logistic_company")]
        [Validation(Required=true)]
        public string LogisticCompany { get; set; }

        // 物流状态
        // 1.已发货：SHIPPED
        // 2.已签收：SIGNED
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 发货时间
        // 示例：2023-06-27T10:50:23+08:00
        [NameInMap("deliver_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DeliverTime { get; set; }

        // 租赁类型
        // 1.租赁：LEASE
        // 2.退租：RETURN_LEASE
        [NameInMap("lease_type")]
        [Validation(Required=true)]
        public string LeaseType { get; set; }

        // 签收时间
        // 示例：2023-06-27T10:50:23+08:00
        [NameInMap("arrive_confirm_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ArriveConfirmTime { get; set; }

        // 签收文件下载链接
        [NameInMap("arrive_confirm_file_url")]
        [Validation(Required=true)]
        public string ArriveConfirmFileUrl { get; set; }

        // 发货地址
        [NameInMap("deliver_address")]
        [Validation(Required=true)]
        public string DeliverAddress { get; set; }

        // 收货地址
        [NameInMap("arrive_address")]
        [Validation(Required=true)]
        public string ArriveAddress { get; set; }

        // 收货人姓名 脱敏
        [NameInMap("arrive_name")]
        [Validation(Required=true)]
        public string ArriveName { get; set; }

        // 收货人联系电话 脱敏
        [NameInMap("arrive_mobile")]
        [Validation(Required=true)]
        public string ArriveMobile { get; set; }

        // 物流公司标志,参考菜鸟的物流公司定义
        [NameInMap("logistic_company_code")]
        [Validation(Required=false)]
        public string LogisticCompanyCode { get; set; }

    }

}
