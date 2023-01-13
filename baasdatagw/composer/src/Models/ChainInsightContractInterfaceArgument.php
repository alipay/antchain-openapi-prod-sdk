<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightContractInterfaceArgument extends Model
{
    // 参数名
    /**
     * @example arg0
     *
     * @var string
     */
    public $name;

    // 参数类型
    /**
     * @example String
     *
     * @var string
     */
    public $type;

    // 参数位置，枚举：input，output，deposit
    /**
     * @example input
     *
     * @var string
     */
    public $location;

    // 参数的业务名称
    /**
     * @example 商品名称
     *
     * @var string
     */
    public $comment;
    protected $_name = [
        'name'     => 'name',
        'type'     => 'type',
        'location' => 'location',
        'comment'  => 'comment',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('location', $this->location, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->location) {
            $res['location'] = $this->location;
        }
        if (null !== $this->comment) {
            $res['comment'] = $this->comment;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightContractInterfaceArgument
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['location'])) {
            $model->location = $map['location'];
        }
        if (isset($map['comment'])) {
            $model->comment = $map['comment'];
        }

        return $model;
    }
}
