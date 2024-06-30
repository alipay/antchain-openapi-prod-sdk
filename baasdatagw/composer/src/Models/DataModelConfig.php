<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class DataModelConfig extends Model
{
    // 对应的方法参数
    /**
     * @example arg1
     *
     * @var string
     */
    public $argName;

    // 方法参数位置，input / output
    /**
     * @example input
     *
     * @var string
     */
    public $argLocation;

    // 业务名称
    /**
     * @example 申请者
     *
     * @var string
     */
    public $comment;

    // 业务名称在交易时间轴是否可见
    /**
     * @example
     *
     * @var bool
     */
    public $visible;
    protected $_name = [
        'argName'     => 'arg_name',
        'argLocation' => 'arg_location',
        'comment'     => 'comment',
        'visible'     => 'visible',
    ];

    public function validate()
    {
        Model::validateRequired('argName', $this->argName, true);
        Model::validateRequired('argLocation', $this->argLocation, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->argName) {
            $res['arg_name'] = $this->argName;
        }
        if (null !== $this->argLocation) {
            $res['arg_location'] = $this->argLocation;
        }
        if (null !== $this->comment) {
            $res['comment'] = $this->comment;
        }
        if (null !== $this->visible) {
            $res['visible'] = $this->visible;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DataModelConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['arg_name'])) {
            $model->argName = $map['arg_name'];
        }
        if (isset($map['arg_location'])) {
            $model->argLocation = $map['arg_location'];
        }
        if (isset($map['comment'])) {
            $model->comment = $map['comment'];
        }
        if (isset($map['visible'])) {
            $model->visible = $map['visible'];
        }

        return $model;
    }
}
