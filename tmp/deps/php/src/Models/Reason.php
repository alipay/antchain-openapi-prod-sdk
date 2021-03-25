<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class Reason extends Model {
    protected $_name = [
        'content' => 'content',
        'visible' => 'visible',
        'code' => 'code',
        'placeholder' => 'placeholder',
        'params' => 'params',
    ];
    public function validate() {
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('visible', $this->visible, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('placeholder', $this->placeholder, true);
        Model::validateRequired('params', $this->params, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->visible) {
            $res['visible'] = $this->visible;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->placeholder) {
            $res['placeholder'] = $this->placeholder;
        }
        if (null !== $this->params) {
            $res['params'] = $this->params;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Reason
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['content'])){
            $model->content = $map['content'];
        }
        if(isset($map['visible'])){
            $model->visible = $map['visible'];
        }
        if(isset($map['code'])){
            $model->code = $map['code'];
        }
        if(isset($map['placeholder'])){
            $model->placeholder = $map['placeholder'];
        }
        if(isset($map['params'])){
            if(!empty($map['params'])){
                $model->params = $map['params'];
            }
        }
        return $model;
    }
    // content
    /**
     * @example content
     * @var string
     */
    public $content;

    // visible
    /**
     * @example true, false
     * @var bool
     */
    public $visible;

    // code
    /**
     * @example code
     * @var string
     */
    public $code;

    // placeholder
    /**
     * @example placeholder
     * @var string
     */
    public $placeholder;

    // params
    /**
     * @example 
     * @var string[]
     */
    public $params;

}
