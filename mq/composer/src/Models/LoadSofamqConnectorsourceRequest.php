<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class LoadSofamqConnectorsourceRequest extends Model
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

    // 来源的配置信息。source kv结构配置 数组 的 JSON String
    /**
     * @var string
     */
    public $sourceConfigs;

    // 数据源类型
    /**
     * @var string
     */
    public $sourceType;

    // 任务名称，仅仅在任务修改时需要传递
    /**
     * @var string
     */
    public $name;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sourceConfigs'     => 'source_configs',
        'sourceType'        => 'source_type',
        'name'              => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('sourceConfigs', $this->sourceConfigs, true);
        Model::validateRequired('sourceType', $this->sourceType, true);
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
        if (null !== $this->sourceConfigs) {
            $res['source_configs'] = $this->sourceConfigs;
        }
        if (null !== $this->sourceType) {
            $res['source_type'] = $this->sourceType;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LoadSofamqConnectorsourceRequest
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
        if (isset($map['source_configs'])) {
            $model->sourceConfigs = $map['source_configs'];
        }
        if (isset($map['source_type'])) {
            $model->sourceType = $map['source_type'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
