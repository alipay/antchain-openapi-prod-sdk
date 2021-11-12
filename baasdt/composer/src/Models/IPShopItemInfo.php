<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPShopItemInfo extends Model
{
    // 商品数字id
    /**
     * @example 1489161932
     *
     * @var int
     */
    public $numId;

    // 商品标题,不能超过60字节
    /**
     * @example Google test item
     *
     * @var string
     */
    public $title;

    // 卖家昵称
    /**
     * @example tbtest561
     *
     * @var string
     */
    public $nick;

    // 价格
    /**
     * @example 14.55
     *
     * @var string
     */
    public $price;

    // 商品类型(fixed:一口价;auction:拍卖)注：取消团购
    /**
     * @example fixed
     *
     * @var string
     */
    public $type;

    // 商品属性 格式：pid:vid;pid:vid
    /**
     * @example 135255:344454
     *
     * @var string
     */
    public $props;

    // 用户自行输入的子属性名和属性值，结构:"父属性值;一级子属性名;一级子属性值;二级子属性名;自定义输入值,....",如：“耐克;耐克系列;科比系列;科比系列;2K5”，input_str需要与input_pids一一对应，注：通常一个类目下用户可输入的关键属性不超过1个。所有属性别名加起来不能超过 3999字节。
    /**
     * @example 耐克;耐克系列;科比系列;科比系列;2K5
     *
     * @var string
     */
    public $inputStr;

    // 商品描述, 字数要大于5个字节，小于25000个字节
    /**
     * @example 这是一个好商品
     *
     * @var string
     */
    public $desc;
    protected $_name = [
        'numId'    => 'num_id',
        'title'    => 'title',
        'nick'     => 'nick',
        'price'    => 'price',
        'type'     => 'type',
        'props'    => 'props',
        'inputStr' => 'input_str',
        'desc'     => 'desc',
    ];

    public function validate()
    {
        Model::validateRequired('numId', $this->numId, true);
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('nick', $this->nick, true);
        Model::validateRequired('price', $this->price, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->numId) {
            $res['num_id'] = $this->numId;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->nick) {
            $res['nick'] = $this->nick;
        }
        if (null !== $this->price) {
            $res['price'] = $this->price;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->props) {
            $res['props'] = $this->props;
        }
        if (null !== $this->inputStr) {
            $res['input_str'] = $this->inputStr;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPShopItemInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['num_id'])) {
            $model->numId = $map['num_id'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['nick'])) {
            $model->nick = $map['nick'];
        }
        if (isset($map['price'])) {
            $model->price = $map['price'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['props'])) {
            $model->props = $map['props'];
        }
        if (isset($map['input_str'])) {
            $model->inputStr = $map['input_str'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }

        return $model;
    }
}
