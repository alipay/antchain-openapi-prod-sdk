// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 数字票根通用字段
    public class StubCommonInfo : TeaModel {
        // 项目名称
        [NameInMap("project_name")]
        [Validation(Required=true)]
        public string ProjectName { get; set; }

        // 客户名称（三方合约中甲方名称：景区或服务商）
        [NameInMap("scene_name")]
        [Validation(Required=true)]
        public string SceneName { get; set; }

        // 业务类型。目前只有数字票根这一个情景，枚举为：TICKET_STUB
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 业务来源；Alipay：支付宝，Scene：景区
        [NameInMap("biz_source")]
        [Validation(Required=true)]
        public string BizSource { get; set; }

        // 订单id。若bizSource为支付宝情况下传支付宝流水号（业务系统的出票流水号）；若bizSource为景区时传上游生成的订单号
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 订单名称
        [NameInMap("order_name")]
        [Validation(Required=false)]
        public string OrderName { get; set; }

        // 订单总金额，单位：分。如传100，即为100分，1元
        [NameInMap("order_amount")]
        [Validation(Required=true)]
        public long? OrderAmount { get; set; }

        // 下单时间
        [NameInMap("order_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string OrderTime { get; set; }

        // 待分账金额，单位：分。如传100，即为100分，1元
        [NameInMap("stub_amount")]
        [Validation(Required=true)]
        public long? StubAmount { get; set; }

        // 客户id。支付宝情况下传支付宝id，2088打头；景区时可传自定义的客户id
        [NameInMap("customer_id")]
        [Validation(Required=true)]
        public string CustomerId { get; set; }

    }

}
