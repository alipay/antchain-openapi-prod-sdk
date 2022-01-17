<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ApiTransferResult extends Model
{
    // api配置
    /**
     * @example
     *
     * @var ApiTransferVO[]
     */
    public $apiTransferList;

    // 批量转移结果
    /**
     * @example
     *
     * @var BatchActionResult
     */
    public $batchActionResult;

    // file_name
    /**
     * @example file_name
     *
     * @var string
     */
    public $fileName;

    // 流程编排列表
    /**
     * @example apiflow_list
     *
     * @var ApiInfoVO[]
     */
    public $apiflowList;
    protected $_name = [
        'apiTransferList'   => 'api_transfer_list',
        'batchActionResult' => 'batch_action_result',
        'fileName'          => 'file_name',
        'apiflowList'       => 'apiflow_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apiTransferList) {
            $res['api_transfer_list'] = [];
            if (null !== $this->apiTransferList && \is_array($this->apiTransferList)) {
                $n = 0;
                foreach ($this->apiTransferList as $item) {
                    $res['api_transfer_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->batchActionResult) {
            $res['batch_action_result'] = null !== $this->batchActionResult ? $this->batchActionResult->toMap() : null;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->apiflowList) {
            $res['apiflow_list'] = [];
            if (null !== $this->apiflowList && \is_array($this->apiflowList)) {
                $n = 0;
                foreach ($this->apiflowList as $item) {
                    $res['apiflow_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiTransferResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_transfer_list'])) {
            if (!empty($map['api_transfer_list'])) {
                $model->apiTransferList = [];
                $n                      = 0;
                foreach ($map['api_transfer_list'] as $item) {
                    $model->apiTransferList[$n++] = null !== $item ? ApiTransferVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['batch_action_result'])) {
            $model->batchActionResult = BatchActionResult::fromMap($map['batch_action_result']);
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['apiflow_list'])) {
            if (!empty($map['apiflow_list'])) {
                $model->apiflowList = [];
                $n                  = 0;
                foreach ($map['apiflow_list'] as $item) {
                    $model->apiflowList[$n++] = null !== $item ? ApiInfoVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
