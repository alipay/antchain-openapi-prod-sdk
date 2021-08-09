<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class ListCpfDatauseRequest extends Model
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

    // 使用方ID
    /**
     * @var string
     */
    public $dataUserIdentity;

    // 用户身份证ID
    /**
     * @var string
     */
    public $dataOwnerIdentity;

    // 筛选时间，按月份筛选，默认当前月份
    /**
     * @var string
     */
    public $optionTime;

    // 数据类型
    /**
     * @var string
     */
    public $type;

    // 数据类型
    /**
     * @var string
     */
    public $dataCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'terminalIdentity'  => 'terminal_identity',
        'dataUserIdentity'  => 'data_user_identity',
        'dataOwnerIdentity' => 'data_owner_identity',
        'optionTime'        => 'option_time',
        'type'              => 'type',
        'dataCode'          => 'data_code',
    ];

    public function validate()
    {
        Model::validateRequired('dataUserIdentity', $this->dataUserIdentity, true);
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
        if (null !== $this->dataUserIdentity) {
            $res['data_user_identity'] = $this->dataUserIdentity;
        }
        if (null !== $this->dataOwnerIdentity) {
            $res['data_owner_identity'] = $this->dataOwnerIdentity;
        }
        if (null !== $this->optionTime) {
            $res['option_time'] = $this->optionTime;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->dataCode) {
            $res['data_code'] = $this->dataCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListCpfDatauseRequest
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
        if (isset($map['data_user_identity'])) {
            $model->dataUserIdentity = $map['data_user_identity'];
        }
        if (isset($map['data_owner_identity'])) {
            $model->dataOwnerIdentity = $map['data_owner_identity'];
        }
        if (isset($map['option_time'])) {
            $model->optionTime = $map['option_time'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['data_code'])) {
            $model->dataCode = $map['data_code'];
        }

        return $model;
    }
}
