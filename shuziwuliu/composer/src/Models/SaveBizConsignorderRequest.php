<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class SaveBizConsignorderRequest extends Model
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

    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    /**
     * @var string
     */
    public $action;

    // 托单code
    /**
     * @var string
     */
    public $consignOrderCode;

    // 托单文件hash  业务必填
    /**
     * @var string
     */
    public $fileHash;

    // 托单文件id  业务必填
    /**
     * @var string
     */
    public $fileId;

    // 货代did
    /**
     * @var string
     */
    public $forwarderDid;

    // 订单号
    /**
     * @var string
     */
    public $orderNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'action'            => 'action',
        'consignOrderCode'  => 'consign_order_code',
        'fileHash'          => 'file_hash',
        'fileId'            => 'file_id',
        'forwarderDid'      => 'forwarder_did',
        'orderNo'           => 'order_no',
    ];

    public function validate()
    {
        Model::validateRequired('consignOrderCode', $this->consignOrderCode, true);
        Model::validateRequired('forwarderDid', $this->forwarderDid, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
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
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->consignOrderCode) {
            $res['consign_order_code'] = $this->consignOrderCode;
        }
        if (null !== $this->fileHash) {
            $res['file_hash'] = $this->fileHash;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->forwarderDid) {
            $res['forwarder_did'] = $this->forwarderDid;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveBizConsignorderRequest
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
        if (isset($map['action'])) {
            $model->action = $map['action'];
        }
        if (isset($map['consign_order_code'])) {
            $model->consignOrderCode = $map['consign_order_code'];
        }
        if (isset($map['file_hash'])) {
            $model->fileHash = $map['file_hash'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['forwarder_did'])) {
            $model->forwarderDid = $map['forwarder_did'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }

        return $model;
    }
}
