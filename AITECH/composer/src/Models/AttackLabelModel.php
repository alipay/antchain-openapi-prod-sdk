<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

use AntChain\AITECH\Models\AttackSubLabelModel;

class AttackLabelModel extends Model {
    protected $_name = [
        'attackLabel' => 'attack_label',
        'attackSubLabels' => 'attack_sub_labels',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->attackLabel) {
            $res['attack_label'] = $this->attackLabel;
        }
        if (null !== $this->attackSubLabels) {
            $res['attack_sub_labels'] = [];
            if(null !== $this->attackSubLabels && is_array($this->attackSubLabels)){
                $n = 0;
                foreach($this->attackSubLabels as $item){
                    $res['attack_sub_labels'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AttackLabelModel
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['attack_label'])){
            $model->attackLabel = $map['attack_label'];
        }
        if(isset($map['attack_sub_labels'])){
            if(!empty($map['attack_sub_labels'])){
                $model->attackSubLabels = [];
                $n = 0;
                foreach($map['attack_sub_labels'] as $item) {
                    $model->attackSubLabels[$n++] = null !== $item ? AttackSubLabelModel::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 提示词攻击手法一级标签
    /**
     * @example jailbreak_attack
     * @var string
     */
    public $attackLabel;

    // 提示词攻击手法二级标签
    /**
     * @example {}
     * @var AttackSubLabelModel[]
     */
    public $attackSubLabels;

}
