// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    public class QueryCustomerDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资产类型：PRE_ALLOCATION（待发放），RELEASED（已到账），CANCELLED（已取消），REDEEMING（兑现中），REDEEMED（已兑现）
        [NameInMap("asset_type")]
        [Validation(Required=false)]
        public string AssetType { get; set; }

        // 合约ID
        [NameInMap("contract_id")]
        [Validation(Required=false)]
        public string ContractId { get; set; }

        // 数据类型，ASSET：资产信息， REVENUE：收益信息
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public string DataType { get; set; }

        // 截止时间，时区GMT+8，精确到毫秒
        [NameInMap("end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // 登录支付宝的账号，手机号或者邮箱
        [NameInMap("logon_id")]
        [Validation(Required=true)]
        public string LogonId { get; set; }

        // 登录账号类型，PHONE：手机号， EMAIL：邮箱地址
        [NameInMap("logon_id_type")]
        [Validation(Required=true)]
        public string LogonIdType { get; set; }

        // 排序方式，ASC：升序， DESC：降序，默认按照时间降序
        [NameInMap("order_by")]
        [Validation(Required=false)]
        public string OrderBy { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // 页面大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 起始时间，时区GMT+8，精确到毫秒
        [NameInMap("start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

    }

}
