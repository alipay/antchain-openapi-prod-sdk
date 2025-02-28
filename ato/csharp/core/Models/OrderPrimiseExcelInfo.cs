// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 用信查询订单履约信息结构体
    public class OrderPrimiseExcelInfo : TeaModel {
        // 文件下载地址
        [NameInMap("download_url")]
        [Validation(Required=false)]
        public string DownloadUrl { get; set; }

        // 文件类型,订单明细表:ORDER_DETAIL 还款记录表:ORDER_FULFILLMENT
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

        //  生成中, 已生成,无效
        [NameInMap("task_status")]
        [Validation(Required=true)]
        public string TaskStatus { get; set; }

    }

}
