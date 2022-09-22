// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class IdentityDistributed extends TeaModel {
    // 户籍身份证号(前两位标识)
    // 11代表北京市，12天代表天津市，13河北省，14山代表山西省，15内代表蒙古自治区，21代表辽宁省，22代表吉林省，23代表黑龙江省，31代表上海市，32代表江苏省，33代表浙江省，34代表代表安徽省，35代表福建省，36代表江西省，37代表山东省，41代表河南省，42代表湖北省，43代表湖南省，44代表广东省，45代表广西壮族自治区，46代表海南省，50代表重庆市，51代表四川省，52代表贵州省，53代表云南省，54代表西藏自治区，61代表陕西省，62代表甘肃省，63代表青海省，64代表宁夏回族自治区，65代表新疆维吾尔自治区，71代表台湾省，81代表香港特别行政区，82代表澳门特别行政区
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 户籍所在省分布数量
    @NameInMap("number")
    @Validation(required = true)
    public Long number;

    public static IdentityDistributed build(java.util.Map<String, ?> map) throws Exception {
        IdentityDistributed self = new IdentityDistributed();
        return TeaModel.build(map, self);
    }

    public IdentityDistributed setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public IdentityDistributed setNumber(Long number) {
        this.number = number;
        return this;
    }
    public Long getNumber() {
        return this.number;
    }

}
