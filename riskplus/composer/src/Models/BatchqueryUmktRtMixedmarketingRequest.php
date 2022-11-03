<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryUmktRtMixedmarketingRequest extends Model
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

    // 场景策略id列表
    /**
     * @var int[]
     */
    public $sceneStrategyIds;

    // 场景策略集合code，对标场景策略id列表，一般不可变
    /**
     * @var string
     */
    public $sceneStrategySetCode;

    // 查询协议模版
    /**
     * @var string
     */
    public $queryTemplate;

    // 查询的用户凭证列表
    /**
     * @var string[]
     */
    public $customerKeys;

    // 业务流水号，uuid
    /**
     * @var string
     */
    public $bizSerialNo;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'sceneStrategyIds'     => 'scene_strategy_ids',
        'sceneStrategySetCode' => 'scene_strategy_set_code',
        'queryTemplate'        => 'query_template',
        'customerKeys'         => 'customer_keys',
        'bizSerialNo'          => 'biz_serial_no',
    ];

    public function validate()
    {
        Model::validateRequired('sceneStrategyIds', $this->sceneStrategyIds, true);
        Model::validateRequired('queryTemplate', $this->queryTemplate, true);
        Model::validateRequired('customerKeys', $this->customerKeys, true);
        Model::validateRequired('bizSerialNo', $this->bizSerialNo, true);
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
        if (null !== $this->sceneStrategyIds) {
            $res['scene_strategy_ids'] = $this->sceneStrategyIds;
        }
        if (null !== $this->sceneStrategySetCode) {
            $res['scene_strategy_set_code'] = $this->sceneStrategySetCode;
        }
        if (null !== $this->queryTemplate) {
            $res['query_template'] = $this->queryTemplate;
        }
        if (null !== $this->customerKeys) {
            $res['customer_keys'] = $this->customerKeys;
        }
        if (null !== $this->bizSerialNo) {
            $res['biz_serial_no'] = $this->bizSerialNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryUmktRtMixedmarketingRequest
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
        if (isset($map['scene_strategy_ids'])) {
            if (!empty($map['scene_strategy_ids'])) {
                $model->sceneStrategyIds = $map['scene_strategy_ids'];
            }
        }
        if (isset($map['scene_strategy_set_code'])) {
            $model->sceneStrategySetCode = $map['scene_strategy_set_code'];
        }
        if (isset($map['query_template'])) {
            $model->queryTemplate = $map['query_template'];
        }
        if (isset($map['customer_keys'])) {
            if (!empty($map['customer_keys'])) {
                $model->customerKeys = $map['customer_keys'];
            }
        }
        if (isset($map['biz_serial_no'])) {
            $model->bizSerialNo = $map['biz_serial_no'];
        }

        return $model;
    }
}
