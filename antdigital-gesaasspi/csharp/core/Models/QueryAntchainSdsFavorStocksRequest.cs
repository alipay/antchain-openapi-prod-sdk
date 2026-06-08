// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAASSPI.Models
{
    public class QueryAntchainSdsFavorStocksRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 【分页页码】 页码从0开始，默认第0页
        [NameInMap("offset")]
        [Validation(Required=true)]
        public long? Offset { get; set; }

        // 【分页大小】 分页大小，最大10
        [NameInMap("limit")]
        [Validation(Required=true)]
        public long? Limit { get; set; }

        // 【创建批次的商户号】 批次创建方商户号。
        // 校验规则：接口传入的批次号需由stock_creator_mchid所创建。
        [NameInMap("stock_creator_mchid")]
        [Validation(Required=true)]
        public string StockCreatorMchid { get; set; }

        // 【起始时间】 起始创建时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss表示时分秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35+08:00表示，北京时间2015年5月20日 13点29分35秒。
        // 校验规则：get请求，参数在 url中，需要进行 url 编码传递
        [NameInMap("create_start_time")]
        [Validation(Required=false)]
        public string CreateStartTime { get; set; }

        // 【终止时间】 终止创建时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss表示时分秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35+08:00表示，北京时间2015年5月20日 13点29分35秒。
        // 校验规则：get请求，参数在 url中，需要进行 url 编码传递
        [NameInMap("create_end_time")]
        [Validation(Required=false)]
        public string CreateEndTime { get; set; }

        // 【批次状态】 批次状态，枚举值：
        // unactivated：未激活
        // audit：审核中
        // running：运行中
        // stoped：已停止
        // paused：暂停发放
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
