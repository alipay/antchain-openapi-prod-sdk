<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ConfirmWitnessFlowRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 签署确认数据
    /**
     * @var WitnessConfirmData[]
     */
    public $confirmDatas;

    // 证据id列表，内部用户必传
    /**
     * @var string[]
     */
    public $evidenceIds;

    // 签署记录id列表，外部用户必传
    /**
     * @var string[]
     */
    public $signlogIds;

    // 签署票证
    /**
     * @var string
     */
    public $signTicket;

    // 见证流程id
    /**
     * @var string
     */
    public $witnessFlowId;

    // 发起请求的实例应用ID
    /**
     * @var string
     */
    public $appId;

    // 发起请求的鉴权token
    /**
     * @var string
     */
    public $token;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'confirmDatas'      => 'confirm_datas',
        'evidenceIds'       => 'evidence_ids',
        'signlogIds'        => 'signlog_ids',
        'signTicket'        => 'sign_ticket',
        'witnessFlowId'     => 'witness_flow_id',
        'appId'             => 'app_id',
        'token'             => 'token',
    ];

    public function validate()
    {
        Model::validateRequired('confirmDatas', $this->confirmDatas, true);
        Model::validateRequired('signTicket', $this->signTicket, true);
        Model::validateRequired('witnessFlowId', $this->witnessFlowId, true);
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('token', $this->token, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->confirmDatas) {
            $res['confirm_datas'] = [];
            if (null !== $this->confirmDatas && \is_array($this->confirmDatas)) {
                $n = 0;
                foreach ($this->confirmDatas as $item) {
                    $res['confirm_datas'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->evidenceIds) {
            $res['evidence_ids'] = $this->evidenceIds;
        }
        if (null !== $this->signlogIds) {
            $res['signlog_ids'] = $this->signlogIds;
        }
        if (null !== $this->signTicket) {
            $res['sign_ticket'] = $this->signTicket;
        }
        if (null !== $this->witnessFlowId) {
            $res['witness_flow_id'] = $this->witnessFlowId;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfirmWitnessFlowRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['confirm_datas'])) {
            if (!empty($map['confirm_datas'])) {
                $model->confirmDatas = [];
                $n                   = 0;
                foreach ($map['confirm_datas'] as $item) {
                    $model->confirmDatas[$n++] = null !== $item ? WitnessConfirmData::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['evidence_ids'])) {
            if (!empty($map['evidence_ids'])) {
                $model->evidenceIds = $map['evidence_ids'];
            }
        }
        if (isset($map['signlog_ids'])) {
            if (!empty($map['signlog_ids'])) {
                $model->signlogIds = $map['signlog_ids'];
            }
        }
        if (isset($map['sign_ticket'])) {
            $model->signTicket = $map['sign_ticket'];
        }
        if (isset($map['witness_flow_id'])) {
            $model->witnessFlowId = $map['witness_flow_id'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }

        return $model;
    }
}
