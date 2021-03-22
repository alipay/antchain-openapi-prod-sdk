// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class CreateConsumecardBillRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequest BaseRequest { get; set; }

        // 账单标价(单位:元,精确到分)
        [NameInMap("bill_display_price")]
        [Validation(Required=true)]
        public string BillDisplayPrice { get; set; }

        // 账单名称
        [NameInMap("bill_name")]
        [Validation(Required=true)]
        public string BillName { get; set; }

        // 账单实际支付金额(单位:元,精确到分)
        [NameInMap("bill_token_price")]
        [Validation(Required=true)]
        public string BillTokenPrice { get; set; }

        // 账单类型
        [NameInMap("bill_type")]
        [Validation(Required=true)]
        public string BillType { get; set; }

        // 交易发起方的链上账户Id
        [NameInMap("buyer_account_id")]
        [Validation(Required=true)]
        public string BuyerAccountId { get; set; }

        // 支付方证件号
        [NameInMap("buyer_id_number")]
        [Validation(Required=true)]
        public string BuyerIdNumber { get; set; }

        // 证件类型：0 身份证, 1 护照, 2 军官证, 3 回乡证, 4 港澳证件, 5 营业执照, 6 港澳居民来往内地通行证, 7 台湾居民来往内地通行证, 8 港澳居民居住证, 9 台湾居民居住证, 10事业单位登记证书, 11 社会团体登记证书, 12 民办非企业单位证书, 13 党政机关批准设计文件, 14 全国组织机构代码证书, 15 其他证件
        [NameInMap("buyer_id_type")]
        [Validation(Required=true)]
        public long? BuyerIdType { get; set; }

        // 支付方发起ip
        [NameInMap("buyer_ip")]
        [Validation(Required=true)]
        public string BuyerIp { get; set; }

        // 支付方姓名
        [NameInMap("buyer_name")]
        [Validation(Required=true)]
        public string BuyerName { get; set; }

        // 支付方手机号
        [NameInMap("buyer_phone")]
        [Validation(Required=true)]
        public string BuyerPhone { get; set; }

        // 外部系统创建时间
        [NameInMap("origin_create_time")]
        [Validation(Required=true)]
        public long? OriginCreateTime { get; set; }

        // 外部系统订单号
        [NameInMap("origin_order_id")]
        [Validation(Required=true)]
        public string OriginOrderId { get; set; }

        // 附言（不必填）
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 交易接收方的链上账户Id
        [NameInMap("seller_account_id")]
        [Validation(Required=true)]
        public string SellerAccountId { get; set; }

    }

}
