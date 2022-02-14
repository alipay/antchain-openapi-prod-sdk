// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 融资租赁用户侧还款条目
    public class LeaseRentalInfo : TeaModel {
        // 租期编号
        [NameInMap("term")]
        [Validation(Required=true)]
        public long? Term { get; set; }

        // 租金归还状态，1.足额归还2.部分归还3.未归还
        [NameInMap("rental_return_state")]
        [Validation(Required=true)]
        public long? RentalReturnState { get; set; }

        // 租金归还金额,精确到毫厘，即123400表示12.34元
        [NameInMap("rental_money")]
        [Validation(Required=true)]
        public long? RentalMoney { get; set; }

        // 归还时间
        [NameInMap("return_time")]
        [Validation(Required=true)]
        public string ReturnTime { get; set; }

        // 归还方式，1.预授权代扣2.支付宝代扣3.主动还款4.其他，5网商直付通代扣
        [NameInMap("return_way")]
        [Validation(Required=true)]
        public long? ReturnWay { get; set; }

        // 还款凭证类型，1.支付宝2.平台代收（客户主动还款）3.其他
        [NameInMap("return_voucher_type")]
        [Validation(Required=true)]
        public long? ReturnVoucherType { get; set; }

        // 还款凭证编号，不超过128字符，支付宝流水号
        [NameInMap("return_voucher_serial")]
        [Validation(Required=true)]
        public string ReturnVoucherSerial { get; set; }

        // 剩余归还期数
        [NameInMap("remain_term")]
        [Validation(Required=true)]
        public long? RemainTerm { get; set; }

    }

}
