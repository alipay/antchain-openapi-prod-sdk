// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class DciCreationInfo extends TeaModel {
    // 作品创作性质
    /**
     * <strong>example:</strong>
     * <p>ORIGINAL</p>
     */
    @NameInMap("creation_nature")
    @Validation(required = true)
    public String creationNature;

    // 创作完成日期
    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd</p>
     */
    @NameInMap("creation_completion_date")
    @Validation(required = true)
    public String creationCompletionDate;

    // 创作完成地点
    /**
     * <strong>example:</strong>
     * <p>杭州</p>
     */
    @NameInMap("creation_completion_place")
    public String creationCompletionPlace;

    // 作品创作地点地区编码
    /**
     * <strong>example:</strong>
     * <p>110101</p>
     */
    @NameInMap("creation_completion_code")
    @Validation(required = true)
    public String creationCompletionCode;

    public static DciCreationInfo build(java.util.Map<String, ?> map) throws Exception {
        DciCreationInfo self = new DciCreationInfo();
        return TeaModel.build(map, self);
    }

    public DciCreationInfo setCreationNature(String creationNature) {
        this.creationNature = creationNature;
        return this;
    }
    public String getCreationNature() {
        return this.creationNature;
    }

    public DciCreationInfo setCreationCompletionDate(String creationCompletionDate) {
        this.creationCompletionDate = creationCompletionDate;
        return this;
    }
    public String getCreationCompletionDate() {
        return this.creationCompletionDate;
    }

    public DciCreationInfo setCreationCompletionPlace(String creationCompletionPlace) {
        this.creationCompletionPlace = creationCompletionPlace;
        return this;
    }
    public String getCreationCompletionPlace() {
        return this.creationCompletionPlace;
    }

    public DciCreationInfo setCreationCompletionCode(String creationCompletionCode) {
        this.creationCompletionCode = creationCompletionCode;
        return this;
    }
    public String getCreationCompletionCode() {
        return this.creationCompletionCode;
    }

}
