// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPShopItemInfo extends TeaModel {
    // 商品数字id
    @NameInMap("num_id")
    @Validation(required = true)
    public Long numId;

    // 商品标题,不能超过60字节
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 卖家昵称
    @NameInMap("nick")
    @Validation(required = true)
    public String nick;

    // 价格
    @NameInMap("price")
    @Validation(required = true)
    public String price;

    // 商品类型(fixed:一口价;auction:拍卖)注：取消团购
    @NameInMap("type")
    public String type;

    // 商品属性 格式：pid:vid;pid:vid
    @NameInMap("props")
    public String props;

    // 用户自行输入的子属性名和属性值，结构:"父属性值;一级子属性名;一级子属性值;二级子属性名;自定义输入值,....",如：“耐克;耐克系列;科比系列;科比系列;2K5”，input_str需要与input_pids一一对应，注：通常一个类目下用户可输入的关键属性不超过1个。所有属性别名加起来不能超过 3999字节。
    @NameInMap("input_str")
    public String inputStr;

    // 商品描述, 字数要大于5个字节，小于25000个字节
    @NameInMap("desc")
    public String desc;

    public static IPShopItemInfo build(java.util.Map<String, ?> map) throws Exception {
        IPShopItemInfo self = new IPShopItemInfo();
        return TeaModel.build(map, self);
    }

    public IPShopItemInfo setNumId(Long numId) {
        this.numId = numId;
        return this;
    }
    public Long getNumId() {
        return this.numId;
    }

    public IPShopItemInfo setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public IPShopItemInfo setNick(String nick) {
        this.nick = nick;
        return this;
    }
    public String getNick() {
        return this.nick;
    }

    public IPShopItemInfo setPrice(String price) {
        this.price = price;
        return this;
    }
    public String getPrice() {
        return this.price;
    }

    public IPShopItemInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public IPShopItemInfo setProps(String props) {
        this.props = props;
        return this;
    }
    public String getProps() {
        return this.props;
    }

    public IPShopItemInfo setInputStr(String inputStr) {
        this.inputStr = inputStr;
        return this;
    }
    public String getInputStr() {
        return this.inputStr;
    }

    public IPShopItemInfo setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
