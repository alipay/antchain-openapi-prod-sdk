// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CrowdTagEnumResp extends TeaModel {
    // 人群标签code
    /**
     * <strong>example:</strong>
     * <p>P0010GC6</p>
     */
    @NameInMap("crowd_tag")
    @Validation(required = true)
    public String crowdTag;

    // 人群标签枚举列表对象
    @NameInMap("crow_tag_enum_item_list")
    @Validation(required = true)
    public java.util.List<CrowdTagEnumItemDTO> crowTagEnumItemList;

    public static CrowdTagEnumResp build(java.util.Map<String, ?> map) throws Exception {
        CrowdTagEnumResp self = new CrowdTagEnumResp();
        return TeaModel.build(map, self);
    }

    public CrowdTagEnumResp setCrowdTag(String crowdTag) {
        this.crowdTag = crowdTag;
        return this;
    }
    public String getCrowdTag() {
        return this.crowdTag;
    }

    public CrowdTagEnumResp setCrowTagEnumItemList(java.util.List<CrowdTagEnumItemDTO> crowTagEnumItemList) {
        this.crowTagEnumItemList = crowTagEnumItemList;
        return this;
    }
    public java.util.List<CrowdTagEnumItemDTO> getCrowTagEnumItemList() {
        return this.crowTagEnumItemList;
    }

}
