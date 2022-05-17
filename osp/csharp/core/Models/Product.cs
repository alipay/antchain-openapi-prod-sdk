// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Osp.Models
{
    // 产品信息
    public class Product : TeaModel {
        // 产品id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 产品名称
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 产品代码
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 开通状态, T为已开通, F为未开通
        [NameInMap("opening_status")]
        [Validation(Required=false)]
        public string OpeningStatus { get; set; }

        // 运行状态的枚举值:
        // 					running 正在运行
        // 					stopped 已经停止
        // 					starting 正在启动
        // 					start_fail 启动失败
        // 					stopping 正在停止
        // 					stop_fail 停止失败
        // 					arrearage 因为欠费, 已经停止
        // 					stopping_arr 因为欠费, 正在停止
        // 				
        [NameInMap("running_status")]
        [Validation(Required=false)]
        public string RunningStatus { get; set; }

    }

}
