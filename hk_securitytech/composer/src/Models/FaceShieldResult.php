<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\HK_SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class FaceShieldResult extends Model
{
    // 设备token
    //
    /**
     * @example uYxLZlL5YGpLvdwO5+4pyCkjgf3/FF4XxOqzrmG/XY+jyFilhgEAAA==
     *
     * @var string
     */
    public $apdidToken;

    // 风险等级，-1参数异常，0无风险，1-3表示低、中、高
    //
    /**
     * @example 3
     *
     * @var int
     */
    public $riskLevel;

    // 风险描述，对风险等级的补充
    //
    /**
     * @example 本次咨询设备风险水平很高,风险编号:10000010.8.0
     *
     * @var string
     */
    public $riskDesc;

    // 处理的建议，如PAAS
    /**
     * @example 建议直接拦截
     *
     * @var string
     */
    public $sugAction;
    protected $_name = [
        'apdidToken' => 'apdid_token',
        'riskLevel'  => 'risk_level',
        'riskDesc'   => 'risk_desc',
        'sugAction'  => 'sug_action',
    ];

    public function validate()
    {
        Model::validateRequired('apdidToken', $this->apdidToken, true);
        Model::validateRequired('riskLevel', $this->riskLevel, true);
        Model::validateRequired('riskDesc', $this->riskDesc, true);
        Model::validateRequired('sugAction', $this->sugAction, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apdidToken) {
            $res['apdid_token'] = $this->apdidToken;
        }
        if (null !== $this->riskLevel) {
            $res['risk_level'] = $this->riskLevel;
        }
        if (null !== $this->riskDesc) {
            $res['risk_desc'] = $this->riskDesc;
        }
        if (null !== $this->sugAction) {
            $res['sug_action'] = $this->sugAction;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FaceShieldResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['apdid_token'])) {
            $model->apdidToken = $map['apdid_token'];
        }
        if (isset($map['risk_level'])) {
            $model->riskLevel = $map['risk_level'];
        }
        if (isset($map['risk_desc'])) {
            $model->riskDesc = $map['risk_desc'];
        }
        if (isset($map['sug_action'])) {
            $model->sugAction = $map['sug_action'];
        }

        return $model;
    }
}
