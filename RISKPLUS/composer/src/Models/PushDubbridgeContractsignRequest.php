<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class PushDubbridgeContractsignRequest extends Model
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

    // 合同签署事件id
    /**
     * @var string
     */
    public $signEventId;

    // 合同签署状态：
    // DRAFT-草稿（合同已创建但未发起签署，待签署状态）；
    // SIGNING-签署中（签署流程已发起，等待各方完成签署）；
    // COMPLETED-已完成（所有签署方均已完成签署，合同生效）；
    // EXPIRED-已过期（超过签署截止时间仍未完成签署）；
    // REJECTED-已拒签（签署方明确拒绝签署该合同）；
    // REVOKED-已撤销（发起方在签署完成前主动撤回/取消了签署流程）；
    // TERMINATED-已终止（签署过程中被强制中止/作废）；
    // DELETED-已删除（合同/签署流程被从系统中删除）
    /**
     * @var string
     */
    public $signStatus;

    // 合同下载地址（公网）
    /**
     * @var string
     */
    public $contractDownUrl;

    // 签署合同的业务订单号
    /**
     * @var string
     */
    public $bizOrderNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'signEventId'       => 'sign_event_id',
        'signStatus'        => 'sign_status',
        'contractDownUrl'   => 'contract_down_url',
        'bizOrderNo'        => 'biz_order_no',
    ];

    public function validate()
    {
        Model::validateRequired('signEventId', $this->signEventId, true);
        Model::validateRequired('signStatus', $this->signStatus, true);
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
        if (null !== $this->signEventId) {
            $res['sign_event_id'] = $this->signEventId;
        }
        if (null !== $this->signStatus) {
            $res['sign_status'] = $this->signStatus;
        }
        if (null !== $this->contractDownUrl) {
            $res['contract_down_url'] = $this->contractDownUrl;
        }
        if (null !== $this->bizOrderNo) {
            $res['biz_order_no'] = $this->bizOrderNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushDubbridgeContractsignRequest
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
        if (isset($map['sign_event_id'])) {
            $model->signEventId = $map['sign_event_id'];
        }
        if (isset($map['sign_status'])) {
            $model->signStatus = $map['sign_status'];
        }
        if (isset($map['contract_down_url'])) {
            $model->contractDownUrl = $map['contract_down_url'];
        }
        if (isset($map['biz_order_no'])) {
            $model->bizOrderNo = $map['biz_order_no'];
        }

        return $model;
    }
}
