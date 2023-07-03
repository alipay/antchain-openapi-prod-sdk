<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\HK_SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class DeviceRiskResp extends Model
{
    // apdid
    /**
     * @example -
     *
     * @var string
     */
    public $apdid;

    // apdid
    /**
     * @example -
     *
     * @var string
     */
    public $apdidToken;

    // riskLevel
    /**
     * @example
     *
     * @var int
     */
    public $riskLevel;

    // risk_desc
    /**
     * @example -
     *
     * @var string
     */
    public $riskDesc;

    // sug_action
    /**
     * @example -
     *
     * @var string
     */
    public $sugAction;

    // risk_labels
    /**
     * @example
     *
     * @var string[]
     */
    public $riskLabels;
    protected $_name = [
        'apdid'      => 'apdid',
        'apdidToken' => 'apdid_token',
        'riskLevel'  => 'risk_level',
        'riskDesc'   => 'risk_desc',
        'sugAction'  => 'sug_action',
        'riskLabels' => 'risk_labels',
    ];

    public function validate()
    {
        Model::validateRequired('apdid', $this->apdid, true);
        Model::validateRequired('apdidToken', $this->apdidToken, true);
        Model::validateRequired('riskLevel', $this->riskLevel, true);
        Model::validateRequired('riskDesc', $this->riskDesc, true);
        Model::validateRequired('sugAction', $this->sugAction, true);
        Model::validateRequired('riskLabels', $this->riskLabels, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apdid) {
            $res['apdid'] = $this->apdid;
        }
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
        if (null !== $this->riskLabels) {
            $res['risk_labels'] = $this->riskLabels;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeviceRiskResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['apdid'])) {
            $model->apdid = $map['apdid'];
        }
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
        if (isset($map['risk_labels'])) {
            if (!empty($map['risk_labels'])) {
                $model->riskLabels = $map['risk_labels'];
            }
        }

        return $model;
    }
}
