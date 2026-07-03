<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QuerySecurityAiriskcloudPolicyResponse extends Model
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

    // 反馈成功之后的id
    /**
     * @var string
     */
    public $securityId;

    // 安全处理结果，枚举值为：reject[拒绝],valida...
    /**
     * @var string
     */
    public $securityResult;

    // 是否成功
    /**
     * @var string
     */
    public $success;

    // native场景下的核身id
    /**
     * @var string
     */
    public $verifyId;

    // h5场景下的核身地址
    /**
     * @var string
     */
    public $verifyUrl;

    // 场景分
    /**
     * @var ModelDetails[]
     */
    public $modelDetails;

    // 输出变量
    /**
     * @var VariableDetails[]
     */
    public $variableDetails;

    // 策略详情
    /**
     * @var StrategyDetails[]
     */
    public $strategyDetails;

    // 场景决策
    /**
     * @var SceneInfos[]
     */
    public $sceneInfos;

    // infoCode信息
    /**
     * @var AirInfoCodes[]
     */
    public $infoCodes;

    // 策略输出参数
    /**
     * @var OutParam[]
     */
    public $outParams;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'securityId'      => 'security_id',
        'securityResult'  => 'security_result',
        'success'         => 'success',
        'verifyId'        => 'verify_id',
        'verifyUrl'       => 'verify_url',
        'modelDetails'    => 'model_details',
        'variableDetails' => 'variable_details',
        'strategyDetails' => 'strategy_details',
        'sceneInfos'      => 'scene_infos',
        'infoCodes'       => 'info_codes',
        'outParams'       => 'out_params',
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
        if (null !== $this->securityResult) {
            $res['security_result'] = $this->securityResult;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->verifyId) {
            $res['verify_id'] = $this->verifyId;
        }
        if (null !== $this->verifyUrl) {
            $res['verify_url'] = $this->verifyUrl;
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
        if (null !== $this->variableDetails) {
            $res['variable_details'] = [];
            if (null !== $this->variableDetails && \is_array($this->variableDetails)) {
                $n = 0;
                foreach ($this->variableDetails as $item) {
                    $res['variable_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
        if (null !== $this->sceneInfos) {
            $res['scene_infos'] = [];
            if (null !== $this->sceneInfos && \is_array($this->sceneInfos)) {
                $n = 0;
                foreach ($this->sceneInfos as $item) {
                    $res['scene_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->infoCodes) {
            $res['info_codes'] = [];
            if (null !== $this->infoCodes && \is_array($this->infoCodes)) {
                $n = 0;
                foreach ($this->infoCodes as $item) {
                    $res['info_codes'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->outParams) {
            $res['out_params'] = [];
            if (null !== $this->outParams && \is_array($this->outParams)) {
                $n = 0;
                foreach ($this->outParams as $item) {
                    $res['out_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySecurityAiriskcloudPolicyResponse
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
        if (isset($map['security_result'])) {
            $model->securityResult = $map['security_result'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['verify_id'])) {
            $model->verifyId = $map['verify_id'];
        }
        if (isset($map['verify_url'])) {
            $model->verifyUrl = $map['verify_url'];
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
        if (isset($map['variable_details'])) {
            if (!empty($map['variable_details'])) {
                $model->variableDetails = [];
                $n                      = 0;
                foreach ($map['variable_details'] as $item) {
                    $model->variableDetails[$n++] = null !== $item ? VariableDetails::fromMap($item) : $item;
                }
            }
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
        if (isset($map['scene_infos'])) {
            if (!empty($map['scene_infos'])) {
                $model->sceneInfos = [];
                $n                 = 0;
                foreach ($map['scene_infos'] as $item) {
                    $model->sceneInfos[$n++] = null !== $item ? SceneInfos::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['info_codes'])) {
            if (!empty($map['info_codes'])) {
                $model->infoCodes = [];
                $n                = 0;
                foreach ($map['info_codes'] as $item) {
                    $model->infoCodes[$n++] = null !== $item ? AirInfoCodes::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['out_params'])) {
            if (!empty($map['out_params'])) {
                $model->outParams = [];
                $n                = 0;
                foreach ($map['out_params'] as $item) {
                    $model->outParams[$n++] = null !== $item ? OutParam::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
