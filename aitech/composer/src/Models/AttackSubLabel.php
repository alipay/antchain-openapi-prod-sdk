<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class AttackSubLabel extends Model
{
    // 提示词攻击手法二级标签
    /**
     * @example role_play：角色扮演
     *
     * @var string
     */
    public $attackSubLabel;
    protected $_name = [
        'attackSubLabel' => 'attack_sub_label',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->attackSubLabel) {
            $res['attack_sub_label'] = $this->attackSubLabel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AttackSubLabel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['attack_sub_label'])) {
            $model->attackSubLabel = $map['attack_sub_label'];
        }

        return $model;
    }
}
