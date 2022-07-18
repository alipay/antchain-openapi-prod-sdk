// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotBasicDeviceSpecs extends TeaModel {
    // 厂商编码
    @NameInMap("corp_value")
    @Validation(required = true)
    public String corpValue;

    // 厂商名称
    @NameInMap("corp_name")
    @Validation(required = true)
    public String corpName;

    // 型号名称
    @NameInMap("model_name")
    @Validation(required = true)
    public String modelName;

    // 型号编码
    @NameInMap("model_value")
    @Validation(required = true)
    public String modelValue;

    // 防疫机
    @NameInMap("category_name")
    @Validation(required = true)
    public String categoryName;

    // 设备品类编码
    @NameInMap("category_code")
    @Validation(required = true)
    public String categoryCode;

    // 规格ID
    @NameInMap("specs_id")
    @Validation(required = true)
    public Long specsId;

    // 规格名称
    @NameInMap("specs_name")
    @Validation(required = true)
    public String specsName;

    // 规格编码
    @NameInMap("specs_value")
    @Validation(required = true)
    public String specsValue;

    // 规格参数
    @NameInMap("specs_param")
    @Validation(required = true)
    public String specsParam;

    public static IotBasicDeviceSpecs build(java.util.Map<String, ?> map) throws Exception {
        IotBasicDeviceSpecs self = new IotBasicDeviceSpecs();
        return TeaModel.build(map, self);
    }

    public IotBasicDeviceSpecs setCorpValue(String corpValue) {
        this.corpValue = corpValue;
        return this;
    }
    public String getCorpValue() {
        return this.corpValue;
    }

    public IotBasicDeviceSpecs setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public IotBasicDeviceSpecs setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public IotBasicDeviceSpecs setModelValue(String modelValue) {
        this.modelValue = modelValue;
        return this;
    }
    public String getModelValue() {
        return this.modelValue;
    }

    public IotBasicDeviceSpecs setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public IotBasicDeviceSpecs setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

    public IotBasicDeviceSpecs setSpecsId(Long specsId) {
        this.specsId = specsId;
        return this;
    }
    public Long getSpecsId() {
        return this.specsId;
    }

    public IotBasicDeviceSpecs setSpecsName(String specsName) {
        this.specsName = specsName;
        return this;
    }
    public String getSpecsName() {
        return this.specsName;
    }

    public IotBasicDeviceSpecs setSpecsValue(String specsValue) {
        this.specsValue = specsValue;
        return this;
    }
    public String getSpecsValue() {
        return this.specsValue;
    }

    public IotBasicDeviceSpecs setSpecsParam(String specsParam) {
        this.specsParam = specsParam;
        return this;
    }
    public String getSpecsParam() {
        return this.specsParam;
    }

}
