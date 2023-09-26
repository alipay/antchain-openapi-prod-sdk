// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 数据洞察看板
    public class ChainInsightWidget : TeaModel {
        // 看版类型，内置看版类型为Default
        [NameInMap("widget_type")]
        [Validation(Required=true)]
        public string WidgetType { get; set; }

        // 看版子类型；ChainIdWidget, ChainAccountWidget, ChainContractWidget, ChainTotalTransactionWidget, ChainActiveAddressWidget, ChainTxTimeLineWidget
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 看版时间范围，单位小时
        [NameInMap("time_range")]
        [Validation(Required=true)]
        public long? TimeRange { get; set; }

        // 看板ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 看版名称，最大32字符
        [NameInMap("name")]
        [Validation(Required=false, MaxLength=32)]
        public string Name { get; set; }

        // 看版描述，最大 255 字符
        [NameInMap("description")]
        [Validation(Required=false, MaxLength=255)]
        public string Description { get; set; }

        // 看版创建时间，单位毫秒时间戳
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // 看版修改时间，单位毫秒时间戳
        [NameInMap("modify_time")]
        [Validation(Required=false)]
        public long? ModifyTime { get; set; }

        // 看版对应的链ID，空表示联盟下所有的链
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 链名称
        [NameInMap("biz_id_name")]
        [Validation(Required=false)]
        public string BizIdName { get; set; }

        // 看版对应的链上账户地址，hex编码
        [NameInMap("hex_address")]
        [Validation(Required=false)]
        public string HexAddress { get; set; }

        // 时间轴搜索的请求
        [NameInMap("query")]
        [Validation(Required=false)]
        public string Query { get; set; }

    }

}
