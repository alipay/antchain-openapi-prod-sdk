<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class BuildpackInstances extends Model
{
    // ecs个数
    /**
     * @example 123
     *
     * @var int
     */
    public $ecses;

    // 绑定应用个数
    /**
     * @example 123
     *
     * @var int
     */
    public $appBinded;
    protected $_name = [
        'ecses'     => 'ecses',
        'appBinded' => 'app_binded',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ecses) {
            $res['ecses'] = $this->ecses;
        }
        if (null !== $this->appBinded) {
            $res['app_binded'] = $this->appBinded;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BuildpackInstances
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ecses'])) {
            $model->ecses = $map['ecses'];
        }
        if (isset($map['app_binded'])) {
            $model->appBinded = $map['app_binded'];
        }

        return $model;
    }
}
