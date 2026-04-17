// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class Brandlist extends TeaModel {
    // 首字母
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("letter")
    @Validation(required = true)
    public String letter;

    // 品牌信息列表
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("list")
    @Validation(required = true)
    public java.util.List<LetterInfo> list;

    public static Brandlist build(java.util.Map<String, ?> map) throws Exception {
        Brandlist self = new Brandlist();
        return TeaModel.build(map, self);
    }

    public Brandlist setLetter(String letter) {
        this.letter = letter;
        return this;
    }
    public String getLetter() {
        return this.letter;
    }

    public Brandlist setList(java.util.List<LetterInfo> list) {
        this.list = list;
        return this;
    }
    public java.util.List<LetterInfo> getList() {
        return this.list;
    }

}
