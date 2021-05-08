<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class SaveCpfCertuseRequest extends Model
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

    // 身份证ID
    /**
     * @var string
     */
    public $dataOwnerIdentity;

    // 姓名
    /**
     * @var string
     */
    public $dataOwnerName;

    // 用数机构ID
    /**
     * @var string
     */
    public $dataUserIdentity;

    // 用数机构名称
    /**
     * @var string
     */
    public $dataUserName;

    // 用数端ID
    /**
     * @var string
     */
    public $terminalIdentity;

    // 用数目的
    /**
     * @var string
     */
    public $purpose;

    // 用数时间
    /**
     * @var string
     */
    public $operateTime;

    // 扩展字段
    /**
     * @var string
     */
    public $extendParams;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'dataOwnerIdentity' => 'data_owner_identity',
        'dataOwnerName'     => 'data_owner_name',
        'dataUserIdentity'  => 'data_user_identity',
        'dataUserName'      => 'data_user_name',
        'terminalIdentity'  => 'terminal_identity',
        'purpose'           => 'purpose',
        'operateTime'       => 'operate_time',
        'extendParams'      => 'extend_params',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('dataOwnerIdentity', $this->dataOwnerIdentity, true);
        Model::validateRequired('dataOwnerName', $this->dataOwnerName, true);
        Model::validateRequired('dataUserIdentity', $this->dataUserIdentity, true);
        Model::validateRequired('dataUserName', $this->dataUserName, true);
        Model::validateRequired('terminalIdentity', $this->terminalIdentity, true);
        Model::validateRequired('purpose', $this->purpose, true);
        Model::validateRequired('operateTime', $this->operateTime, true);
        Model::validatePattern('operateTime', $this->operateTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->dataOwnerIdentity) {
            $res['data_owner_identity'] = $this->dataOwnerIdentity;
        }
        if (null !== $this->dataOwnerName) {
            $res['data_owner_name'] = $this->dataOwnerName;
        }
        if (null !== $this->dataUserIdentity) {
            $res['data_user_identity'] = $this->dataUserIdentity;
        }
        if (null !== $this->dataUserName) {
            $res['data_user_name'] = $this->dataUserName;
        }
        if (null !== $this->terminalIdentity) {
            $res['terminal_identity'] = $this->terminalIdentity;
        }
        if (null !== $this->purpose) {
            $res['purpose'] = $this->purpose;
        }
        if (null !== $this->operateTime) {
            $res['operate_time'] = $this->operateTime;
        }
        if (null !== $this->extendParams) {
            $res['extend_params'] = $this->extendParams;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveCpfCertuseRequest
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
        if (isset($map['data_owner_identity'])) {
            $model->dataOwnerIdentity = $map['data_owner_identity'];
        }
        if (isset($map['data_owner_name'])) {
            $model->dataOwnerName = $map['data_owner_name'];
        }
        if (isset($map['data_user_identity'])) {
            $model->dataUserIdentity = $map['data_user_identity'];
        }
        if (isset($map['data_user_name'])) {
            $model->dataUserName = $map['data_user_name'];
        }
        if (isset($map['terminal_identity'])) {
            $model->terminalIdentity = $map['terminal_identity'];
        }
        if (isset($map['purpose'])) {
            $model->purpose = $map['purpose'];
        }
        if (isset($map['operate_time'])) {
            $model->operateTime = $map['operate_time'];
        }
        if (isset($map['extend_params'])) {
            $model->extendParams = $map['extend_params'];
        }

        return $model;
    }
}
