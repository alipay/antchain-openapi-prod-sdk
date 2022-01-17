<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class CheckApiResult extends Model
{
    // 导入的所有的API集合
    /**
     * @example [{transfer},{transfer}]
     *
     * @var ApiTransferVO[]
     */
    public $allApiList;

    // API或者配置中有重复的集合
    /**
     * @example [{transfer},{transfer}]
     *
     * @var ApiTransferVO[]
     */
    public $failedApiList;

    //
    // API包括配置无重复的集合
    /**
     * @example [{transfer},{transfer}]
     *
     * @var ApiTransferVO[]
     */
    public $successApiList;

    // 失败api配置详情
    /**
     * @example [{},{}]
     *
     * @var string
     */
    public $checkResult;
    protected $_name = [
        'allApiList'     => 'all_api_list',
        'failedApiList'  => 'failed_api_list',
        'successApiList' => 'success_api_list',
        'checkResult'    => 'check_result',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->allApiList) {
            $res['all_api_list'] = [];
            if (null !== $this->allApiList && \is_array($this->allApiList)) {
                $n = 0;
                foreach ($this->allApiList as $item) {
                    $res['all_api_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->failedApiList) {
            $res['failed_api_list'] = [];
            if (null !== $this->failedApiList && \is_array($this->failedApiList)) {
                $n = 0;
                foreach ($this->failedApiList as $item) {
                    $res['failed_api_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->successApiList) {
            $res['success_api_list'] = [];
            if (null !== $this->successApiList && \is_array($this->successApiList)) {
                $n = 0;
                foreach ($this->successApiList as $item) {
                    $res['success_api_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->checkResult) {
            $res['check_result'] = $this->checkResult;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckApiResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['all_api_list'])) {
            if (!empty($map['all_api_list'])) {
                $model->allApiList = [];
                $n                 = 0;
                foreach ($map['all_api_list'] as $item) {
                    $model->allApiList[$n++] = null !== $item ? ApiTransferVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['failed_api_list'])) {
            if (!empty($map['failed_api_list'])) {
                $model->failedApiList = [];
                $n                    = 0;
                foreach ($map['failed_api_list'] as $item) {
                    $model->failedApiList[$n++] = null !== $item ? ApiTransferVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['success_api_list'])) {
            if (!empty($map['success_api_list'])) {
                $model->successApiList = [];
                $n                     = 0;
                foreach ($map['success_api_list'] as $item) {
                    $model->successApiList[$n++] = null !== $item ? ApiTransferVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['check_result'])) {
            $model->checkResult = $map['check_result'];
        }

        return $model;
    }
}
