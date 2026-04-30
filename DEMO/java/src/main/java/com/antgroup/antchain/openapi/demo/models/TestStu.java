// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class TestStu extends TeaModel {
    // 567
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("card_info")
    public CardInfo cardInfo;

    // 12
    /**
     * <strong>example:</strong>
     * <p>档案号</p>
     */
    @NameInMap("stu_no")
    @Validation(required = true)
    public String stuNo;

    public static TestStu build(java.util.Map<String, ?> map) throws Exception {
        TestStu self = new TestStu();
        return TeaModel.build(map, self);
    }

    public TestStu setCardInfo(CardInfo cardInfo) {
        this.cardInfo = cardInfo;
        return this;
    }
    public CardInfo getCardInfo() {
        return this.cardInfo;
    }

    public TestStu setStuNo(String stuNo) {
        this.stuNo = stuNo;
        return this;
    }
    public String getStuNo() {
        return this.stuNo;
    }

}
