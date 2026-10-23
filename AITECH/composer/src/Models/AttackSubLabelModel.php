<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class AttackSubLabelModel extends Model {
    protected $_name = [
        'attackSubLabel' => 'attack_sub_label',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->attackSubLabel) {
            $res['attack_sub_label'] = $this->attackSubLabel;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AttackSubLabelModel
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['attack_sub_label'])){
            $model->attackSubLabel = $map['attack_sub_label'];
        }
        return $model;
    }
    // 提示词攻击手法二级标签
    /**
     * @example jailbreak_attack
     * @var string
     */
    public $attackSubLabel;

}
