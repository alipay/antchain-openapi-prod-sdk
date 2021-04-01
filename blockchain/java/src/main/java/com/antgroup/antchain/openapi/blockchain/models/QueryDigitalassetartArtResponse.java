// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDigitalassetartArtResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 艺术品id
    @NameInMap("art_id")
    public String artId;

    // 艺术品名称
    @NameInMap("art_name")
    public String artName;

    // 艺术品代码
    @NameInMap("code")
    public String code;

    // 艺术品所在交易所代码
    @NameInMap("exchanges")
    public java.util.List<String> exchanges;

    // 艺术品鉴定者列表
    @NameInMap("identifiers")
    public java.util.List<String> identifiers;

    // 艺术品图片哈希
    @NameInMap("image_hash")
    public java.util.List<String> imageHash;

    // 发行方账户信息
    @NameInMap("issue_account")
    public String issueAccount;

    // 艺术品在链上发行时间
    @NameInMap("issue_date")
    public Long issueDate;

    // 艺术品所属主分类
    @NameInMap("main_class")
    public String mainClass;

    // 艺术品拥有者id
    @NameInMap("owner_id")
    public String ownerId;

    // 艺术品状态信息
    // 1未发行 
    // 2已发行 
    // 3冻结 
    // 4回购
    @NameInMap("state")
    public Long state;

    // 艺术品所属分类次分类
    @NameInMap("sub_class")
    public String subClass;

    // 艺术品视频哈希
    @NameInMap("vedio_hash")
    public String vedioHash;

    public static QueryDigitalassetartArtResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalassetartArtResponse self = new QueryDigitalassetartArtResponse();
        return TeaModel.build(map, self);
    }

    public QueryDigitalassetartArtResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDigitalassetartArtResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDigitalassetartArtResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDigitalassetartArtResponse setArtId(String artId) {
        this.artId = artId;
        return this;
    }
    public String getArtId() {
        return this.artId;
    }

    public QueryDigitalassetartArtResponse setArtName(String artName) {
        this.artName = artName;
        return this;
    }
    public String getArtName() {
        return this.artName;
    }

    public QueryDigitalassetartArtResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDigitalassetartArtResponse setExchanges(java.util.List<String> exchanges) {
        this.exchanges = exchanges;
        return this;
    }
    public java.util.List<String> getExchanges() {
        return this.exchanges;
    }

    public QueryDigitalassetartArtResponse setIdentifiers(java.util.List<String> identifiers) {
        this.identifiers = identifiers;
        return this;
    }
    public java.util.List<String> getIdentifiers() {
        return this.identifiers;
    }

    public QueryDigitalassetartArtResponse setImageHash(java.util.List<String> imageHash) {
        this.imageHash = imageHash;
        return this;
    }
    public java.util.List<String> getImageHash() {
        return this.imageHash;
    }

    public QueryDigitalassetartArtResponse setIssueAccount(String issueAccount) {
        this.issueAccount = issueAccount;
        return this;
    }
    public String getIssueAccount() {
        return this.issueAccount;
    }

    public QueryDigitalassetartArtResponse setIssueDate(Long issueDate) {
        this.issueDate = issueDate;
        return this;
    }
    public Long getIssueDate() {
        return this.issueDate;
    }

    public QueryDigitalassetartArtResponse setMainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }
    public String getMainClass() {
        return this.mainClass;
    }

    public QueryDigitalassetartArtResponse setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public QueryDigitalassetartArtResponse setState(Long state) {
        this.state = state;
        return this;
    }
    public Long getState() {
        return this.state;
    }

    public QueryDigitalassetartArtResponse setSubClass(String subClass) {
        this.subClass = subClass;
        return this;
    }
    public String getSubClass() {
        return this.subClass;
    }

    public QueryDigitalassetartArtResponse setVedioHash(String vedioHash) {
        this.vedioHash = vedioHash;
        return this;
    }
    public String getVedioHash() {
        return this.vedioHash;
    }

}
