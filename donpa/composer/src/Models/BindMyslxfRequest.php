<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DONPA\Models;

use AlibabaCloud\Tea\Model;

class BindMyslxfRequest extends Model
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

    // 批次ID
    /**
     * @var string
     */
    public $batchId;

    // 身份证号码
    /**
     * @var string
     */
    public $idCard;

    // 绑定哪个手机号码，需要提供修复结果的序号，从1开始。
    /**
     * @var int
     */
    public $seq;

    // 呼叫号码。必须预先注册
    /**
     * @var string
     */
    public $callNumber;

    // 外显号码，必须预先平台注册
    /**
     * @var string
     */
    public $displayNumber;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'batchId'           => 'batch_id',
        'idCard'            => 'id_card',
        'seq'               => 'seq',
        'callNumber'        => 'call_number',
        'displayNumber'     => 'display_number',
    ];

    public function validate()
    {
        Model::validateRequired('batchId', $this->batchId, true);
        Model::validateRequired('idCard', $this->idCard, true);
        Model::validateRequired('seq', $this->seq, true);
        Model::validateRequired('callNumber', $this->callNumber, true);
        Model::validateRequired('displayNumber', $this->displayNumber, true);
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
        if (null !== $this->batchId) {
            $res['batch_id'] = $this->batchId;
        }
        if (null !== $this->idCard) {
            $res['id_card'] = $this->idCard;
        }
        if (null !== $this->seq) {
            $res['seq'] = $this->seq;
        }
        if (null !== $this->callNumber) {
            $res['call_number'] = $this->callNumber;
        }
        if (null !== $this->displayNumber) {
            $res['display_number'] = $this->displayNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindMyslxfRequest
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
        if (isset($map['batch_id'])) {
            $model->batchId = $map['batch_id'];
        }
        if (isset($map['id_card'])) {
            $model->idCard = $map['id_card'];
        }
        if (isset($map['seq'])) {
            $model->seq = $map['seq'];
        }
        if (isset($map['call_number'])) {
            $model->callNumber = $map['call_number'];
        }
        if (isset($map['display_number'])) {
            $model->displayNumber = $map['display_number'];
        }

        return $model;
    }
}
