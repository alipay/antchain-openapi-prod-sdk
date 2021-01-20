// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class DimFilter extends TeaModel {
    // dim_index
    @NameInMap("dim_index")
    public Long dimIndex;

    // dim_name
    @NameInMap("dim_name")
    public String dimName;

    // white_names
    @NameInMap("white_names")
    public java.util.List<String> whiteNames;

    // black_names
    @NameInMap("black_names")
    public java.util.List<String> blackNames;

    public static DimFilter build(java.util.Map<String, ?> map) throws Exception {
        DimFilter self = new DimFilter();
        return TeaModel.build(map, self);
    }

    public DimFilter setDimIndex(Long dimIndex) {
        this.dimIndex = dimIndex;
        return this;
    }
    public Long getDimIndex() {
        return this.dimIndex;
    }

    public DimFilter setDimName(String dimName) {
        this.dimName = dimName;
        return this;
    }
    public String getDimName() {
        return this.dimName;
    }

    public DimFilter setWhiteNames(java.util.List<String> whiteNames) {
        this.whiteNames = whiteNames;
        return this;
    }
    public java.util.List<String> getWhiteNames() {
        return this.whiteNames;
    }

    public DimFilter setBlackNames(java.util.List<String> blackNames) {
        this.blackNames = blackNames;
        return this;
    }
    public java.util.List<String> getBlackNames() {
        return this.blackNames;
    }

}
