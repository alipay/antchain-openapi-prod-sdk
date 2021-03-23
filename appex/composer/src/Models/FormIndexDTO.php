<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class FormIndexDTO extends Model
{
    // 业务表单ID
    /**
     * @example 2020213303
     *
     * @var string
     */
    public $formId;

    // 业务表单类型
    /**
     * @example TransferTicket.Apply
     *
     * @var string
     */
    public $formType;

    // 块高
    /**
     * @example 1000
     *
     * @var int
     */
    public $blockHeight;

    // 交易hash
    /**
     * @example 063a580c6f208a71e4cf57672049e9f59df76412e4d810e4c26950c9147c3ced
     *
     * @var string
     */
    public $txHash;

    // 交易时间戳
    /**
     * @example 1597130279858
     *
     * @var string
     */
    public $txTimestamp;
    protected $_name = [
        'formId'      => 'form_id',
        'formType'    => 'form_type',
        'blockHeight' => 'block_height',
        'txHash'      => 'tx_hash',
        'txTimestamp' => 'tx_timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('formId', $this->formId, true);
        Model::validateRequired('formType', $this->formType, true);
        Model::validateRequired('blockHeight', $this->blockHeight, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('txTimestamp', $this->txTimestamp, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->formId) {
            $res['form_id'] = $this->formId;
        }
        if (null !== $this->formType) {
            $res['form_type'] = $this->formType;
        }
        if (null !== $this->blockHeight) {
            $res['block_height'] = $this->blockHeight;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->txTimestamp) {
            $res['tx_timestamp'] = $this->txTimestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FormIndexDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['form_id'])) {
            $model->formId = $map['form_id'];
        }
        if (isset($map['form_type'])) {
            $model->formType = $map['form_type'];
        }
        if (isset($map['block_height'])) {
            $model->blockHeight = $map['block_height'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['tx_timestamp'])) {
            $model->txTimestamp = $map['tx_timestamp'];
        }

        return $model;
    }
}
