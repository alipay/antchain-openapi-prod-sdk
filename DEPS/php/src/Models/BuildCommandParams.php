<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class BuildCommandParams extends Model {
    protected $_name = [
        'buildpackId' => 'buildpack_id',
        'description' => 'description',
        'key' => 'key',
        'value' => 'value',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->buildpackId) {
            $res['buildpack_id'] = $this->buildpackId;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return BuildCommandParams
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['buildpack_id'])){
            $model->buildpackId = $map['buildpack_id'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['key'])){
            $model->key = $map['key'];
        }
        if(isset($map['value'])){
            $model->value = $map['value'];
        }
        return $model;
    }
    // buildpackId
    /**
     * @example buildpackId
     * @var string
     */
    public $buildpackId;

    // description
    /**
     * @example description
     * @var string
     */
    public $description;

    // key
    /**
     * @example key
     * @var string
     */
    public $key;

    // value
    /**
     * @example value
     * @var string
     */
    public $value;

}
