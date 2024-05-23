<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryRiskResponse extends Model
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

    // 请求唯一ID标识，为空则是异常
    /**
     * @var string
     */
    public $securityId;

    // 总风险决策结果，枚举值为：reject[拒绝],validate[待定],accept[通过]。
    /**
     * @var string
     */
    public $decision;

    // 风险场景的决策结果
    /**
     * @var RiskScene[]
     */
    public $scenes;

    // 策略结果详情
    /**
     * @var RiskStrategy[]
     */
    public $strategies;

    // 模型结果详情
    /**
     * @var RiskModel[]
     */
    public $models;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'securityId' => 'security_id',
        'decision'   => 'decision',
        'scenes'     => 'scenes',
        'strategies' => 'strategies',
        'models'     => 'models',
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
        if (null !== $this->securityId) {
            $res['security_id'] = $this->securityId;
        }
        if (null !== $this->decision) {
            $res['decision'] = $this->decision;
        }
        if (null !== $this->scenes) {
            $res['scenes'] = [];
            if (null !== $this->scenes && \is_array($this->scenes)) {
                $n = 0;
                foreach ($this->scenes as $item) {
                    $res['scenes'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->strategies) {
            $res['strategies'] = [];
            if (null !== $this->strategies && \is_array($this->strategies)) {
                $n = 0;
                foreach ($this->strategies as $item) {
                    $res['strategies'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->models) {
            $res['models'] = [];
            if (null !== $this->models && \is_array($this->models)) {
                $n = 0;
                foreach ($this->models as $item) {
                    $res['models'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRiskResponse
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
        if (isset($map['security_id'])) {
            $model->securityId = $map['security_id'];
        }
        if (isset($map['decision'])) {
            $model->decision = $map['decision'];
        }
        if (isset($map['scenes'])) {
            if (!empty($map['scenes'])) {
                $model->scenes = [];
                $n             = 0;
                foreach ($map['scenes'] as $item) {
                    $model->scenes[$n++] = null !== $item ? RiskScene::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['strategies'])) {
            if (!empty($map['strategies'])) {
                $model->strategies = [];
                $n                 = 0;
                foreach ($map['strategies'] as $item) {
                    $model->strategies[$n++] = null !== $item ? RiskStrategy::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['models'])) {
            if (!empty($map['models'])) {
                $model->models = [];
                $n             = 0;
                foreach ($map['models'] as $item) {
                    $model->models[$n++] = null !== $item ? RiskModel::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
