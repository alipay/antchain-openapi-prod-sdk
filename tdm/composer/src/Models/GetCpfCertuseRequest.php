<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class GetCpfCertuseRequest extends Model
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

    // 业务流水号
    /**
     * @var string
     */
    public $bizId;

    // 端ID
    /**
     * @var string
     */
    public $terminalIdentity;

    // 用数机构ID
    /**
     * @var string
     */
    public $dataUserIdentity;

    // 用数机构
    /**
     * @var string
     */
    public $dataUserName;

    // 证明文件ID
    /**
     * @var string
     */
    public $issueId;

    // 使用目的
    /**
     * @var string
     */
    public $purpose;

    // 使用时间
    /**
     * @var string
     */
    public $useTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'terminalIdentity'  => 'terminal_identity',
        'dataUserIdentity'  => 'data_user_identity',
        'dataUserName'      => 'data_user_name',
        'issueId'           => 'issue_id',
        'purpose'           => 'purpose',
        'useTime'           => 'use_time',
    ];

    public function validate()
    {
        Model::validateRequired('terminalIdentity', $this->terminalIdentity, true);
        Model::validateRequired('dataUserIdentity', $this->dataUserIdentity, true);
        Model::validateRequired('dataUserName', $this->dataUserName, true);
        Model::validateRequired('issueId', $this->issueId, true);
        Model::validatePattern('useTime', $this->useTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->terminalIdentity) {
            $res['terminal_identity'] = $this->terminalIdentity;
        }
        if (null !== $this->dataUserIdentity) {
            $res['data_user_identity'] = $this->dataUserIdentity;
        }
        if (null !== $this->dataUserName) {
            $res['data_user_name'] = $this->dataUserName;
        }
        if (null !== $this->issueId) {
            $res['issue_id'] = $this->issueId;
        }
        if (null !== $this->purpose) {
            $res['purpose'] = $this->purpose;
        }
        if (null !== $this->useTime) {
            $res['use_time'] = $this->useTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetCpfCertuseRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['terminal_identity'])) {
            $model->terminalIdentity = $map['terminal_identity'];
        }
        if (isset($map['data_user_identity'])) {
            $model->dataUserIdentity = $map['data_user_identity'];
        }
        if (isset($map['data_user_name'])) {
            $model->dataUserName = $map['data_user_name'];
        }
        if (isset($map['issue_id'])) {
            $model->issueId = $map['issue_id'];
        }
        if (isset($map['purpose'])) {
            $model->purpose = $map['purpose'];
        }
        if (isset($map['use_time'])) {
            $model->useTime = $map['use_time'];
        }

        return $model;
    }
}
