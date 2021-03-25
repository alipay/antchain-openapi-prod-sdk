<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class Role extends Model {
    protected $_name = [
        'id' => 'id',
        'name' => 'name',
        'description' => 'description',
    ];
    public function validate() {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('description', $this->description, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Role
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        return $model;
    }
    // id
    /**
     * @example id
     * @var string
     */
    public $id;

    // name
    /**
     * @example name
     * @var string
     */
    public $name;

    // description
    /**
     * @example description
     * @var string
     */
    public $description;

}
