<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class RuntimeStrategy extends Model
{
    // 安全webshell配置
    /**
     * @example true, false
     *
     * @var bool
     */
    public $webshell;

    // 提权保护配置
    /**
     * @example true, false
     *
     * @var bool
     */
    public $privilege;

    // 是否打开
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enable;
    protected $_name = [
        'webshell'  => 'webshell',
        'privilege' => 'privilege',
        'enable'    => 'enable',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->webshell) {
            $res['webshell'] = $this->webshell;
        }
        if (null !== $this->privilege) {
            $res['privilege'] = $this->privilege;
        }
        if (null !== $this->enable) {
            $res['enable'] = $this->enable;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RuntimeStrategy
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['webshell'])) {
            $model->webshell = $map['webshell'];
        }
        if (isset($map['privilege'])) {
            $model->privilege = $map['privilege'];
        }
        if (isset($map['enable'])) {
            $model->enable = $map['enable'];
        }

        return $model;
    }
}
