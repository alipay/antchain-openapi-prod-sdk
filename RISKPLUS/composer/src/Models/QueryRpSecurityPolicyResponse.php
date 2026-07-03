<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRpSecurityPolicyResponse extends Model
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

    // 模型结果详情
    //
    /**
     * @var ModelDetails[]
     */
    public $modelDetails;

    // 反馈成功之后的id
    /**
     * @var string
     */
    public $securityId;

    // 安全处理结果，枚举值为：reject[拒绝],validate[校验],accept[放过]
    /**
     * @var string
     */
    public $securityResult;

    // 策略结果详情
    //
    /**
     * @var StrategyDetails[]
     */
    public $strategyDetails;

    // 决策流信息
    /**
     * @var DfSceneInfos
     */
    public $dfSceneInfos;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'modelDetails'    => 'model_details',
        'securityId'      => 'security_id',
        'securityResult'  => 'security_result',
        'strategyDetails' => 'strategy_details',
        'dfSceneInfos'    => 'df_scene_infos',
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
        if (null !== $this->modelDetails) {
            $res['model_details'] = [];
            if (null !== $this->modelDetails && \is_array($this->modelDetails)) {
                $n = 0;
                foreach ($this->modelDetails as $item) {
                    $res['model_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->securityId) {
            $res['security_id'] = $this->securityId;
        }
        if (null !== $this->securityResult) {
            $res['security_result'] = $this->securityResult;
        }
        if (null !== $this->strategyDetails) {
            $res['strategy_details'] = [];
            if (null !== $this->strategyDetails && \is_array($this->strategyDetails)) {
                $n = 0;
                foreach ($this->strategyDetails as $item) {
                    $res['strategy_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->dfSceneInfos) {
            $res['df_scene_infos'] = null !== $this->dfSceneInfos ? $this->dfSceneInfos->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRpSecurityPolicyResponse
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
        if (isset($map['model_details'])) {
            if (!empty($map['model_details'])) {
                $model->modelDetails = [];
                $n                   = 0;
                foreach ($map['model_details'] as $item) {
                    $model->modelDetails[$n++] = null !== $item ? ModelDetails::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['security_id'])) {
            $model->securityId = $map['security_id'];
        }
        if (isset($map['security_result'])) {
            $model->securityResult = $map['security_result'];
        }
        if (isset($map['strategy_details'])) {
            if (!empty($map['strategy_details'])) {
                $model->strategyDetails = [];
                $n                      = 0;
                foreach ($map['strategy_details'] as $item) {
                    $model->strategyDetails[$n++] = null !== $item ? StrategyDetails::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['df_scene_infos'])) {
            $model->dfSceneInfos = DfSceneInfos::fromMap($map['df_scene_infos']);
        }

        return $model;
    }
}
