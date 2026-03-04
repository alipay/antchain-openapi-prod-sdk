<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class PersonInfo extends Model
{
    // 1
    /**
     * @example 张三
     *
     * @var CardInfos
     */
    public $cardInfos;

    // 123
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;
    protected $_name = [
        'cardInfos' => 'card_infos',
        'name'      => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('cardInfos', $this->cardInfos, true);
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cardInfos) {
            $res['card_infos'] = null !== $this->cardInfos ? $this->cardInfos->toMap() : null;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PersonInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['card_infos'])) {
            $model->cardInfos = CardInfos::fromMap($map['card_infos']);
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
