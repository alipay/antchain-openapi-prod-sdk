<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class Task extends Model
{
    /**
     * @example undefined
     *
     * @var string
     */
    public $cronexp;

    /**
     * @example undefined
     *
     * @var string
     */
    public $name;

    /**
     * @example undefined
     *
     * @var string
     */
    public $system;
    protected $_name = [
        'cronexp' => 'cronexp',
        'name'    => 'name',
        'system'  => 'system',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cronexp) {
            $res['cronexp'] = $this->cronexp;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->system) {
            $res['system'] = $this->system;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Task
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cronexp'])) {
            $model->cronexp = $map['cronexp'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['system'])) {
            $model->system = $map['system'];
        }

        return $model;
    }
}
