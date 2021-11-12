<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class GetAutotestopsResponse extends Model
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

    // 所属环境id
    /**
     * @var string
     */
    public $envId;

    // 测试单名字
    /**
     * @var string
     */
    public $name;

    // 测试单的id
    /**
     * @var string
     */
    public $opsPlanId;

    // 产品测试结果
    /**
     * @var AutoTestProdResult[]
     */
    public $prodTestResult;

    // 当前状态
    /**
     * @var string
     */
    public $status;

    // 测试单创建时间
    /**
     * @var string
     */
    public $utcCreate;

    // 测试单结束时间
    /**
     * @var string
     */
    public $utcEnd;

    // 测试单修改时间
    /**
     * @var string
     */
    public $utcModified;

    // 测试单开始时间
    /**
     * @var string
     */
    public $utcStart;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'envId'          => 'env_id',
        'name'           => 'name',
        'opsPlanId'      => 'ops_plan_id',
        'prodTestResult' => 'prod_test_result',
        'status'         => 'status',
        'utcCreate'      => 'utc_create',
        'utcEnd'         => 'utc_end',
        'utcModified'    => 'utc_modified',
        'utcStart'       => 'utc_start',
    ];

    public function validate()
    {
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcEnd', $this->utcEnd, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcStart', $this->utcStart, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->opsPlanId) {
            $res['ops_plan_id'] = $this->opsPlanId;
        }
        if (null !== $this->prodTestResult) {
            $res['prod_test_result'] = [];
            if (null !== $this->prodTestResult && \is_array($this->prodTestResult)) {
                $n = 0;
                foreach ($this->prodTestResult as $item) {
                    $res['prod_test_result'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcEnd) {
            $res['utc_end'] = $this->utcEnd;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }
        if (null !== $this->utcStart) {
            $res['utc_start'] = $this->utcStart;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAutotestopsResponse
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
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['ops_plan_id'])) {
            $model->opsPlanId = $map['ops_plan_id'];
        }
        if (isset($map['prod_test_result'])) {
            if (!empty($map['prod_test_result'])) {
                $model->prodTestResult = [];
                $n                     = 0;
                foreach ($map['prod_test_result'] as $item) {
                    $model->prodTestResult[$n++] = null !== $item ? AutoTestProdResult::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_end'])) {
            $model->utcEnd = $map['utc_end'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }
        if (isset($map['utc_start'])) {
            $model->utcStart = $map['utc_start'];
        }

        return $model;
    }
}
