<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

use AntChain\CREATIVERENDER\Models\DataPart;

class Part extends Model {
    protected $_name = [
        'text' => 'text',
        'data' => 'data',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->text) {
            $res['text'] = $this->text;
        }
        if (null !== $this->data) {
            $res['data'] = null !== $this->data ? $this->data->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Part
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['text'])){
            $model->text = $map['text'];
        }
        if(isset($map['data'])){
            $model->data = DataPart::fromMap($map['data']);
        }
        return $model;
    }
    // the string content of the text part.
    /**
     * @example content
     * @var string
     */
    public $text;

    // The structured data content.
    /**
     * @example 
     * @var DataPart
     */
    public $data;

}
