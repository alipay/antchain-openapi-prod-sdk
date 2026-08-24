// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 二手车估价信息
    public class UsedCarValuation : TeaModel {
        // 评估金额(万)
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.15-1.43</para>
        /// </summary>
        [NameInMap("referenceprice")]
        [Validation(Required=true)]
        public string Referenceprice { get; set; }

        // 官方报价(参考)(万)
        /// <summary>
        /// <b>Example:</b>
        /// <para>54.5</para>
        /// </summary>
        [NameInMap("newcarprice")]
        [Validation(Required=true)]
        public string Newcarprice { get; set; }

        // 车型图片(参考)
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;<a href="http://car0.autoimg.cn/cardfs/product/g32/M08/A5/55/t_autohomecar__ChxkPmZijMqAMuHJAALTBQ2Tti4239.jpg">http://car0.autoimg.cn/cardfs/product/g32/M08/A5/55/t_autohomecar__ChxkPmZijMqAMuHJAALTBQ2Tti4239.jpg</a>&quot;</para>
        /// </summary>
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // 车况好(万)(三个价格用"-"分隔,第一个是较小值第二个是...
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.30-1.38-1.45</para>
        /// </summary>
        [NameInMap("conditiona")]
        [Validation(Required=true)]
        public string Conditiona { get; set; }

        // 车况正常(万)
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.18-1.29-1.41</para>
        /// </summary>
        [NameInMap("conditionb")]
        [Validation(Required=true)]
        public string Conditionb { get; set; }

        // 车况差(万)
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.04-1.16-1.28</para>
        /// </summary>
        [NameInMap("conditionc")]
        [Validation(Required=true)]
        public string Conditionc { get; set; }

    }

}
