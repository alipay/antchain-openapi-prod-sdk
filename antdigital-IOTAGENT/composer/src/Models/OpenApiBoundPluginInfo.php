<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class OpenApiBoundPluginInfo extends Model {
    protected $_name = [
        'pluginId' => 'plugin_id',
        'type' => 'type',
        'provider' => 'provider',
        'name' => 'name',
        'purpose' => 'purpose',
        'parameterDefinitions' => 'parameter_definitions',
        'state' => 'state',
        'effectiveFor' => 'effective_for',
    ];
    public function validate() {
        Model::validateRequired('pluginId', $this->pluginId, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('provider', $this->provider, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('purpose', $this->purpose, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->pluginId) {
            $res['plugin_id'] = $this->pluginId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->provider) {
            $res['provider'] = $this->provider;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->purpose) {
            $res['purpose'] = $this->purpose;
        }
        if (null !== $this->parameterDefinitions) {
            $res['parameter_definitions'] = $this->parameterDefinitions;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->effectiveFor) {
            $res['effective_for'] = $this->effectiveFor;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpenApiBoundPluginInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['plugin_id'])){
            $model->pluginId = $map['plugin_id'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['provider'])){
            $model->provider = $map['provider'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['purpose'])){
            $model->purpose = $map['purpose'];
        }
        if(isset($map['parameter_definitions'])){
            $model->parameterDefinitions = $map['parameter_definitions'];
        }
        if(isset($map['state'])){
            $model->state = $map['state'];
        }
        if(isset($map['effective_for'])){
            $model->effectiveFor = $map['effective_for'];
        }
        return $model;
    }
    /**
     * @example id_example
     * @var string
     */
    public $pluginId;

    // 枚举:DEVICE,CLOUD,KNOWLEDGE_BASE,MCP,SKILL
    /**
     * @example undefined
     * @var string
     */
    public $type;

    // 枚举:OFFICIAL,CUSTOM
    /**
     * @example undefined
     * @var string
     */
    public $provider;

    /**
     * @example 测试产品
     * @var string
     */
    public $name;

    /**
     * @example 示例说明
     * @var string
     */
    public $purpose;

    // 插件公开参数JSON Schema，不含Header值；JSON对象字符串
    /**
     * @example undefined
     * @var string
     */
    public $parameterDefinitions;

    // 枚举:BOUND,PENDING
    /**
     * @example undefined
     * @var string
     */
    public $state;

    // 枚举:NEXT_INTERACTION
    /**
     * @example undefined
     * @var string
     */
    public $effectiveFor;

}
