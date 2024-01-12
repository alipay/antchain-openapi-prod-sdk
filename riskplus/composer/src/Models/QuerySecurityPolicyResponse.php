<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QuerySecurityPolicyResponse extends Model
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

    // 安全处理结果，枚举值为：reject[拒绝],validate[校验],accept[放过]
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
     * @var ModelDetails
     */
    public $modelDetails;

    // 输出变量
    /**
     * @var VariableDetails
     */
    public $variableDetails;

    // 策略详情
    /**
     * @var StrategyDetails
     */
    public $strategyDetails;

    // 场景决策
    /**
     * @var SceneInfos
     */
    public $sceneInfos;
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
    ];

    public function validate()
    {
        Model::validateRequired('success', $this->success, true);
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
            $res['model_details'] = null !== $this->modelDetails ? $this->modelDetails->toMap() : null;
        }
        if (null !== $this->variableDetails) {
            $res['variable_details'] = null !== $this->variableDetails ? $this->variableDetails->toMap() : null;
        }
        if (null !== $this->strategyDetails) {
            $res['strategy_details'] = null !== $this->strategyDetails ? $this->strategyDetails->toMap() : null;
        }
        if (null !== $this->sceneInfos) {
            $res['scene_infos'] = null !== $this->sceneInfos ? $this->sceneInfos->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySecurityPolicyResponse
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
            $model->modelDetails = ModelDetails::fromMap($map['model_details']);
        }
        if (isset($map['variable_details'])) {
            $model->variableDetails = VariableDetails::fromMap($map['variable_details']);
        }
        if (isset($map['strategy_details'])) {
            $model->strategyDetails = StrategyDetails::fromMap($map['strategy_details']);
        }
        if (isset($map['scene_infos'])) {
            $model->sceneInfos = SceneInfos::fromMap($map['scene_infos']);
        }

        return $model;
    }
}
