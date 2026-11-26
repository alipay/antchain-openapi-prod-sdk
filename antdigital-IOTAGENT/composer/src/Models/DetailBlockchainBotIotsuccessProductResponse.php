<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\IOTAGENT\Models\OpenApiTemplateInfo;
use AntChain\IOTAGENT\Models\OpenApiPluginInfo;

class DetailBlockchainBotIotsuccessProductResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
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
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
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
     * @return DetailBlockchainBotIotsuccessProductResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
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
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    /**
     * @var string
     */
    public $productKey;

    // 产品业务云实例，非网关product_instance_id；由服务端按认证租户和productKey映射
    /**
     * @var string
     */
    public $instanceId;

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

    /**
     * @var string
     */
    public $serviceForm;

    // 枚举:LICENSE,INSTANCE
    /**
     * @var string
     */
    public $authorizationMode;

    /**
     * @var string
     */
    public $activationType;

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

    /**
     * @var string
     */
    public $createdAt;

    /**
     * @var OpenApiTemplateInfo
     */
    public $defaultTemplate;

    /**
     * @var OpenApiPluginInfo[]
     */
    public $plugins;

}
