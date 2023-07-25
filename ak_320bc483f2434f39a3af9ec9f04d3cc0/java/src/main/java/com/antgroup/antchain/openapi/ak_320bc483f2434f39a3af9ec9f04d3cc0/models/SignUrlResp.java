// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class SignUrlResp extends TeaModel {
    // 0-企业 1-用户
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    // 企业名称或用户姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 社会信用代码或身份证号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 手动签署url（长链接）
    @NameInMap("url")
    public String url;

    // 手动签署url(端链接)
    @NameInMap("short_url")
    public String shortUrl;

    // 电子合同签署区id
    @NameInMap("sign_filed_id")
    @Validation(required = true)
    public String signFiledId;

    public static SignUrlResp build(java.util.Map<String, ?> map) throws Exception {
        SignUrlResp self = new SignUrlResp();
        return TeaModel.build(map, self);
    }

    public SignUrlResp setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public SignUrlResp setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SignUrlResp setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public SignUrlResp setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public SignUrlResp setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
        return this;
    }
    public String getShortUrl() {
        return this.shortUrl;
    }

    public SignUrlResp setSignFiledId(String signFiledId) {
        this.signFiledId = signFiledId;
        return this;
    }
    public String getSignFiledId() {
        return this.signFiledId;
    }

}
