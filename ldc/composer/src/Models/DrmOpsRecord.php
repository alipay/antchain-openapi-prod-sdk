<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class DrmOpsRecord extends Model
{
    // 应用
    /**
     * @example
     *
     * @var string[]
     */
    public $apps;

    // 操作人
    /**
     * @example zhangsan
     *
     * @var string
     */
    public $operator;

    // 推送时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $pushTime;

    // 推送结果，包括（SUCCESS，FAILED，INVALID_REQUEST，NO_RECORD，SYSTEM_EXCEPTION，PARAM_QUERY_ERROR，PARAM_INVALID）
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $resultCode;

    // 结果信息
    /**
     * @example 成功
     *
     * @var string
     */
    public $resultMsg;

    // 推送目标
    /**
     * @example
     *
     * @var string[]
     */
    public $targets;

    // 推送值
    /**
     * @example {}
     *
     * @var string
     */
    public $value;

    // 规则类型
    /**
     * @example ZONE_INFO
     *
     * @var string
     */
    public $ruleType;
    protected $_name = [
        'apps'       => 'apps',
        'operator'   => 'operator',
        'pushTime'   => 'push_time',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'targets'    => 'targets',
        'value'      => 'value',
        'ruleType'   => 'rule_type',
    ];

    public function validate()
    {
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('resultCode', $this->resultCode, true);
        Model::validateRequired('ruleType', $this->ruleType, true);
        Model::validatePattern('pushTime', $this->pushTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apps) {
            $res['apps'] = $this->apps;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->pushTime) {
            $res['push_time'] = $this->pushTime;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->targets) {
            $res['targets'] = $this->targets;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->ruleType) {
            $res['rule_type'] = $this->ruleType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DrmOpsRecord
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['apps'])) {
            if (!empty($map['apps'])) {
                $model->apps = $map['apps'];
            }
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['push_time'])) {
            $model->pushTime = $map['push_time'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['targets'])) {
            if (!empty($map['targets'])) {
                $model->targets = $map['targets'];
            }
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['rule_type'])) {
            $model->ruleType = $map['rule_type'];
        }

        return $model;
    }
}
