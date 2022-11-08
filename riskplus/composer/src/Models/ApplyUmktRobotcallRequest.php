<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ApplyUmktRobotcallRequest extends Model
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

    // 外部流水号
    /**
     * @var string
     */
    public $outSerialNo;

    // 场景策略id
    /**
     * @var int
     */
    public $sceneStrategyId;

    // 客户透传字段
    /**
     * @var string
     */
    public $outInfo;

    // 用户参数类型
    /**
     * @var string
     */
    public $fileTemplate;

    // 每个手机号的详细参数
    /**
     * @var RobotCallCustomerParam[]
     */
    public $customerDetails;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outSerialNo'       => 'out_serial_no',
        'sceneStrategyId'   => 'scene_strategy_id',
        'outInfo'           => 'out_info',
        'fileTemplate'      => 'file_template',
        'customerDetails'   => 'customer_details',
    ];

    public function validate()
    {
        Model::validateRequired('outSerialNo', $this->outSerialNo, true);
        Model::validateRequired('sceneStrategyId', $this->sceneStrategyId, true);
        Model::validateRequired('fileTemplate', $this->fileTemplate, true);
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
        if (null !== $this->outSerialNo) {
            $res['out_serial_no'] = $this->outSerialNo;
        }
        if (null !== $this->sceneStrategyId) {
            $res['scene_strategy_id'] = $this->sceneStrategyId;
        }
        if (null !== $this->outInfo) {
            $res['out_info'] = $this->outInfo;
        }
        if (null !== $this->fileTemplate) {
            $res['file_template'] = $this->fileTemplate;
        }
        if (null !== $this->customerDetails) {
            $res['customer_details'] = [];
            if (null !== $this->customerDetails && \is_array($this->customerDetails)) {
                $n = 0;
                foreach ($this->customerDetails as $item) {
                    $res['customer_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyUmktRobotcallRequest
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
        if (isset($map['out_serial_no'])) {
            $model->outSerialNo = $map['out_serial_no'];
        }
        if (isset($map['scene_strategy_id'])) {
            $model->sceneStrategyId = $map['scene_strategy_id'];
        }
        if (isset($map['out_info'])) {
            $model->outInfo = $map['out_info'];
        }
        if (isset($map['file_template'])) {
            $model->fileTemplate = $map['file_template'];
        }
        if (isset($map['customer_details'])) {
            if (!empty($map['customer_details'])) {
                $model->customerDetails = [];
                $n                      = 0;
                foreach ($map['customer_details'] as $item) {
                    $model->customerDetails[$n++] = null !== $item ? RobotCallCustomerParam::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
