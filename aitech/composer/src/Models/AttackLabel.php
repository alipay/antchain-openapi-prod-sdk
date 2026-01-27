<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class AttackLabel extends Model
{
    // 提示词攻击手法一级标签
    /**
     * @example jailbreak：越狱攻击
     *
     * @var string
     */
    public $attackLabel;

    // 提示词攻击手法二级标签列表
    /**
     * @example
     *
     * @var AttackSubLabel
     */
    public $attackSubLabels;
    protected $_name = [
        'attackLabel'     => 'attack_label',
        'attackSubLabels' => 'attack_sub_labels',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->attackLabel) {
            $res['attack_label'] = $this->attackLabel;
        }
        if (null !== $this->attackSubLabels) {
            $res['attack_sub_labels'] = null !== $this->attackSubLabels ? $this->attackSubLabels->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AttackLabel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['attack_label'])) {
            $model->attackLabel = $map['attack_label'];
        }
        if (isset($map['attack_sub_labels'])) {
            $model->attackSubLabels = AttackSubLabel::fromMap($map['attack_sub_labels']);
        }

        return $model;
    }
}
