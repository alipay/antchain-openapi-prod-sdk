// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class QueryAntchainAtoFundAssetpackageResponse : TeaModel {
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

        // 资产包id
        [NameInMap("asset_package_id")]
        [Validation(Required=false)]
        public string AssetPackageId { get; set; }

        // 用信id
        [NameInMap("utilization_id")]
        [Validation(Required=false)]
        public string UtilizationId { get; set; }

        // 资产包状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 组包完成时间， yyyy-MM-dd HH:mm:ss
        [NameInMap("gmt_grouping_end")]
        [Validation(Required=false)]
        public string GmtGroupingEnd { get; set; }

        // 订单列表
        [NameInMap("order_list")]
        [Validation(Required=false)]
        public List<AssetPackageOrderInfo> OrderList { get; set; }

    }

}
