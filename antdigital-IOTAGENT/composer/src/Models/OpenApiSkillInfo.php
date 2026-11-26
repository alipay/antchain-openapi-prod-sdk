<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class OpenApiSkillInfo extends Model {
    protected $_name = [
        'name' => 'name',
        'description' => 'description',
    ];
    public function validate() {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('description', $this->description, true);
    }
    public function toMap() {
        $res = [];
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
     * @return OpenApiSkillInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        return $model;
    }
    /**
     * @example undefined
     * @var string
     */
    public $name;

    /**
     * @example undefined
     * @var string
     */
    public $description;

}
