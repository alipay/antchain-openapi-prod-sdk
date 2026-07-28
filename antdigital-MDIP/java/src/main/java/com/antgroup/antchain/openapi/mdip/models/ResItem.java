// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mdip.models;

import com.aliyun.tea.*;

public class ResItem extends TeaModel {
    // 客户侧样本唯一id用于映射
    /**
     * <strong>example:</strong>
     * <p>077e5fc68135bd8e8223a094029d4cee</p>
     */
    @NameInMap("sample_id")
    @Validation(required = true)
    public String sampleId;

    // 蚂蚁侧对应样本唯一id，与客户侧形成映射关系，查询时需要携带该id
    /**
     * <strong>example:</strong>
     * <p>46052e46721417297df682ef88a8ab91</p>
     */
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    public static ResItem build(java.util.Map<String, ?> map) throws Exception {
        ResItem self = new ResItem();
        return TeaModel.build(map, self);
    }

    public ResItem setSampleId(String sampleId) {
        this.sampleId = sampleId;
        return this;
    }
    public String getSampleId() {
        return this.sampleId;
    }

    public ResItem setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

}
