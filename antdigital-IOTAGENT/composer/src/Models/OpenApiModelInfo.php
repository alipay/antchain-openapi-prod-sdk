<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class OpenApiModelInfo extends Model {
    protected $_name = [
        'modelId' => 'model_id',
        'name' => 'name',
        'region' => 'region',
    ];
    public function validate() {
        Model::validateRequired('modelId', $this->modelId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('region', $this->region, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->modelId) {
            $res['model_id'] = $this->modelId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpenApiModelInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['model_id'])){
            $model->modelId = $map['model_id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['region'])){
            $model->region = $map['region'];
        }
        return $model;
    }
    /**
     * @example undefined
     * @var string
     */
    public $modelId;

    /**
     * @example undefined
     * @var string
     */
    public $name;

    /**
     * @example undefined
     * @var string
     */
    public $region;

}
