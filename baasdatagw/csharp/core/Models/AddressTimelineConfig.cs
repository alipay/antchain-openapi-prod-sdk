// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 链上地址（合约、存证账户）交易时间轴配置
    public class AddressTimelineConfig : TeaModel {
        // 交易时间轴看板高度
        [NameInMap("widget_height")]
        [Validation(Required=false)]
        public long? WidgetHeight { get; set; }

        // 接口业务字段配置列表，更新时只需传入需要更新的方法
        [NameInMap("interface_data_model_configs")]
        [Validation(Required=false)]
        public List<InterfaceDataModelConfig> InterfaceDataModelConfigs { get; set; }

    }

}
