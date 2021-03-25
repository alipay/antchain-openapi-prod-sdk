<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class DeploymentCell extends Model {
    protected $_name = [
        'name' => 'name',
        'cellIds' => 'cell_ids',
        'description' => 'description',
        'id' => 'id',
    ];
    public function validate() {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('cellIds', $this->cellIds, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('id', $this->id, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->cellIds) {
            $res['cell_ids'] = $this->cellIds;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DeploymentCell
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['cell_ids'])){
            if(!empty($map['cell_ids'])){
                $model->cellIds = $map['cell_ids'];
            }
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        return $model;
    }
    // name
    /**
     * @example test
     * @var string
     */
    public $name;

    // 部署单元 id
    /**
     * @example 
     * @var string[]
     */
    public $cellIds;

    // description
    /**
     * @example description
     * @var string
     */
    public $description;

    // id
    /**
     * @example 123
     * @var string
     */
    public $id;

}
