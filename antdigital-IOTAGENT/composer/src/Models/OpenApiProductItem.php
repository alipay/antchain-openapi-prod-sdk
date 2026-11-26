<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\IOTAGENT\Models\OpenApiTemplateInfo;
use AntChain\IOTAGENT\Models\OpenApiPluginInfo;

class OpenApiProductItem extends Model {
    protected $_name = [
        'productKey' => 'product_key',
        'instanceId' => 'instance_id',
        'name' => 'name',
        'description' => 'description',
        'categoryId' => 'category_id',
        'serviceForm' => 'service_form',
        'authorizationMode' => 'authorization_mode',
        'activationType' => 'activation_type',
        'networkMode' => 'network_mode',
        'externalId' => 'external_id',
        'longMemoryEnabled' => 'long_memory_enabled',
        'createdAt' => 'created_at',
        'defaultTemplate' => 'default_template',
        'plugins' => 'plugins',
    ];
    public function validate() {
        Model::validateRequired('productKey', $this->productKey, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('categoryId', $this->categoryId, true);
        Model::validateRequired('serviceForm', $this->serviceForm, true);
        Model::validateRequired('authorizationMode', $this->authorizationMode, true);
        Model::validateRequired('activationType', $this->activationType, true);
        Model::validateRequired('longMemoryEnabled', $this->longMemoryEnabled, true);
        Model::validateRequired('createdAt', $this->createdAt, true);
        Model::validateRequired('defaultTemplate', $this->defaultTemplate, true);
        Model::validateRequired('plugins', $this->plugins, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->productKey) {
            $res['product_key'] = $this->productKey;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
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
        if (null !== $this->createdAt) {
            $res['created_at'] = $this->createdAt;
        }
        if (null !== $this->defaultTemplate) {
            $res['default_template'] = null !== $this->defaultTemplate ? $this->defaultTemplate->toMap() : null;
        }
        if (null !== $this->plugins) {
            $res['plugins'] = [];
            if(null !== $this->plugins && is_array($this->plugins)){
                $n = 0;
                foreach($this->plugins as $item){
                    $res['plugins'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpenApiProductItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['product_key'])){
            $model->productKey = $map['product_key'];
        }
        if(isset($map['instance_id'])){
            $model->instanceId = $map['instance_id'];
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
        if(isset($map['created_at'])){
            $model->createdAt = $map['created_at'];
        }
        if(isset($map['default_template'])){
            $model->defaultTemplate = OpenApiTemplateInfo::fromMap($map['default_template']);
        }
        if(isset($map['plugins'])){
            if(!empty($map['plugins'])){
                $model->plugins = [];
                $n = 0;
                foreach($map['plugins'] as $item) {
                    $model->plugins[$n++] = null !== $item ? OpenApiPluginInfo::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    /**
     * @example id_example
     * @var string
     */
    public $productKey;

    // 产品业务云实例，非网关product_instance_id；由服务端按认证租户和productKey映射
    /**
     * @example business_instance_example
     * @var string
     */
    public $instanceId;

    /**
     * @example 测试产品
     * @var string
     */
    public $name;

    /**
     * @example 示例说明
     * @var string
     */
    public $description;

    /**
     * @example id_example
     * @var string
     */
    public $categoryId;

    /**
     * @example undefined
     * @var string
     */
    public $serviceForm;

    // 枚举:LICENSE,INSTANCE
    /**
     * @example LICENSE
     * @var string
     */
    public $authorizationMode;

    /**
     * @example undefined
     * @var string
     */
    public $activationType;

    /**
     * @example undefined
     * @var string
     */
    public $networkMode;

    /**
     * @example undefined
     * @var string
     */
    public $externalId;

    /**
     * @example undefined
     * @var bool
     */
    public $longMemoryEnabled;

    /**
     * @example 2026-11-17T00:00:00+08:00
     * @var string
     */
    public $createdAt;

    /**
     * @example undefined
     * @var OpenApiTemplateInfo
     */
    public $defaultTemplate;

    /**
     * @example undefined
     * @var OpenApiPluginInfo[]
     */
    public $plugins;

}
