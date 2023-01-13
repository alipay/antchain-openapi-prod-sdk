// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightAddressLabel extends TeaModel {
    // 链上账户或者合约地址
    @NameInMap("address")
    public String address;

    // 账户或者合约的真实名称
    @NameInMap("name")
    public String name;

    // 用户定义的地址描述信息
    @NameInMap("comments")
    public String comments;

    // 合约/账户地址的标签信息
    @NameInMap("labels")
    public java.util.List<MapEntry> labels;

    public static ChainInsightAddressLabel build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightAddressLabel self = new ChainInsightAddressLabel();
        return TeaModel.build(map, self);
    }

    public ChainInsightAddressLabel setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ChainInsightAddressLabel setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ChainInsightAddressLabel setComments(String comments) {
        this.comments = comments;
        return this;
    }
    public String getComments() {
        return this.comments;
    }

    public ChainInsightAddressLabel setLabels(java.util.List<MapEntry> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<MapEntry> getLabels() {
        return this.labels;
    }

}
