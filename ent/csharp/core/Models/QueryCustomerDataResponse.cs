// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    public class QueryCustomerDataResponse : TeaModel {
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

        // 数据类型，ASSET：资产信息， REVENUE：收益信息
        [NameInMap("data_type")]
        [Validation(Required=false)]
        public string DataType { get; set; }

        // 登录支付宝的账号，手机号或者邮箱地址
        [NameInMap("logon_id")]
        [Validation(Required=false)]
        public string LogonId { get; set; }

        // 登录账号类型，PHONE：手机号， EMAIL：电子邮箱
        [NameInMap("logon_id_type")]
        [Validation(Required=false)]
        public string LogonIdType { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // 页面大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 总数
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public long? TotalCount { get; set; }

        // 用户资产信息列表
        [NameInMap("user_asset_details")]
        [Validation(Required=false)]
        public List<UserAssetDetail> UserAssetDetails { get; set; }

        // 用户收益信息
        [NameInMap("user_revenue_data")]
        [Validation(Required=false)]
        public UserRevenueDetail UserRevenueData { get; set; }

        // 用户虚拟唯一标识
        [NameInMap("vid")]
        [Validation(Required=false)]
        public string Vid { get; set; }

    }

}
