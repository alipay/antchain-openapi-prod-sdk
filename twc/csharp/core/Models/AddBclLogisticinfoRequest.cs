// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class AddBclLogisticinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=32)]
        public string OrderId { get; set; }

        // - SHIPPED 已发货 
        // - TRANSPORT 运输中 
        // - SIGNED 已签收  
        // 当前暂时只支持已发货和已签收
        [NameInMap("logistic_status")]
        [Validation(Required=true, MaxLength=16)]
        public string LogisticStatus { get; set; }

        // 物流照片网关文件id,调用网关文件上传时文件的名称(包含文件后缀)不要超过32位
        [NameInMap("logistics_file_id")]
        [Validation(Required=false, MaxLength=64)]
        public string LogisticsFileId { get; set; }

        // 签收记录,网关文件id,调用网关文件上传时文件的名称(包含文件后缀)不要超过32位
        [NameInMap("arrive_confirm_file_id")]
        [Validation(Required=false, MaxLength=64)]
        public string ArriveConfirmFileId { get; set; }

        // 用户签收时间格式为2019-8-31 12:00:00
        [NameInMap("arrive_confirm_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ArriveConfirmTime { get; set; }

        // 物流公司简称
        [NameInMap("logistic_company_name")]
        [Validation(Required=true, MaxLength=32)]
        public string LogisticCompanyName { get; set; }

        // 物流公司code
        [NameInMap("logistic_company_code")]
        [Validation(Required=true, MaxLength=32)]
        public string LogisticCompanyCode { get; set; }

        // 物流订单id
        [NameInMap("logistics_order_id")]
        [Validation(Required=true, MaxLength=64)]
        public string LogisticsOrderId { get; set; }

        // 物流发货时间,格式为2019-8-31 12:00:00
        [NameInMap("deliver_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DeliverTime { get; set; }

        // 租赁状态
        // LEASE,租赁 
        // RETURN_LEASE,退租
        [NameInMap("lease_type")]
        [Validation(Required=true, MaxLength=16)]
        public string LeaseType { get; set; }

        // 发货地址
        [NameInMap("deliver_address")]
        [Validation(Required=true, MaxLength=512)]
        public string DeliverAddress { get; set; }

        // 收货地址
        [NameInMap("arrive_address")]
        [Validation(Required=true, MaxLength=512)]
        public string ArriveAddress { get; set; }

        // 收货人姓名
        [NameInMap("arrive_name")]
        [Validation(Required=true, MaxLength=32)]
        public string ArriveName { get; set; }

        // 收货人联系电话
        [NameInMap("arrive_mobile")]
        [Validation(Required=true, MaxLength=32)]
        public string ArriveMobile { get; set; }

    }

}
