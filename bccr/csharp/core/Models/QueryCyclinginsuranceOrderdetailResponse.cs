// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class QueryCyclinginsuranceOrderdetailResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 订单号
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 订单账号
        [NameInMap("acoount_id")]
        [Validation(Required=false)]
        public string AcoountId { get; set; }

        // 商品码
        [NameInMap("item_code")]
        [Validation(Required=false)]
        public string ItemCode { get; set; }

        // 商品属性
        // serviceStartTime:服务开始时间
        // serviceEndTime:服务结束时间
        // tenantAddress:上门地址
        // tenantPhone:租赁人电话
        // insurancePolicyId:保险单号
        // batteryType:电池型号
        [NameInMap("item_attributes")]
        [Validation(Required=false)]
        public string ItemAttributes { get; set; }

        // 订单履约流程信息
        // workerName:上门师傅姓名
        // workerPhone:上门师傅电话
        // batteryCode:电池码
        // batteryPackagingCode:电池外包装码
        // batteryGroupCode:电池组码
        [NameInMap("fulfillment_process_info")]
        [Validation(Required=false)]
        public string FulfillmentProcessInfo { get; set; }

        // 附件
        // installImages: 上门安装图片
        [NameInMap("attachments")]
        [Validation(Required=false)]
        public string Attachments { get; set; }

        // waitDoorToDoor 待配送
        // doorToDoorFinish 已完成
        // doorToDoorCancel 已取消
        [NameInMap("order_status")]
        [Validation(Required=false)]
        public string OrderStatus { get; set; }

    }

}
