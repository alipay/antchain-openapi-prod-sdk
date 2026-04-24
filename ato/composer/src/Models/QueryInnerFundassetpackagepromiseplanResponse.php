<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerFundassetpackagepromiseplanResponse extends Model
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

    // 数据
    /**
     * @var AssetPackagePromisePlan[]
     */
    public $promisePlanList;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'promisePlanList' => 'promise_plan_list',
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
        if (null !== $this->promisePlanList) {
            $res['promise_plan_list'] = [];
            if (null !== $this->promisePlanList && \is_array($this->promisePlanList)) {
                $n = 0;
                foreach ($this->promisePlanList as $item) {
                    $res['promise_plan_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInnerFundassetpackagepromiseplanResponse
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
        if (isset($map['promise_plan_list'])) {
            if (!empty($map['promise_plan_list'])) {
                $model->promisePlanList = [];
                $n                      = 0;
                foreach ($map['promise_plan_list'] as $item) {
                    $model->promisePlanList[$n++] = null !== $item ? AssetPackagePromisePlan::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
