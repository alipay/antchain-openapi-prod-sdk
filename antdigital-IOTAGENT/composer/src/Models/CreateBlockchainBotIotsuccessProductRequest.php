<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class CreateBlockchainBotIotsuccessProductRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'name' => 'name',
        'description' => 'description',
        'categoryId' => 'category_id',
        'serviceForm' => 'service_form',
        'authorizationMode' => 'authorization_mode',
        'activationType' => 'activation_type',
        'networkMode' => 'network_mode',
        'externalId' => 'external_id',
        'longMemoryEnabled' => 'long_memory_enabled',
    ];
    public function validate() {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('categoryId', $this->categoryId, true);
        Model::validateRequired('serviceForm', $this->serviceForm, true);
        Model::validateRequired('authorizationMode', $this->authorizationMode, true);
        Model::validateRequired('activationType', $this->activationType, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->categoryId) {
            $res['category_id'] = $this->categoryId;
        }
        if (null !== $this->serviceForm) {
            $res['service_form'] = $this->serviceForm;
        }
        if (null !== $this->authorizationMode) {
            $res['authorization_mode'] = $this->authorizationMode;
        }
        if (null !== $this->activationType) {
            $res['activation_type'] = $this->activationType;
        }
        if (null !== $this->networkMode) {
            $res['network_mode'] = $this->networkMode;
        }
        if (null !== $this->externalId) {
            $res['external_id'] = $this->externalId;
        }
        if (null !== $this->longMemoryEnabled) {
            $res['long_memory_enabled'] = $this->longMemoryEnabled;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateBlockchainBotIotsuccessProductRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['category_id'])){
            $model->categoryId = $map['category_id'];
        }
        if(isset($map['service_form'])){
            $model->serviceForm = $map['service_form'];
        }
        if(isset($map['authorization_mode'])){
            $model->authorizationMode = $map['authorization_mode'];
        }
        if(isset($map['activation_type'])){
            $model->activationType = $map['activation_type'];
        }
        if(isset($map['network_mode'])){
            $model->networkMode = $map['network_mode'];
        }
        if(isset($map['external_id'])){
            $model->externalId = $map['external_id'];
        }
        if(isset($map['long_memory_enabled'])){
            $model->longMemoryEnabled = $map['long_memory_enabled'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $name;

    /**
     * @var string
     */
    public $description;

    /**
     * @var string
     */
    public $categoryId;

    // 来自listCategories有效组合
    /**
     * @var string
     */
    public $serviceForm;

    // 枚举:LICENSE,INSTANCE
    /**
     * @var string
     */
    public $authorizationMode;

    // 来自listCategories的activationTypes
    /**
     * @var string
     */
    public $activationType;

    // 来自品类目录
    /**
     * @var string
     */
    public $networkMode;

    /**
     * @var string
     */
    public $externalId;

    /**
     * @var bool
     */
    public $longMemoryEnabled;

}
