// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeaseRentalRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 融资租赁业务id，由资方控制台生成返回
        [NameInMap("application_id")]
        [Validation(Required=false)]
        public string ApplicationId { get; set; }

        // 手续费，如通过预授权、代扣的方式规划，必填
        [NameInMap("charge")]
        [Validation(Required=true)]
        public long? Charge { get; set; }

        // 融资租赁用户还款额外字段
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 是否本订单所有租金还款状态结束
        [NameInMap("is_finish")]
        [Validation(Required=true)]
        public bool? IsFinish { get; set; }

        // 租期编号，从1开始
        [NameInMap("lease_term_index")]
        [Validation(Required=true)]
        public long? LeaseTermIndex { get; set; }

        // 订单id 长度不可超过50
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 剩余租金总数,会核验剩余租金与承诺等额
        [NameInMap("remain_rental")]
        [Validation(Required=true)]
        public long? RemainRental { get; set; }

        // 剩余归还期数
        [NameInMap("remain_term")]
        [Validation(Required=true)]
        public long? RemainTerm { get; set; }

        // 租金归还金额,精确到毫厘，即123400表示12.34元
        [NameInMap("rental_money")]
        [Validation(Required=true)]
        public long? RentalMoney { get; set; }

        // 租金归还状态，1.足额归还2.部分归还3.未归还
        [NameInMap("rental_return_state")]
        [Validation(Required=true)]
        public long? RentalReturnState { get; set; }

        // 归还时间，格式为"2019-07-31 12:00:00"
        [NameInMap("return_time")]
        [Validation(Required=true)]
        public string ReturnTime { get; set; }

        // 还款凭证编号，不超过128字符，1.支付宝流水号
        [NameInMap("return_voucher_serial")]
        [Validation(Required=true)]
        public string ReturnVoucherSerial { get; set; }

        // 还款凭证类型，1.支付宝2.平台代收（客户主动还款）3.其他
        [NameInMap("return_voucher_type")]
        [Validation(Required=true)]
        public long? ReturnVoucherType { get; set; }

        // 归还方式，1.预授权代扣2.支付宝代扣3.主动还款4.其他
        [NameInMap("return_way")]
        [Validation(Required=true)]
        public long? ReturnWay { get; set; }

        // 是否启动订单的异步处理
        [NameInMap("async")]
        [Validation(Required=false)]
        public long? Async { get; set; }

    }

}
