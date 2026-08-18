<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class TextInfoDto extends Model {
    protected $_name = [
        'text' => 'text',
    ];
    public function validate() {
        Model::validateRequired('text', $this->text, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->text) {
            $res['text'] = $this->text;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return TextInfoDto
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['text'])){
            $model->text = $map['text'];
        }
        return $model;
    }
    // 文本素材信息
    /**
     * @example 文本素材信息
     * @var string
     */
    public $text;

}
