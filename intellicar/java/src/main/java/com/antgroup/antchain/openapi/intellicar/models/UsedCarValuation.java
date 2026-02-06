// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class UsedCarValuation extends TeaModel {
    // 评估金额(万)
    /**
     * <strong>example:</strong>
     * <p>1.15-1.43</p>
     */
    @NameInMap("referenceprice")
    @Validation(required = true)
    public String referenceprice;

    // 官方报价(参考)(万)
    /**
     * <strong>example:</strong>
     * <p>54.5</p>
     */
    @NameInMap("newcarprice")
    @Validation(required = true)
    public String newcarprice;

    // 车型图片(参考)
    /**
     * <strong>example:</strong>
     * <p>&quot;<a href="http://car0.autoimg.cn/cardfs/product/g32/M08/A5/55/t_autohomecar__ChxkPmZijMqAMuHJAALTBQ2Tti4239.jpg">http://car0.autoimg.cn/cardfs/product/g32/M08/A5/55/t_autohomecar__ChxkPmZijMqAMuHJAALTBQ2Tti4239.jpg</a>&quot;</p>
     */
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // 车况好(万)(三个价格用"-"分隔,第一个是较小值第二个是...
    /**
     * <strong>example:</strong>
     * <p>1.30-1.38-1.45</p>
     */
    @NameInMap("conditiona")
    @Validation(required = true)
    public String conditiona;

    // 车况正常(万)
    /**
     * <strong>example:</strong>
     * <p>1.18-1.29-1.41</p>
     */
    @NameInMap("conditionb")
    @Validation(required = true)
    public String conditionb;

    // 车况差(万)
    /**
     * <strong>example:</strong>
     * <p>1.04-1.16-1.28</p>
     */
    @NameInMap("conditionc")
    @Validation(required = true)
    public String conditionc;

    public static UsedCarValuation build(java.util.Map<String, ?> map) throws Exception {
        UsedCarValuation self = new UsedCarValuation();
        return TeaModel.build(map, self);
    }

    public UsedCarValuation setReferenceprice(String referenceprice) {
        this.referenceprice = referenceprice;
        return this;
    }
    public String getReferenceprice() {
        return this.referenceprice;
    }

    public UsedCarValuation setNewcarprice(String newcarprice) {
        this.newcarprice = newcarprice;
        return this;
    }
    public String getNewcarprice() {
        return this.newcarprice;
    }

    public UsedCarValuation setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public UsedCarValuation setConditiona(String conditiona) {
        this.conditiona = conditiona;
        return this;
    }
    public String getConditiona() {
        return this.conditiona;
    }

    public UsedCarValuation setConditionb(String conditionb) {
        this.conditionb = conditionb;
        return this;
    }
    public String getConditionb() {
        return this.conditionb;
    }

    public UsedCarValuation setConditionc(String conditionc) {
        this.conditionc = conditionc;
        return this;
    }
    public String getConditionc() {
        return this.conditionc;
    }

}
