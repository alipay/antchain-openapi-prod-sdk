// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class AddEcarGreenoperationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 绿色行为类型，目前支持包括：
        // ElectronicInvoice(电子发票), 
        // LowCarbonCommodity(低碳商品), 
        // ReusableBag(环保减塑)
        // OfflinePayment(线下支付)
        // GreenOrder(绿色订单，可以同时解析出低碳商品、环保减塑、线下支付等多种绿色行为)
        [NameInMap("green_operation_type")]
        [Validation(Required=true)]
        public string GreenOperationType { get; set; }

        // 绿色行为相关的业务单号
        [NameInMap("enterprise_biz_no")]
        [Validation(Required=true)]
        public string EnterpriseBizNo { get; set; }

        // 发生时间，格式应如：2021-07-21 12:11:11
        [NameInMap("occurrence_time")]
        [Validation(Required=true)]
        public string OccurrenceTime { get; set; }

        // 绿色行为数据扩展信息，必须为JSON格式，碳矩阵将分析解析数据检查获取相关的绿色行为数据
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
