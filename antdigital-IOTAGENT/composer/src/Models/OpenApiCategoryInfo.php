<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class OpenApiCategoryInfo extends Model {
    protected $_name = [
        'id' => 'id',
        'name' => 'name',
        'serviceForms' => 'service_forms',
        'networkModes' => 'network_modes',
        'activationTypes' => 'activation_types',
    ];
    public function validate() {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('serviceForms', $this->serviceForms, true);
        Model::validateRequired('networkModes', $this->networkModes, true);
        Model::validateRequired('activationTypes', $this->activationTypes, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->serviceForms) {
            $res['service_forms'] = $this->serviceForms;
        }
        if (null !== $this->networkModes) {
            $res['network_modes'] = $this->networkModes;
        }
        if (null !== $this->activationTypes) {
            $res['activation_types'] = $this->activationTypes;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpenApiCategoryInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['service_forms'])){
            if(!empty($map['service_forms'])){
                $model->serviceForms = $map['service_forms'];
            }
        }
        if(isset($map['network_modes'])){
            if(!empty($map['network_modes'])){
                $model->networkModes = $map['network_modes'];
            }
        }
        if(isset($map['activation_types'])){
            if(!empty($map['activation_types'])){
                $model->activationTypes = $map['activation_types'];
            }
        }
        return $model;
    }
    /**
     * @example id_example
     * @var string
     */
    public $id;

    /**
     * @example 测试产品
     * @var string
     */
    public $name;

    /**
     * @example undefined
     * @var string[]
     */
    public $serviceForms;

    /**
     * @example undefined
     * @var string[]
     */
    public $networkModes;

    /**
     * @example undefined
     * @var string[]
     */
    public $activationTypes;

}
