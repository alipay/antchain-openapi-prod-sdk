// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListPodOption extends TeaModel {
    // 根据pod number列举pod的方式：RANGE为范围查询；ARRAY为指定pod number查询；ALL查询全量
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // [type为RANGE时生效]范围查询的左边界（包含）
    @NameInMap("pod_numer_from")
    public Long podNumerFrom;

    // [type为RANGE时生效]范围查询的右边界（不包含）
    @NameInMap("pod_number_to")
    public Long podNumberTo;

    // [type为ARRAY时生效]指定pod number的查询
    @NameInMap("pod_numbers")
    public java.util.List<Long> podNumbers;

    public static ListPodOption build(java.util.Map<String, ?> map) throws Exception {
        ListPodOption self = new ListPodOption();
        return TeaModel.build(map, self);
    }

    public ListPodOption setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListPodOption setPodNumerFrom(Long podNumerFrom) {
        this.podNumerFrom = podNumerFrom;
        return this;
    }
    public Long getPodNumerFrom() {
        return this.podNumerFrom;
    }

    public ListPodOption setPodNumberTo(Long podNumberTo) {
        this.podNumberTo = podNumberTo;
        return this;
    }
    public Long getPodNumberTo() {
        return this.podNumberTo;
    }

    public ListPodOption setPodNumbers(java.util.List<Long> podNumbers) {
        this.podNumbers = podNumbers;
        return this;
    }
    public java.util.List<Long> getPodNumbers() {
        return this.podNumbers;
    }

}
