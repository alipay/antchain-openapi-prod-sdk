<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class Item extends Model
{
    // 溯源项的具体内容
    /**
     * @example 枭洒保税所有海关可用严禁修改
     *
     * @var string
     */
    public $desc;

    // 扩展信息 ，json格式
    /**
     * @example "{"isUrl",true,"usrid":"123231"}"
     *
     * @var string
     */
    public $extInfo;

    // 溯源项的键值
    /**
     * @example itemName
     *
     * @var string
     */
    public $key;

    // 溯源项的中文标题
    /**
     * @example 品名
     *
     * @var string
     */
    public $title;

    // 内容类型
    /**
     * @example text, image, region, link, longtext
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'desc'    => 'desc',
        'extInfo' => 'ext_info',
        'key'     => 'key',
        'title'   => 'title',
        'type'    => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('desc', $this->desc, true);
        Model::validateRequired('extInfo', $this->extInfo, true);
        Model::validateRequired('key', $this->key, true);
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Item
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
