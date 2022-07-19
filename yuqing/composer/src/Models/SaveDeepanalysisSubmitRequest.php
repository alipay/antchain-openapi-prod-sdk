<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class SaveDeepanalysisSubmitRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 深度分析类型
    /**
     * @var string
     */
    public $toolType;

    // 任务名称
    /**
     * @var string
     */
    public $name;

    // 深度分析配置
    /**
     * @var AnalysisConfig
     */
    public $config;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'toolType'          => 'tool_type',
        'name'              => 'name',
        'config'            => 'config',
    ];

    public function validate()
    {
        Model::validateRequired('toolType', $this->toolType, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('config', $this->config, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->toolType) {
            $res['tool_type'] = $this->toolType;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->config) {
            $res['config'] = null !== $this->config ? $this->config->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveDeepanalysisSubmitRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['tool_type'])) {
            $model->toolType = $map['tool_type'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['config'])) {
            $model->config = AnalysisConfig::fromMap($map['config']);
        }

        return $model;
    }
}
