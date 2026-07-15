<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DictionaryInfoBO extends Model {
    protected $_name = [
        'label' => 'label',
        'value' => 'value',
    ];
    public function validate() {
        Model::validateRequired('label', $this->label, true);
        Model::validateRequired('value', $this->value, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->label) {
            $res['label'] = $this->label;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DictionaryInfoBO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['label'])){
            $model->label = $map['label'];
        }
        if(isset($map['value'])){
            $model->value = $map['value'];
        }
        return $model;
    }
    // 字典key
    /**
     * @example key1
     * @var string
     */
    public $label;

    // 字典value
    /**
     * @example a
     * @var string
     */
    public $value;

}
