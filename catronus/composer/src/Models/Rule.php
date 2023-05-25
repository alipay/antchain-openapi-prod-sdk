<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class Rule extends Model
{
    // 名称
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // 状态
    /**
     * @example failed
     *
     * @var string
     */
    public $status;

    // path
    /**
     * @example
     *
     * @var Path[]
     */
    public $paths;
    protected $_name = [
        'name'   => 'name',
        'status' => 'status',
        'paths'  => 'paths',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->paths) {
            $res['paths'] = [];
            if (null !== $this->paths && \is_array($this->paths)) {
                $n = 0;
                foreach ($this->paths as $item) {
                    $res['paths'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Rule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['paths'])) {
            if (!empty($map['paths'])) {
                $model->paths = [];
                $n            = 0;
                foreach ($map['paths'] as $item) {
                    $model->paths[$n++] = null !== $item ? Path::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
