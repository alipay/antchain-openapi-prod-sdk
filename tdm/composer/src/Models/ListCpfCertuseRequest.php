<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class ListCpfCertuseRequest extends Model
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

    // 端ID
    /**
     * @var string
     */
    public $terminalIdentity;

    // 证明ID
    /**
     * @var string
     */
    public $issueId;

    // 筛选时间 按月份筛选
    /**
     * @var string
     */
    public $optionTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'terminalIdentity'  => 'terminal_identity',
        'issueId'           => 'issue_id',
        'optionTime'        => 'option_time',
    ];

    public function validate()
    {
        Model::validateRequired('terminalIdentity', $this->terminalIdentity, true);
        Model::validateRequired('issueId', $this->issueId, true);
        Model::validatePattern('optionTime', $this->optionTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->terminalIdentity) {
            $res['terminal_identity'] = $this->terminalIdentity;
        }
        if (null !== $this->issueId) {
            $res['issue_id'] = $this->issueId;
        }
        if (null !== $this->optionTime) {
            $res['option_time'] = $this->optionTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListCpfCertuseRequest
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
        if (isset($map['terminal_identity'])) {
            $model->terminalIdentity = $map['terminal_identity'];
        }
        if (isset($map['issue_id'])) {
            $model->issueId = $map['issue_id'];
        }
        if (isset($map['option_time'])) {
            $model->optionTime = $map['option_time'];
        }

        return $model;
    }
}
