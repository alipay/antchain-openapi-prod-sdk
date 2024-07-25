// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class PagequeryIotlinkAppreleaseorderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 所属项目空间
        [NameInMap("project_space")]
        [Validation(Required=true)]
        public string ProjectSpace { get; set; }

        // 应用名称
        [NameInMap("apk_name")]
        [Validation(Required=false)]
        public string ApkName { get; set; }

        // 应用版本号
        [NameInMap("apk_version")]
        [Validation(Required=false)]
        public string ApkVersion { get; set; }

        // 工单id
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 发布批次状态
        // 升级中：IN_PROGRESS
        // 取消中：CANCELING
        // 部分成功：PARTIAL_SUCCESS
        // 部分失败：PARTIAL_FAILED
        // 部分取消：PARTIAL_CANCELED
        // 全部成功：ALL_SUCCESS
        // 全部失败：ALL_FAILED
        // 全部取消：ALL_CANCELED
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 当前页
        [NameInMap("current")]
        [Validation(Required=true)]
        public long? Current { get; set; }

        // 每页数量
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
