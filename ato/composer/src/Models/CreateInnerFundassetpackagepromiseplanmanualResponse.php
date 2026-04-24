<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class CreateInnerFundassetpackagepromiseplanmanualResponse extends Model
{
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

    // 资产包履约计划列表
    /**
     * @var AssetPackagePromisePlan[]
     */
    public $assetPackagePromisePlanList;
    protected $_name = [
        'reqMsgId'                    => 'req_msg_id',
        'resultCode'                  => 'result_code',
        'resultMsg'                   => 'result_msg',
        'assetPackagePromisePlanList' => 'asset_package_promise_plan_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
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
        if (null !== $this->assetPackagePromisePlanList) {
            $res['asset_package_promise_plan_list'] = [];
            if (null !== $this->assetPackagePromisePlanList && \is_array($this->assetPackagePromisePlanList)) {
                $n = 0;
                foreach ($this->assetPackagePromisePlanList as $item) {
                    $res['asset_package_promise_plan_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateInnerFundassetpackagepromiseplanmanualResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['asset_package_promise_plan_list'])) {
            if (!empty($map['asset_package_promise_plan_list'])) {
                $model->assetPackagePromisePlanList = [];
                $n                                  = 0;
                foreach ($map['asset_package_promise_plan_list'] as $item) {
                    $model->assetPackagePromisePlanList[$n++] = null !== $item ? AssetPackagePromisePlan::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
