<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class PreviewFileInfo extends Model {
    protected $_name = [
        'name' => 'name',
        'type' => 'type',
        'url' => 'url',
        'expireAt' => 'expire_at',
        'id' => 'id',
    ];
    public function validate() {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('url', $this->url, true);
        Model::validateRequired('expireAt', $this->expireAt, true);
        Model::validateRequired('id', $this->id, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->expireAt) {
            $res['expire_at'] = $this->expireAt;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PreviewFileInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['url'])){
            $model->url = $map['url'];
        }
        if(isset($map['expire_at'])){
            $model->expireAt = $map['expire_at'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        return $model;
    }
    /**
     * @example 
     * @var string
     */
    public $name;

    /**
     * @example 
     * @var string
     */
    public $type;

    /**
     * @example 
     * @var string
     */
    public $url;

    /**
     * @example 
     * @var int
     */
    public $expireAt;

    /**
     * @example 
     * @var string
     */
    public $id;

}
