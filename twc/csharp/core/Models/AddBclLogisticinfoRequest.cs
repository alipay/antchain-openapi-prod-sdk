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

        // 租赁订单ID
        // 最大长度：32
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=32)]
        public string OrderId { get; set; }

        // 物流状态
        // 1.已发货：SHIPPED 
        // 2.已签收：SIGNED
        [NameInMap("logistic_status")]
        [Validation(Required=true, MaxLength=16)]
        public string LogisticStatus { get; set; }

        // 物流照片网关文件ID
        // 先调用文件上传的接口,这里填上传后返回的fileid
        [NameInMap("logistics_file_id")]
        [Validation(Required=false, MaxLength=64)]
        public string LogisticsFileId { get; set; }

        // 签收记录,网关文件ID
        // 先调用文件上传的接口,这里填上传后返回的fileid
        [NameInMap("arrive_confirm_file_id")]
        [Validation(Required=false, MaxLength=64)]
        public string ArriveConfirmFileId { get; set; }

        // 用户签收时间
        // 示例：2023-06-27T10:50:23+08:00
        [NameInMap("arrive_confirm_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ArriveConfirmTime { get; set; }

        // 物流公司简称
        [NameInMap("logistic_company_name")]
        [Validation(Required=true, MaxLength=32)]
        public string LogisticCompanyName { get; set; }

        // 物流公司code：
        // 1.圆通速递：YTO
        // 2.韵达快递：YUNDA
        // 3.顺丰速运：SF
        // 4.EMS：EMS
        // 5.申通快递：STO
        // 6.中通快递：ZTO
        // 7.天天快递：TTKDEX
        // 8.全峰快递：QFKD
        // 9.中铁物流：ZTKY
        // 10.其他：OTHER
        [NameInMap("logistic_company_code")]
        [Validation(Required=true, MaxLength=32)]
        public string LogisticCompanyCode { get; set; }

        // 物流订单ID
        // 最大长度64
        [NameInMap("logistics_order_id")]
        [Validation(Required=true, MaxLength=64)]
        public string LogisticsOrderId { get; set; }

        // 物流发货时间
        // 示例：2023-06-27T10:50:23+08:00
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
        [Validation(Required=true, MaxLength=128)]
        public string ArriveName { get; set; }

        // 收货人联系电话
        [NameInMap("arrive_mobile")]
        [Validation(Required=true, MaxLength=32)]
        public string ArriveMobile { get; set; }

    }

}
