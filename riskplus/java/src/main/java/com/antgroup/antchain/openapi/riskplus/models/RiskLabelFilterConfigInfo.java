// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RiskLabelFilterConfigInfo extends TeaModel {
    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 修改时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("gmt_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 是否为基本筛选标签
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("is_base")
    @Validation(required = true)
    public Long isBase;

    // 标记删除
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("is_delete")
    @Validation(required = true)
    public Long isDelete;

    // 操作人员ID
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 地区名
    /**
     * <strong>example:</strong>
     * <p>place_name</p>
     */
    @NameInMap("place_name")
    @Validation(required = true)
    public String placeName;

    // 地区类型
    /**
     * <strong>example:</strong>
     * <p>place_type</p>
     */
    @NameInMap("place_type")
    @Validation(required = true)
    public String placeType;

    // 标签ID
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("tag_id")
    @Validation(required = true)
    public String tagId;

    public static RiskLabelFilterConfigInfo build(java.util.Map<String, ?> map) throws Exception {
        RiskLabelFilterConfigInfo self = new RiskLabelFilterConfigInfo();
        return TeaModel.build(map, self);
    }

    public RiskLabelFilterConfigInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public RiskLabelFilterConfigInfo setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public RiskLabelFilterConfigInfo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RiskLabelFilterConfigInfo setIsBase(Long isBase) {
        this.isBase = isBase;
        return this;
    }
    public Long getIsBase() {
        return this.isBase;
    }

    public RiskLabelFilterConfigInfo setIsDelete(Long isDelete) {
        this.isDelete = isDelete;
        return this;
    }
    public Long getIsDelete() {
        return this.isDelete;
    }

    public RiskLabelFilterConfigInfo setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public RiskLabelFilterConfigInfo setPlaceName(String placeName) {
        this.placeName = placeName;
        return this;
    }
    public String getPlaceName() {
        return this.placeName;
    }

    public RiskLabelFilterConfigInfo setPlaceType(String placeType) {
        this.placeType = placeType;
        return this;
    }
    public String getPlaceType() {
        return this.placeType;
    }

    public RiskLabelFilterConfigInfo setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

}
